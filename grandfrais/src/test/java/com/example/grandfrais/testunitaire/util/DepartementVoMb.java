package com.example.grandfrais.testunitaire.util;

import com.example.grandfrais.application.VO.DepartementVO;
import com.example.grandfrais.domaine.entites.Departement;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DepartementVoMb {
    private String code;
    private String designation;

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public DepartementVO build(){
        DepartementVO departementVoMb = mock(DepartementVO.class);
        when(departementVoMb.getCode()).thenReturn(this.code);
        when(departementVoMb.getDesignation()).thenReturn(this.designation);
        return departementVoMb;
    }
}
