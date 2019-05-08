package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.Assurance;

public interface AssuranceRepository extends JpaRepository<Assurance, Long>{

}
