package com.example.Tarea1.services.impl;

import com.example.Tarea1.dto.response.MetalsResponse;
import com.example.Tarea1.entites.Metals;
import com.example.Tarea1.repositories.MetalsRepository;
import com.example.Tarea1.services.interfaces.IMetalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MetalsServicelmpl implements IMetalsService {
    @Autowired
    private MetalsRepository repository;

    @Override
    public MetalsResponse getMetalsById(Long id){
        return from(repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encuentra")));
    }

    private MetalsResponse from(Metals metals){
        MetalsResponse response = new MetalsResponse();
        response.setId(metals.getId());
        response.setNameM(metals.getNameM());
        response.setWeight(metals.getWeight());
        return response;

    }
    public List<Metals> getMetals(){
        return repository.findAll();
    }

    public Metals saveMetals  (Metals metal) {
        return  repository.save(metal);
    }
}
