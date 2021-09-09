package com.guilherme.silva.cart.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("cart")
public class Cart {
    
    @Id 
    private Integer id;

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.getItems().add(item);        
    }
}
