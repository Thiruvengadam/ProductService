package com.jlp.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.jlp.product.ProductsItem;
import com.jlp.vo.ColorSwatchVO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.jlp.product.ProductList;
import com.jlp.vo.ProductVO;

import java.util.*;
import java.util.function.Predicate;

/**
 * This is the controller class which will be invoked when /product is called
 * <br/> We are invoking the getProducts Rest API and business logic is implemented
 *  
 * @author Thiruvengadam
 *
 */

@RestController
public class ProductController {

    public static final String GET_PRODUCTS_URL = "https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma";
    public static final String POUND_SYMBOL = "£";
    public static final String FORMAT_NO_DECIMAL = "%.0f";
    public static final String SHOW_WAS_THEN_NOW = "ShowWasThenNow";
    public static final String SHOW_PERC_DSCOUNT = "ShowPercDscount";
    public static final String THEN = "then ";
    public static final String WAS = "Was ";
    public static final String COMMA = ", ";
    public static final String OFF = "% off, ";
    public static final String NOW = "now ";
    public static final String FORMAT_TWO_DECIMAL = "%.2f";
    public static final String TO = "to";
    public static final String BRACES = "{";
    public static final Map<String, String> COLOR_HEXADECIMAL_MAP = new HashMap<String, String>();

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    static {
        COLOR_HEXADECIMAL_MAP.put("Purple", "800080");
        COLOR_HEXADECIMAL_MAP.put("Grey", "808080");
        COLOR_HEXADECIMAL_MAP.put("Blue", "0000FF");
        COLOR_HEXADECIMAL_MAP.put("Red", "FF0000");
        COLOR_HEXADECIMAL_MAP.put("Yellow", "FFFF00");
    }

    @GetMapping("/product")
    public List<ProductVO> getPriceReducedProduct(@RequestParam(required = false) String labelType) {

        RestTemplate restTemplate = new RestTemplate();
        List<ProductVO> productVOList = new ArrayList<>();
        try {
            ProductList productList = restTemplate.getForObject(GET_PRODUCTS_URL, ProductList.class);
            productList.getProducts().parallelStream()
                    .filter(filterPrice())
                    .forEach(reducedPriceProduct -> setProductVO(labelType, productVOList, reducedPriceProduct));
            productVOList.sort(Comparator.comparing(ProductVO::getDifference).reversed());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return productVOList;
    }

    private static Predicate<ProductsItem> filterPrice() {
        return productItem -> (productItem.getPrice() != null && !StringUtils.isEmpty(productItem.getPrice().getWas()));
    }

    private void setProductVO(@RequestParam(required = false) String labelType, List<ProductVO> productVOList, ProductsItem reducedPriceProduct) {
        JsonNode now = reducedPriceProduct.getPrice().getNow();
        String nowPrc = StringUtils.isEmpty(now.asText()) ? now.toString() : now.asText();

        if(nowPrc.contains(BRACES)) {
            nowPrc = now.get(TO).asText();
        }

        String wasPrice = reducedPriceProduct.getPrice().getWas();
        ProductVO productVO = new ProductVO();
        productVO.setDifference(Float.parseFloat(wasPrice) - Float.parseFloat(nowPrc));

        productVO.setProductId(reducedPriceProduct.getProductId());

        productVO.setTitle(reducedPriceProduct.getTitle());

        List<ColorSwatchVO> colorSwatchVOS = getColorSwatchDetails(reducedPriceProduct);
        productVO.setColorSwatches(colorSwatchVOS);

        Float nowPriceInDecimal = Float.parseFloat(nowPrc);
        nowPrc = formatNowPrice(nowPriceInDecimal);
        productVO.setNowPrice(POUND_SYMBOL + nowPrc);

        StringBuilder priceLabel = framePriceLabel(labelType, reducedPriceProduct, nowPrc, wasPrice, nowPriceInDecimal);
        productVO.setPriceLabel(priceLabel.toString());

        productVOList.add(productVO);
    }

    private String formatNowPrice(Float nowPriceInDecimal) {
        String nowPrc;
        if(nowPriceInDecimal<10) {
            nowPrc  = String.format(FORMAT_TWO_DECIMAL, nowPriceInDecimal);
        } else {
            nowPrc = String.format(FORMAT_NO_DECIMAL, nowPriceInDecimal);
        }
        return nowPrc;
    }

    private List<ColorSwatchVO> getColorSwatchDetails(ProductsItem reducedPriceProduct) {
        List<ColorSwatchVO> colorSwatchVOS = new ArrayList<>();
        reducedPriceProduct.getColorSwatches().stream()
                .forEach(colorSwatch -> {
                    ColorSwatchVO colorSwatchVO = new ColorSwatchVO();
                    colorSwatchVO.setColor(colorSwatch.getColor());
                    colorSwatchVO.setRgbColor(StringUtils.isEmpty(COLOR_HEXADECIMAL_MAP.get(colorSwatch.getBasicColor())) ?
                            colorSwatch.getBasicColor() :  COLOR_HEXADECIMAL_MAP.get(colorSwatch.getBasicColor()));
                    colorSwatchVO.setSkuid(colorSwatch.getSkuId());
                    colorSwatchVOS.add(colorSwatchVO);
                });
        return colorSwatchVOS;
    }

    private StringBuilder framePriceLabel(@RequestParam(required = false) String labelType, ProductsItem reducedPriceProduct, String nowPrc, String wasPrice, Float nowPriceInDecimal) {
        StringBuilder priceLabel = new StringBuilder();
        priceLabel = priceLabel.append(WAS);
        priceLabel = priceLabel.append(POUND_SYMBOL).append(wasPrice).append(COMMA);

        String thenPrice = StringUtils.isEmpty(reducedPriceProduct.getPrice().getThen2()) ?
                reducedPriceProduct.getPrice().getThen1() : reducedPriceProduct.getPrice().getThen2();

        if(!StringUtils.isEmpty(labelType)) {
            if (labelType.equalsIgnoreCase(SHOW_WAS_THEN_NOW) && !StringUtils.isEmpty(thenPrice)) {
                priceLabel = priceLabel.append(THEN);
                priceLabel = priceLabel.append(POUND_SYMBOL).append(thenPrice).append(COMMA);
            } else if (labelType.equalsIgnoreCase(SHOW_PERC_DSCOUNT)) {
                Float wasInDecimal = Float.parseFloat(wasPrice);
                Float percentage = ((wasInDecimal - nowPriceInDecimal)/wasInDecimal)*100;
                priceLabel = new StringBuilder();
                priceLabel = priceLabel.append(String.format(FORMAT_NO_DECIMAL,percentage)).append(OFF);
            }
        }
        priceLabel = priceLabel.append(NOW);
        priceLabel = priceLabel.append(POUND_SYMBOL).append(nowPrc);
        return priceLabel;
    }
}
