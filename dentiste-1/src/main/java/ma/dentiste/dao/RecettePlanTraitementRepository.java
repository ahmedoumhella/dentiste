package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.RecettePlanTraitement;


public interface RecettePlanTraitementRepository extends JpaRepository<RecettePlanTraitement, Long>{

}
