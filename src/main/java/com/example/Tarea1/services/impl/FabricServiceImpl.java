package com.example.Tarea1.services.impl;

import com.example.Tarea1.dto.response.FabricResponse;
import com.example.Tarea1.entites.Fabric;
import com.example.Tarea1.repositories.FabricRepository;
import com.example.Tarea1.services.interfaces.IFabricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FabricServiceImpl implements IFabricService {
    @Autowired
    private FabricRepository repository;


    @Override
    public FabricResponse<Fabric> getFabricById(Long id){
        return from(repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encuentra")));
    }

    private FabricResponse<Fabric> from(Fabric fabric){
        FabricResponse<Fabric> response = new FabricResponse();
        response.setId(fabric.getId());
        response.setNameF(fabric.getNameF());
        response.setColor(fabric.getColor());
        response.setWidth(fabric.getWidth());
        response.setMeter(fabric.getMeter());
        return response;

    }
    public List<Fabric> getFabric(){
        return repository.findAll();
    }


    public Fabric saveFabric (Fabric fabri) {
        return  repository.save(fabri);
    }

    @Override
    public boolean deleteFabricById(Long id) {
        return false;
    }


    public boolean deleteFabricpById(Long id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
