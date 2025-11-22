package com.example.formulations.controller;

import com.example.formulations.model.Constraint;
import com.example.formulations.model.Formulation;
import com.example.formulations.repository.ConstraintRepository;
import com.example.formulations.repository.FormulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FormulationRestController {


    @Autowired
    private FormulationRepository formulationRepository;

    @GetMapping("/formulations")
    public List<Formulation> getAllUnits() {
        System.out.println("Formulations (rest formulation api/formulation): " + formulationRepository.findAll());
        return (List<Formulation>) formulationRepository.findAll();
    }

}
