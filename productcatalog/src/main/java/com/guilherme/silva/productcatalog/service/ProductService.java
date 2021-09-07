package com.guilherme.silva.productcatalog.service;

import com.guilherme.silva.productcatalog.model.Product;
import com.guilherme.silva.productcatalog.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product){
        return productRepository.save(product);  
    }

    public Product getProdcutById(Long id) throws Exception {
        return productRepository.findById(id)
                    .orElseThrow(()-> new Exception("Product not Found with id "+id));     
    }
}
