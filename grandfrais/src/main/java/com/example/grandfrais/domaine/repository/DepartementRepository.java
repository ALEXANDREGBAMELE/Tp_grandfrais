package com.example.grandfrais.domaine.repository;

import com.example.grandfrais.domaine.entites.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long> {
}
