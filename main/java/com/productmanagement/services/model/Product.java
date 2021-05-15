package com.productmanagement.services.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
@Document
@Getter
@Setter
@NoArgsConstructor
public class Product {

    private String name;
    private String description;
    private List<String> visibleFields;
    private int price;
    private ProductType type;
}