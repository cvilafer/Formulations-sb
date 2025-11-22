package com.example.formulations.controller;

import com.example.formulations.model.Composition;
import com.example.formulations.model.Unit;
import com.example.formulations.repository.CompositionRepository;
import com.example.formulations.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CompositionRestController {

    @Autowired
    private CompositionRepository compositionRepository;

    @GetMapping("/compositions")
    public List<Composition> getAllUnits() {
        System.out.println("Compositions (rest controller api/compositions): " + compositionRepository.findAll());
        return (List<Composition>) compositionRepository.findAll();
    }


}
