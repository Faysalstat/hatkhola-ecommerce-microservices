package com.myprojects.productservice.controller;

import com.myprojects.productservice.domain.CommandResponse;
import com.myprojects.productservice.domain.CreateProductCommand;
import com.myprojects.productservice.domain.ProductDomain;
import com.myprojects.productservice.mapping.Mapper;
import com.myprojects.productservice.model.Product;
import com.myprojects.productservice.model.ProductEntity;
import com.myprojects.productservice.service.ProductService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    @CrossOrigin(origins = "*")
    public ProductDomain getAllProduct()  {
        System.out.println("Hits : "+System.currentTimeMillis());
        List<ProductEntity> productList = productService.getAllProducts();
        ProductDomain productDomain = new ProductDomain();
        productDomain.setStatus("Success Message From Eureka");
        productDomain.setProductList(productList);
        return productDomain;
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) throws RuntimeException {
        System.out.println("Hits : "+System.currentTimeMillis());
        ResponseEntity<?> productList = ResponseEntity.ok(productService.findAllById(id)
                .map(ResponseEntity::ok)
                .orElseGet(ResponseEntity.noContent()::build));
        return productList;
//        throw new RuntimeException("BAM !  " +System.currentTimeMillis());
    }
    @GetMapping("/token")
    public ResponseEntity<?> getToken() throws RuntimeException {
        RestTemplate template = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        Map<String,String> map = new HashMap();
//        map.put("grant_type", "Password");
//        map.put("username", "admin");
//        map.put("password", "admin");
        headers.set("Content-Type", "application/json");
        HttpEntity entity = new HttpEntity(headers);
        ResponseEntity<?> response = template.exchange("AUTH-SERVICE/oauth/token?grant_type=password&username=admin&password=admin", HttpMethod.POST,entity, Object.class);
        return response;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createProduct(
            @RequestBody CreateProductCommand productCommand) {
        productService.save(new Mapper().productMapping(productCommand));
        return "Success";
    }
}
