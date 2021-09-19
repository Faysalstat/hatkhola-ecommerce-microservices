package com.myprojects.orderservice.domain;

import com.myprojects.orderservice.model.Order;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
public class OrderDomain {
    private String status;
    private List<Order> orderList;
    public OrderDomain(String status, List<Order> orderList) {
        this.status = status;
        this.orderList = orderList;
    }
}
