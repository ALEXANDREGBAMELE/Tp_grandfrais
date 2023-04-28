package com.example.grandfrais.domaine.entites;

import jakarta.persistence.*;
@Entity
@Table(name = "departement")
    public class Departement {
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO,generator ="id" )
        private Long id;
        @Column(name = "code")
        private String code;
        @Column(name = "designation" )
        private String designation;

    public Departement() {
    }

    public Departement(Long id, String code, String designation) {
        this.id = id;
        this.code = code;
        this.designation = designation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

