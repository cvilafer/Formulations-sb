package com.example.formulations.repository;




import com.example.formulations.model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import com.example.formulations.model.Formulation;

import java.util.List;

public interface FormulationRepository extends CrudRepository<Formulation, Integer> {

    List<Formulation> findByDescription(String description);

    List<Formulation> findById(int id);

}


