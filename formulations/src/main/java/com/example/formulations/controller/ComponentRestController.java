package com.example.formulations.controller;

import com.example.formulations.model.Component;
import com.example.formulations.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ComponentRestController {

    @Autowired
    private ComponentRepository componentRepository;

    @GetMapping("/components")
    public List<Component> getAllUnits() {
        System.out.println("Components (rest controller api/components): " + componentRepository.findAll());
        return (List<Component>) componentRepository.findAll();
    }



}
