package com.myprojects.productservice.mapping;

import com.myprojects.productservice.domain.CreateProductCommand;
import com.myprojects.productservice.model.ProductEntity;

public class Mapper {

    public ProductEntity productMapping(CreateProductCommand command){
        ProductEntity productEntity=new ProductEntity(command.getProductId(),command.getProductName(),command.getCategory(),command.getOldPrice(),command.getNewPrice(), command.getCostPrice(),command.getQuantity(), command.getDetails(),command.getReview(), command.getImage());
        return productEntity;
    }
}
