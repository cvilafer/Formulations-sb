package com.example.formulations.controller;


import com.example.formulations.model.Solution;
import com.example.formulations.repository.SolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SolutionRestController {

    @Autowired
    private SolutionRepository solutionRepository;

    @GetMapping("/solutions")
    public List<Solution> getAllUnits() {
        System.out.println("Solutions (rest controller api/solutions): " + solutionRepository.findAll());
        return (List<Solution>) solutionRepository.findAll();
    }

}
