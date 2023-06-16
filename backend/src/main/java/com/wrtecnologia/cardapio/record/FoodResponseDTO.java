package com.wrtecnologia.cardapio.record;

import com.wrtecnologia.cardapio.entity.Food;

public record FoodResponseDTO(Long id, String title, String image, Double price) {

    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
