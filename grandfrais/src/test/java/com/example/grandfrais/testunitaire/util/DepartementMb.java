package com.example.grandfrais.testunitaire.util;

import com.example.grandfrais.domaine.entites.Departement;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DepartementMb {
    private Long id;

    private String code;
    private String designation;

    public DepartementMb setId(Long id) {
        this.id = id;
        return this;
    }

    public DepartementMb setCode(String code) {
        this.code = code;
        return this;
    }

    public DepartementMb setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public Departement build(){
        Departement departementmb = mock(Departement.class);
        when(departementmb.getId()).thenReturn(this.id);
        when(departementmb.getCode()).thenReturn(this.code);
        when(departementmb.getDesignation()).thenReturn(this.designation);
        return departementmb;
    }

}
