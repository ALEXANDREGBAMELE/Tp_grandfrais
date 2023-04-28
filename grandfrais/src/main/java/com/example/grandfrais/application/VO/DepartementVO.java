package com.example.grandfrais.application.VO;

import jakarta.persistence.Column;

public class DepartementVO {
    @Column(name = "code")
    private String code;
    @Column(name = "designation" )
    private String designation;

    public DepartementVO() {
    }

    public DepartementVO(String code, String designation) {
        this.code = code;
        this.designation = designation;
    }

    public String getCode() {
        return code;
    }

    public String getDesignation() {
        return designation;
    }
}
