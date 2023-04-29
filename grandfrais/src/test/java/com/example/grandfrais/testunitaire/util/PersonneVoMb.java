package com.example.grandfrais.testunitaire.util;

import com.example.grandfrais.application.VO.PersonneVO;
import com.example.grandfrais.domaine.entites.Departement;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PersonneVoMb {
    private String nom;
    private String prenom;
    private int age;
    Departement departement;

    public PersonneVoMb setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public PersonneVoMb setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public PersonneVoMb setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonneVoMb setDepartement(Departement departement) {
        this.departement = departement;
        return this;
    }

    public PersonneVO build(){
        PersonneVO personneVOmb = mock(PersonneVO.class);
        when(personneVOmb.getNom()).thenReturn(this.nom);
        when(personneVOmb.getPrenom()).thenReturn(this.prenom);
        when(personneVOmb.getAge()).thenReturn(this.age);
        when(personneVOmb.getDepartement()).thenReturn(this.departement);
        return personneVOmb;
    }

    public DepartementMb setDepartment(Departement departement) {
        this.departement = departement;
        return null;
    }
}
