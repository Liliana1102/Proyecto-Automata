package com.example.Tarea1.controller;

import com.example.Tarea1.dto.response.FabricResponse;
import com.example.Tarea1.entites.Fabric;
import com.example.Tarea1.services.interfaces.IFabricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("fabric")
public class FabricController {
    @Autowired
    private IFabricService service;

    @CrossOrigin("*")
    @GetMapping("")
    public List<Fabric> listFabric() {
        return service.getFabric();
    }

    @GetMapping("{id}")
    public FabricResponse<Fabric> get(@PathVariable Long id){return service.getFabricById(id);}

    @PostMapping()
    public Fabric saveFabric(@RequestBody Fabric fabric) {
        return service.saveFabric(fabric);
    }

    @DeleteMapping("{id}")
    public String deleteFabricId(@PathVariable("id") Long id) {
        boolean ok = service.deleteFabricById(id);
        if (ok) {
            return "Se elimino ID: " + id;
        } else {
            return "No se puede el ID " + id + "No se encuentra";
        }
    }



}
