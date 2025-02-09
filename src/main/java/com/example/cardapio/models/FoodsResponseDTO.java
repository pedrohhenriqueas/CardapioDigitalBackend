package com.example.cardapio.models;

import com.example.cardapio.entities.Foods;

public record FoodsResponseDTO(Long id, String title, String image, Integer price) {

	public FoodsResponseDTO(Foods food) {
		this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
	}
}
