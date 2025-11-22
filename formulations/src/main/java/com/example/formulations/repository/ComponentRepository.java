package com.example.formulations.repository;




import com.example.formulations.model.Component;

import com.example.formulations.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ComponentRepository extends CrudRepository<Component, Integer> {

    List<Component> findByDescription(String description);

}
