package com.guilherme.silva.cart.repository;

import com.guilherme.silva.cart.model.Cart;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
    
}
