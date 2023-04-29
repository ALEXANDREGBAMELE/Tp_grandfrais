package com.example.grandfrais.testunitaire.util;

import com.example.grandfrais.domaine.entites.Departement;
import com.example.grandfrais.domaine.entites.Personne;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PersonneMb {
    private Long id;
    private String nom;
    private String prenom;
    private int age;

    public PersonneMb setDepartement(Departement departement) {
        this.departement = departement;
        return this;

    }

    private Departement departement;

    public PersonneMb setId(Long id) {
        this.id = id;
        return this;
    }

    public PersonneMb setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public PersonneMb setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public PersonneMb setAge(int age) {
        this.age = age;
        return this;
    }

    public Personne build() {
        Personne personnemb = mock(Personne.class);
        when(personnemb.getId()).thenReturn(this.id);
        when(personnemb.getNom()).thenReturn(this.nom);
        when(personnemb.getPrenom()).thenReturn(this.prenom);
        when(personnemb.getAge()).thenReturn(this.age);
        when(personnemb.getDepartement()).thenReturn(this.departement);
        return personnemb;
    }
}

