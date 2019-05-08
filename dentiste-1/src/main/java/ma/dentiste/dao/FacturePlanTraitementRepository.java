package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.FacturePlanTraitement;

public interface FacturePlanTraitementRepository extends JpaRepository<FacturePlanTraitement, Long> {

}
