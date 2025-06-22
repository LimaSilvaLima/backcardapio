package com.backcardapio.cardapio.food;

public record FoodRequestDTO(
    String title,
    String image,
    Integer price
) {

}
