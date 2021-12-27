package com.hatkhola.apigatewayservice;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RoutingConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/order/**")
                        .filters(f ->
                                f.circuitBreaker(h ->
                                        h.setFallbackUri("forward:/orderfallback")
                                ).retry(3)
                        )
                        .uri("lb://ORDER-SERVICE")
                )
                .route(r ->
                        r
                                .path("/product/**")
                                .filters(f ->
                                        f.circuitBreaker(h ->
                                                h.setFallbackUri("forward:/productfallback")
                                        ).retry(5)
                                )
                                .uri("lb://PRODUCT-SERVICE")
                )
                .route(r -> r.path("/customer/**")
                        .filters(f ->
                                f.circuitBreaker(h ->
                                        h.setFallbackUri("forward:/customerfallback")

                                ).retry(3)
                        )

                        .uri("lb://CUSTOMER-SERVICE")
                )
                .route(r -> r.path("/user/**")
                        .filters(f ->
                                f.circuitBreaker(h ->
                                        h.setFallbackUri("forward:/userfallback")

                                )
                        )

                        .uri("lb://USER-SERVICE")
                )
//                .route(r -> r.path("/CUSTOMER/**")
//                        .filters(f ->
//                                f.circuitBreaker(h->
//                                        h.setFallbackUri("forward:/userfallback")
//
//                                )
//                        )
//
//                        .uri("lb://USER-SERVICE")
//                )
                .build();
    }

}
