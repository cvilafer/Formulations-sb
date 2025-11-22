package com.example.formulations.controller;

import com.example.formulations.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IngredientController {


    @Autowired
    IngredientRepository ingredientRepository;


    @GetMapping("/ingredients")
    public String listIngredients(Model model) {
        model.addAttribute("ingredients", ingredientRepository.findAll());
        model.addAttribute("totalIngredients", ingredientRepository.count());
        //System.out.println("Cars (controller/cars): " + carRepository.findAll());
        return "ingredients";
    }



}
