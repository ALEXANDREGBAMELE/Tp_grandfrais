package com.example.grandfrais.infrastructure;

import com.example.grandfrais.application.VO.DepartementVO;
import com.example.grandfrais.application.services.DepartementService;
import com.example.grandfrais.domaine.entites.Departement;
import com.example.grandfrais.domaine.repository.DepartementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DepartementServiceImp implements DepartementService {
    private final DepartementRepository departementRepository;

    public DepartementServiceImp(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    @Override
    public Departement addDepart(DepartementVO departement) {
            Departement departement1 = new Departement();
            departement1.setCode(departement.getCode());
            departement1.setDesignation(departement.getDesignation());
            return departementRepository.save(departement1);
    }

    @Override
    public List<Departement> getAllDapart() {
        return departementRepository.findAll();
    }

    @Override
    public Optional<Departement> getByIdDepart(Long id) {
        return departementRepository.findById(id);
    }

    @Override
    public Departement updateDepart(Departement departement, Long id) {

            return departementRepository.findById(departement.getId()) .map(departement1 -> {
                departement1.setCode(departement1.getCode());
                departement1.setDesignation(departement1.getDesignation());
                return departementRepository.save(departement1);
            }) .orElseThrow(() -> new RuntimeException("not found"));

    }

    @Override
    public Void deleteDepart(Long id) {
        departementRepository.deleteById(id);
        return null;
    }

}
