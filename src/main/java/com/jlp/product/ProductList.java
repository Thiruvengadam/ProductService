package com.jlp.product;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
/**
 * A wrapper class for the ProductsItem list, this is required as we are mapping a list of products
 * @author Thiruvengadam
 *
 */
@Getter@Setter
public class ProductList {

    List<ProductsItem> products;
}
