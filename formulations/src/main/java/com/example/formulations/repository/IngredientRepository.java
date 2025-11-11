package com.example.formulations.repository;




import org.springframework.data.repository.CrudRepository;
import com.example.formulations.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
}


