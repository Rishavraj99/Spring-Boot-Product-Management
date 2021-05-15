package com.productmanagement.services.service;

import com.productmanagement.services.model.Product;
import com.productmanagement.services.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {


    @Autowired
    private ProductRepository repository;

    public void saveProduct(Product product) {
        repository.save(product);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public List<Product> getAllProductByType(String type) {
        final var collect = getAllProducts().stream().filter(product-> product.equals(type)).collect(Collectors.toList());
        return collect;
    }
}
