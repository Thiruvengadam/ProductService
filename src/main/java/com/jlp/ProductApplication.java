package com.jlp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main class of our application
 * @author Thiruvengadam
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.jlp.controller")
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}