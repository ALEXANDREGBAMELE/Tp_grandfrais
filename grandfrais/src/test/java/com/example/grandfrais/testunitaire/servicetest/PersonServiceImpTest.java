package com.example.grandfrais.testunitaire.servicetest;

import com.example.grandfrais.application.VO.PersonneVO;
import com.example.grandfrais.application.services.PersonneService;
import com.example.grandfrais.domaine.entites.Departement;
import com.example.grandfrais.domaine.entites.Personne;
import com.example.grandfrais.domaine.repository.DepartementRepository;
import com.example.grandfrais.domaine.repository.PersonneRepository;
import com.example.grandfrais.testunitaire.util.DepartementMb;
import com.example.grandfrais.testunitaire.util.PersonneMb;
import com.example.grandfrais.testunitaire.util.PersonneVoMb;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class PersonServiceImpTest {

    @Mock
    private PersonneRepository personneRepository;
    @Mock
    private DepartementRepository departementRepository;
    @InjectMocks
    private PersonneService personneService;

    //construire un objet Departement
    Long id_department = 1L;
    String code = "AB-001";
    String designation = "Abidjan";
    Departement departement = new DepartementMb()
            .setId(id_department)
            .setCode(code)
            .setDesignation(designation)
            .build();

    Personne personne = new PersonneMb()
            .setId(1L)
            .setNom("Alexandre")
            .setPrenom("Gbamele")
            .setAge(24)
            .setDepartement(departement)
            .build();

//    PersonneVO personneVo = new PersonneVoMb()
//            .setNom("Alexandre")
//            .setPrenom("Gbamele")
//            .setAge(24)
//            .setDepartment(departement)
//            .build();
}
