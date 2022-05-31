package com.example.Tarea1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Tarea1.dto.response.MetalsResponse;
import com.example.Tarea1.entites.Metals;
import com.example.Tarea1.services.interfaces.IMetalsService;

import java.util.List;

@RestController
@RequestMapping("metals")


public class MetalsController {
    @Autowired
    private IMetalsService service;

    @CrossOrigin("*")
    @GetMapping("")
    public List<Metals> listMetals() {
        return service.getMetals();
    }

    @GetMapping("{id}")
    public MetalsResponse get(@PathVariable Long id){return service.getMetalsById(id);}

    @PostMapping()
    public Metals saveFabric(@RequestBody Metals metals) {
        return service.saveMetals(metals);
    }
}
