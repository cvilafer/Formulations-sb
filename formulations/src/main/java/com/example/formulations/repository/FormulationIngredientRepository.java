package com.example.formulations.repository;




import org.springframework.data.repository.CrudRepository;
import com.example.formulations.model.FormulationIngredient;

public interface FormulationIngredientRepository extends CrudRepository<FormulationIngredient, Integer> {
}


