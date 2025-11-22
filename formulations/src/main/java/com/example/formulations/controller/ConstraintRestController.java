package com.example.formulations.controller;

import com.example.formulations.model.Constraint;

import com.example.formulations.repository.ConstraintRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ConstraintRestController {

    @Autowired
    private ConstraintRepository constraintRepository;

    @GetMapping("/constraints")
    public List<Constraint> getAllUnits() {
        System.out.println("Constraints (rest constraint api/constraint): " + constraintRepository.findAll());
        return (List<Constraint>) constraintRepository.findAll();
    }



}
