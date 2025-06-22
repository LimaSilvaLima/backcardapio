package com.backcardapio.cardapio.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backcardapio.cardapio.food.Food;
import com.backcardapio.cardapio.food.FoodRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<Food> getAll() {
        
        List<Food> foodList = repository.findAll();
        return foodList;
    }
    

}
