package com.myprojects.productservice.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class CreateProductCommand {
    private Long id;
    private String productId;
    private String productName;
    private String category;
    private Double oldPrice;
    private Double newPrice;
    private Double costPrice;
    private Integer quantity;
    private String details;
    private Integer review;
    private String image;
}
