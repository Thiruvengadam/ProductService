package com.jlp.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import java.util.List;

@Data
public class ProductVO {

    private String productId;

    private String title;

    private List<ColorSwatchVO> colorSwatches;

    private String nowPrice;

    private String priceLabel;

    private Float difference;


}
