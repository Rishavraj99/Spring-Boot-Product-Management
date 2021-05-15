package com.productmanagement.services.model;

import com.productmanagement.services.model.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document
@Getter
@Setter
@NoArgsConstructor
class Solar extends Product {

    private int PhaseType;
    private int PowerRating;
    private List<String> manufacturers;
}
