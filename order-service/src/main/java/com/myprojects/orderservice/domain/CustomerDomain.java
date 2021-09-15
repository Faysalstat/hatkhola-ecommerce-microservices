package com.myprojects.orderservice.domain;



import com.myprojects.orderservice.model.Customer;

import java.util.List;

public class CustomerDomain {
    private String status;
    private List<Customer> customerList;

    public CustomerDomain() {

    }

    public CustomerDomain(String status, List<Customer> customerList) {
        this.status = status;
        this.customerList = customerList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
