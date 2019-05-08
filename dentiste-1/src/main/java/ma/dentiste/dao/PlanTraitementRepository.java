package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.PlanTraitement;

public interface PlanTraitementRepository extends JpaRepository<PlanTraitement, Long>{

}
