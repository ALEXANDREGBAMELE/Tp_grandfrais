package com.example.grandfrais.infrastructure;

import com.example.grandfrais.application.VO.PersonneVO;
import com.example.grandfrais.application.services.PersonneService;
import com.example.grandfrais.domaine.entites.Personne;
import com.example.grandfrais.domaine.repository.PersonneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonneServiceImp implements PersonneService {
    private final PersonneRepository personneRepository;

    public PersonneServiceImp(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    @Override
    public Personne addPersonne(PersonneVO personne) {
        Personne personne1 = new  Personne();
        personne1.setNom(personne.getNom());
        personne1.setPrenom(personne.getPrenom());
        personne1.setAge(personne.getAge());
        personne1.setDepartement(personne.getDepartement());
        return personneRepository.save(personne1);
    }


    @Override
    public List<Personne> getAllPersonne() {
        return personneRepository.findAll();
    }

    @Override
    public Optional<Personne> getByIdPersonne(Long id) {
        return personneRepository.findById(id);
    }

    @Override
    public Personne updatePersonne(Personne personne,Long id) {
        return personneRepository.findById(personne.getId())
                .map(personne1 -> {
                    personne1.setNom(personne.getNom());
                    personne1.setPrenom(personne.getPrenom());
                    personne1.setAge(personne.getAge());
                    personne1.setDepartement(personne.getDepartement());
            return personneRepository.save(personne1);
        }).orElseThrow(() -> new RuntimeException("No found !"));
    }


    @Override
    public Void deletePersonne(Long id) {
        personneRepository.deleteById(id);
        return null;
    }
}
