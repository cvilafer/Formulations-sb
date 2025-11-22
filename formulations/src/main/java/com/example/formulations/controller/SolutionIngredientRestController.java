package com.example.formulations.controller;

import com.example.formulations.model.SolutionIngredient;
import com.example.formulations.repository.SolutionIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SolutionIngredientRestController {

    @Autowired
    private SolutionIngredientRepository solutionIngredientRepository;

    @GetMapping("/solutionsingredients")
    public List<SolutionIngredient> getAllUnits() {
        System.out.println("solutionIngredients (rest controller api/solutionsingredients): " + solutionIngredientRepository.findAll());
        return (List<SolutionIngredient>) solutionIngredientRepository.findAll();
    }


}
