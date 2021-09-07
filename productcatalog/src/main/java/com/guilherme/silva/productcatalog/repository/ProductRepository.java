package com.guilherme.silva.productcatalog.repository;


import com.guilherme.silva.productcatalog.model.Product;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface ProductRepository extends ElasticsearchRepository<Product, Long> {
    
}
