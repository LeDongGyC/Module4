package com.example.cart.dto;

import java.util.HashMap;
import java.util.Map;

public class CartDto {
    private Map<ProductDto, Integer> map = new HashMap<>();

    public CartDto() {
    }

    public CartDto(Map<ProductDto, Integer> map) {
        this.map = map;
    }

    public Map<ProductDto, Integer> getMap() {
        return map;
    }

    public void setMap(Map<ProductDto, Integer> map) {
        this.map = map;
    }

    public void addProduct(ProductDto productDto) {
        if (map.containsKey(productDto)) {
            Integer currentValue = map.get(productDto);
            map.replace(productDto, currentValue + 1);
        } else {
            map.put(productDto, 1);
        }
    }
}
