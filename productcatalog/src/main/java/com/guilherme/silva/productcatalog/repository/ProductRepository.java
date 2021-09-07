package com.guilherme.silva.productcatalog.repository;

import com.guilherme.silva.productcatalog.model.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
