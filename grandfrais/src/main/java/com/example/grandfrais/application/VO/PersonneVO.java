package com.example.grandfrais.application.VO;

import com.example.grandfrais.domaine.entites.Departement;

public class PersonneVO {
    private  String nom;
    private  String prenom;
    private  int age;

    private Departement departement;

    public PersonneVO() {
    }

    public PersonneVO(String nom, String prenom, int age,Departement departement) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.departement = departement;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public Departement getDepartement() {
        return departement;
    }
}




