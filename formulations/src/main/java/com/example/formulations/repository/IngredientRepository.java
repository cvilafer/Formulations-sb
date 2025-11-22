package com.example.formulations.repository;




import com.example.formulations.model.Unit;
import org.springframework.data.repository.CrudRepository;
import com.example.formulations.model.Ingredient;

import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

    List<Ingredient> findByDescription(String description);

}


