package com.guilherme.silva.cart.repository;

import com.guilherme.silva.cart.model.Cart;

import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
    
}
