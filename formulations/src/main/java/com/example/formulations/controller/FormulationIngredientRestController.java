package com.example.formulations.controller;

import com.example.formulations.model.FormulationIngredient;

import com.example.formulations.repository.FormulationIngredientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FormulationIngredientRestController {

    @Autowired
    private FormulationIngredientRepository formulationIngredientRepository;

    @GetMapping("/formulationingredients")
    public List<FormulationIngredient> getAllUnits() {
        System.out.println("FormulationIngredients (rest formulationingredient api/formulationingredient): " + formulationIngredientRepository.findAll());

        List<FormulationIngredient> llista=(List<FormulationIngredient>) formulationIngredientRepository.findAll();

        for(FormulationIngredient f:llista) {

            System.out.println(f.getFormulation().getDescription());
            System.out.println(f.getIngredient().getDescription());
        }


        return (List<FormulationIngredient>) formulationIngredientRepository.findAll();
    }


}
