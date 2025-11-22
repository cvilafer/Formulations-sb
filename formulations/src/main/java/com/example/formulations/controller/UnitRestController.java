package com.example.formulations.controller;

import com.example.formulations.model.Unit;
import com.example.formulations.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UnitRestController {

    @Autowired
    private UnitRepository unitRepository;

    @GetMapping("/units")
    public List<Unit> getAllUnits() {
        System.out.println("Units (rest controller api/units): " + unitRepository.findAll());
        return (List<Unit>) unitRepository.findAll();
    }
}
