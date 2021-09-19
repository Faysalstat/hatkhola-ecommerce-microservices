package com.myprojects.orderservice.clientServices;

import com.myprojects.orderservice.domain.ProductDomain;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


public interface ProductClientService {

    ProductDomain getProducts(@PathVariable long userId);

    ProductDomain getProductFallback(@PathVariable long userId);
}
