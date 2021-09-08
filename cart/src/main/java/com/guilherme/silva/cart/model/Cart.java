package com.guilherme.silva.cart.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@Data 
@RedisHash("cart")
public class Cart {
    
    @Id 
    private Integer id;

    private List<Item> items;
}
