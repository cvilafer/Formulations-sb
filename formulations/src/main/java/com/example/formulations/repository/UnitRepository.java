package com.example.formulations.repository;




import org.springframework.data.repository.CrudRepository;
import com.example.formulations.model.Unit;

import java.util.List;

public interface UnitRepository extends CrudRepository<Unit, Integer> {

    List<Unit> findByDescription(String description);

}
