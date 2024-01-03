package com.example.lugaresturist.entity;

import com.example.lugaresturist.Rating;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    private int id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
    private Rating rating;

}