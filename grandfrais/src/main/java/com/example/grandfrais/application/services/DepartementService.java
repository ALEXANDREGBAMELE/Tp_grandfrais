package com.example.grandfrais.application.services;

import com.example.grandfrais.application.VO.DepartementVO;
import com.example.grandfrais.domaine.entites.Departement;

import java.util.List;
import java.util.Optional;

public interface DepartementService {
    Departement addDepart(DepartementVO departement);

    List<Departement> getAllDapart();

    Optional<Departement> getByIdDepart(Long id);
    Departement updateDepart(Departement departement,Long id);
    Void deleteDepart(Long id);

}
