package com.example.Tarea1.services.interfaces;

import com.example.Tarea1.dto.response.MetalsResponse;
import com.example.Tarea1.entites.Metals;

import java.util.List;

public interface IMetalsService {
    MetalsResponse getMetalsById(Long id);

    List<Metals> getMetals();

    Metals saveMetals(Metals metals);
}
