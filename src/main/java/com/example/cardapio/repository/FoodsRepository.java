package com.example.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cardapio.entities.Foods;

@Repository
public interface FoodsRepository extends JpaRepository<Foods, Long>{
}
