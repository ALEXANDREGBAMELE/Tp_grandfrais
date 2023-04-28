package com.example.grandfrais.interfaces.controllers;

import com.example.grandfrais.application.VO.DepartementVO;
import com.example.grandfrais.domaine.entites.Departement;
import com.example.grandfrais.infrastructure.DepartementServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
@RequestMapping("/api/departement")
public class DepartementController {
    private final DepartementServiceImp departementService;

    public DepartementController(DepartementServiceImp departementService) {
        this.departementService = departementService;
    }
    @PostMapping("/add")
    public Departement addDepart(@RequestBody DepartementVO departement){
        return departementService.addDepart(departement);
    }
    @GetMapping("/getAll")
    public List<Departement> getAllDepart(){
        return departementService.getAllDapart();
    }
    @GetMapping("/getById/{id}")
    public Optional<Departement> getByIdDepart(@PathVariable("id") Long id){
        return departementService.getByIdDepart(id);
    }
    @PutMapping("/update/{id}")
    public Departement updateDepart(@RequestBody Departement departement, Long id){
        return departementService.updateDepart(departement,id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteDepat(@PathVariable("id") Long id){
        departementService.deleteDepart(id);
    }



}
