package com.example.grandfrais.interfaces.controllers;

import com.example.grandfrais.application.VO.PersonneVO;
import com.example.grandfrais.domaine.entites.Personne;
import com.example.grandfrais.infrastructure.PersonneServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
@RequestMapping("/api/personne")
public class PersonneController {
    private final PersonneServiceImp personneService;
    public PersonneController(PersonneServiceImp personneService) {
        this.personneService = personneService;
    }

    @PostMapping("/add")
    public Personne addPersonne(@RequestBody PersonneVO personne) {
        return personneService.addPersonne(personne);
    }
    @GetMapping("/getAll")
    public List<Personne> getAllPersonne(){

        return personneService.getAllPersonne();
    }

    @GetMapping("/getById/{id}")
    public Optional<Personne> getPersonneById(@PathVariable("id") Long id){
        return personneService.getByIdPersonne(id);
    }
    @PutMapping("update/{id}")
    public Personne updatePersonne(@RequestBody Personne personne, Long id){
        return personneService.updatePersonne(personne,id);
    }
    @DeleteMapping("/delete/{id}")
    public Void deletePersonne(@PathVariable("id") Long id){
        return personneService.deletePersonne(id);
    }
}
