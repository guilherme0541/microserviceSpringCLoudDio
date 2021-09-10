package com.guilherme.silva.productcatalog.controller;

import java.util.List;

import com.guilherme.silva.productcatalog.model.Product;
import com.guilherme.silva.productcatalog.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Product create(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Product getProdcutById(@PathVariable("id") Long id) throws Exception{
        return productService.getProdcutById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Product updateProductById(@PathVariable("id") Long id, @RequestBody Product product) throws Exception{
        return productService.updateProductById(id, product);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteById(@PathVariable("id") Long id) throws Exception{
        productService.deleteById(id);
    }
}
