package com.jlp.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import java.util.List;

/**
 * Response Value Object for our rest service
 * @author Thiruvengadam
 *
 */
@Data
public class ProductVO {

    private String productId;

    private String title;

    private List<ColorSwatchVO> colorSwatches;

    private String nowPrice;

    private String priceLabel;

    @JsonIgnore
    private Float difference;


}
