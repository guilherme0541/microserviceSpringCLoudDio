package com.guilherme.silva.productcatalog.service;

import java.util.ArrayList;
import java.util.List;

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
        return productExists(id);
    }

    public List<Product> getAllProducts() {
        List<Product> items = new ArrayList<>();
        productRepository.findAll().forEach(items::add);
        return items;
    }

    public Product updateProductById(Long id, Product product) throws Exception {
        productExists(id);
        return productRepository.save(product); 
    }

    public void deleteById(Long id) throws Exception {
        productExists(id);
        productRepository.deleteById(id);
    }
    
    private Product productExists(Long id) throws Exception {
        return productRepository.findById(id)
        .orElseThrow(()-> new Exception("Product not Found with id "+id));
    }
}
