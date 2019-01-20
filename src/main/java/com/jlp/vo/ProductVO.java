package com.jlp.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
public class ProductVO {

    private String productId;

    private String title;

    private List<ColorSwatchVO> colorSwatches;

    private String nowPrice;

    private String priceLabel;

    @JsonIgnore
    private Float difference;


}
