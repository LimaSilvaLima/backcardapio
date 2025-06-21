package com.backcardapio.cardapio.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/foods")
public class FoodController {

    @GetMapping("")
    public void getAll() {
        
    }
    

}
