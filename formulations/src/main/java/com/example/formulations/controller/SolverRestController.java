package com.example.formulations.controller;

import com.example.formulations.managers.Solver;
import com.example.formulations.model.Formulation;
import com.example.formulations.repository.FormulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SolverRestController {

    @Autowired
    private Solver solver;

    @Autowired
    private FormulationRepository formulationRepository;

    @GetMapping("/solver/{id}")
    public void Solver(@PathVariable Integer id) {



        Formulation formulation=formulationRepository.findById(id).get();

        solver.resoldre_formulacio(formulation);
    }






}
