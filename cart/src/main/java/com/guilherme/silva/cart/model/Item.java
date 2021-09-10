package com.guilherme.silva.cart.model;

import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("item")
public class Item {

    private Integer productId;

    private Integer amount;
    
}
