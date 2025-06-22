package com.backcardapio.cardapio.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backcardapio.cardapio.food.Food;
import com.backcardapio.cardapio.food.FoodRepository;
import com.backcardapio.cardapio.food.FoodRequestDTO;
import com.backcardapio.cardapio.food.FoodResponseDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodRepository repository;

    
    @PostMapping("path")
    public void saveFood(@RequestBody FoodRequestDTO data){

    }


    @GetMapping
    public List<FoodResponseDTO> getAll() {
        
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }


    

}
