package com.example.Tarea1.repositories;

import com.example.Tarea1.entites.Metals;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MetalsRepository extends CrudRepository <Metals, Long> {
    List<Metals> findAll();

}
