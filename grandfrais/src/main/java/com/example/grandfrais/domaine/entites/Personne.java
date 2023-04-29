package com.example.grandfrais.domaine.entites;
import jakarta.persistence.*;

@Entity
@Table(name = "personne")
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "id")
    private Long id;
    private  String nom;
    private  String prenom;
    private  int age;
    @ManyToOne()
    @JoinColumn( name="id_departement" )
    private Departement departement;

    public Personne() {
    }

    public Personne(String nom, String prenom, int age, Departement departement) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.departement = departement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }


}