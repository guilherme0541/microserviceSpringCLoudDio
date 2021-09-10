package com.guilherme.silva.cart.controller;

import com.guilherme.silva.cart.model.Cart;
import com.guilherme.silva.cart.model.Item;
import com.guilherme.silva.cart.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    
    @Autowired
    private CartService cartService;

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    Cart addItem(@PathVariable("id") Integer id, @RequestBody Item item){
        return cartService.addItem(id, item);
    }

    @GetMapping("/{id}")
    public Cart findById(@PathVariable("id") Integer id) throws Exception{
        return cartService.getCart(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void clearCart(@PathVariable("id") Integer id){
        cartService.clearCart(id);
    }
}
