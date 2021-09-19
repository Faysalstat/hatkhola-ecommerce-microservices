package com.hatkhola.apigatewayservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/orderfallback")
    public Mono<String> ordersFallBack() {
        return Mono.just("Order Service is down");
    }
    @RequestMapping("/productfallback")
    public Mono<String> productFallback() {
        return Mono.just("Product Service is down");
    }
    @RequestMapping("/customerfallback")
    public Mono<String> customerFallback() {
        return Mono.just("Customer Service is down");
    }
    @RequestMapping("/userfallback")
    public Mono<String> userFallback() {
        return Mono.just("User Service is down");
    }
}
