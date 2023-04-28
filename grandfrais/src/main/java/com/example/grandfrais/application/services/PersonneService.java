package com.example.grandfrais.application.services;

import com.example.grandfrais.application.VO.PersonneVO;
import com.example.grandfrais.domaine.entites.Personne;

import java.util.List;
import java.util.Optional;

public interface PersonneService {

    Personne addPersonne(PersonneVO personne);


    List<Personne> getAllPersonne();

    Optional<Personne> getByIdPersonne(Long id);
    Personne updatePersonne(Personne personne,Long id);
    Void deletePersonne(Long id);
}
