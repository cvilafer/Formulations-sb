package com.example.formulations.repository;




import org.springframework.data.repository.CrudRepository;
import com.example.formulations.model.Constraint;

public interface ConstraintRepository extends CrudRepository<Constraint, Integer> {
}
