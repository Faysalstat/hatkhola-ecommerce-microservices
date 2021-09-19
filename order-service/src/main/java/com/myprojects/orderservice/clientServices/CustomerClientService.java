package com.myprojects.orderservice.clientServices;

import com.myprojects.orderservice.domain.CustomerDomain;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


public interface CustomerClientService {

    CustomerDomain getCustomers(@PathVariable long userId);

    CustomerDomain getCustomerFallback(@PathVariable long userId);
}
