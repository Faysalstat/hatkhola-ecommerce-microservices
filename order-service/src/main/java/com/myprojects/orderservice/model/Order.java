package com.myprojects.orderservice.model;

import com.myprojects.orderservice.domain.CustomerDomain;
import com.myprojects.orderservice.domain.ProductDomain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class Order {
    private long id;
    private CustomerDomain customer;
    private ProductDomain product;
    private int quantity;
}
