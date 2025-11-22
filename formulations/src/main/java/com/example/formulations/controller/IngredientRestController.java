package com.example.formulations.controller;

import com.example.formulations.model.Ingredient;
import com.example.formulations.model.Unit;
import com.example.formulations.repository.IngredientRepository;
import com.example.formulations.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IngredientRestController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("/ingredients")
    public List<Ingredient> getAllUnits() {
        System.out.println("Ingredients (rest controller api/ingredients): " + ingredientRepository.findAll());
        return (List<Ingredient>) ingredientRepository.findAll();
    }



}
