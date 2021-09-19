package com.myprojects.orderservice.domain;



import com.myprojects.orderservice.model.Customer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
public class CustomerDomain {
    private String status;
    private List<Customer> customerList;
    public CustomerDomain(String status, List<Customer> customerList) {
        this.status = status;
        this.customerList = customerList;
    }
}
