package com.guilherme.silva.productcatalog.repository;


import com.guilherme.silva.productcatalog.model.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
