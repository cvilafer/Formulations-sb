package com.example.formulations.repository;




import org.springframework.data.repository.CrudRepository;
import com.example.formulations.model.Solution;

public interface SolutionRepository extends CrudRepository<Solution, Integer> {
}
