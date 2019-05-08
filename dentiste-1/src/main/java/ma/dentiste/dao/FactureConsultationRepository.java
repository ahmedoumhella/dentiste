package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.FactureConsultation;


public interface FactureConsultationRepository extends JpaRepository<FactureConsultation, Long>{

}
