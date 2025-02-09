package com.example.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.entities.Foods;
import com.example.cardapio.models.FoodsRequestDTO;
import com.example.cardapio.models.FoodsResponseDTO;
import com.example.cardapio.repository.FoodsRepository;

@RestController
@RequestMapping("/foods")
public class FoodsController {
	
	@Autowired
	private FoodsRepository foodRepository;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping
	public void saveFood(
			@RequestBody FoodsRequestDTO body) {
		Foods food = new Foods(body);
		foodRepository.save(food);
		return;
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")

	@GetMapping
	public List<FoodsResponseDTO> getall() {
		
		List<FoodsResponseDTO> foodList = foodRepository.findAll().stream().map(FoodsResponseDTO::new).toList();
		return foodList;
	}
}
