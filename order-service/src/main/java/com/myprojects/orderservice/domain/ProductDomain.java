package com.myprojects.orderservice.domain;



import com.myprojects.orderservice.model.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
public class ProductDomain {
    private String status;
    private List<Product> productList;
    public ProductDomain(String status, List<Product> productList) {
        this.status = status;
        this.productList = productList;
    }
}
