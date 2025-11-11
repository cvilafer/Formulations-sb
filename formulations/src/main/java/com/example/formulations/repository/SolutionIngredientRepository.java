package com.example.formulations.repository;




import org.springframework.data.repository.CrudRepository;
import com.example.formulations.model.SolutionIngredient;

public interface SolutionIngredientRepository extends CrudRepository<SolutionIngredient, Integer> {
}
