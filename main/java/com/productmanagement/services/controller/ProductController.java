package com.productmanagement.services.controller;

import com.productmanagement.services.model.Product;
import com.productmanagement.services.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private  ProductService service;

    @PostMapping(value ="/products")
    public void addProduct(@RequestBody Product product) {
        service.saveProduct(product);
    }

    @GetMapping(value = "/product")
    public List<Product> findAllProductByType(@RequestParam("type") String type) {
        return service.getAllProductByType(type);
    }
}



