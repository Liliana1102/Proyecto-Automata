package com.example.Tarea1.services.interfaces;

import com.example.Tarea1.dto.response.FabricResponse;
import com.example.Tarea1.entites.Fabric;

import java.util.List;

public interface IFabricService {
    FabricResponse<Fabric> getFabricById(Long id);

    List<Fabric> getFabric();

    Fabric saveFabric(Fabric fabric);

    boolean deleteFabricById(Long id);
}
