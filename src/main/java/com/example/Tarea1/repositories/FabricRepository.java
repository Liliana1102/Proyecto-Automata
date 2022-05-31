package com.example.Tarea1.repositories;

import com.example.Tarea1.entites.Fabric;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FabricRepository extends CrudRepository <Fabric, Long> {
    List<Fabric> findAll();
}
