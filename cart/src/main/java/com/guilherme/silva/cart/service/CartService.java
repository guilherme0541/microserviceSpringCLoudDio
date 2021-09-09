package com.guilherme.silva.cart.service;

import java.util.Optional;

import com.guilherme.silva.cart.exception.CartNotFoundException;
import com.guilherme.silva.cart.model.Cart;
import com.guilherme.silva.cart.model.Item;
import com.guilherme.silva.cart.repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart addItem(Integer id, Item item) {
        
        Optional<Cart> savedCart = cartRepository.findById(id);
        Cart cart;
        if (savedCart.equals(Optional.empty())) {
            cart = new Cart();
            cart.setId(id);
        } else {
            cart = savedCart.get();
        }
        System.out.println(item.getClass());
        cart.addItem(item);
        System.out.println(item);
        return cartRepository.save(cart);
    }

    public Cart getCart(Integer id) throws Exception {
        return cartRepository.findById(id)
                    .orElseThrow(()-> new CartNotFoundException("Not Found Cart with id "+id));
    }

    public void clearCart(Integer id) {
        cartRepository.deleteById(id);
    }

   
    
}
