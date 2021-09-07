package com.guilherme.silva.productcatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Document(indexName = "products")
@Data
public class Product {
    
    @Id
    private Long id;

    private String name;

    private Integer amount;
}
