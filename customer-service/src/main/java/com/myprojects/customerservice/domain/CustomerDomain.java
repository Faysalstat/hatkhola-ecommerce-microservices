package com.myprojects.customerservice.domain;

import com.myprojects.customerservice.model.Customer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class CustomerDomain {
    private String status;
    private List<Customer> customerList;
}
