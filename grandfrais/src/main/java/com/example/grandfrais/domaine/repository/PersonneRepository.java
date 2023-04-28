package com.example.grandfrais.domaine.repository;

import com.example.grandfrais.domaine.entites.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
