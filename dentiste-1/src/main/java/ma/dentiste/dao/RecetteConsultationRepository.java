package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.RecetteConsultation;


public interface RecetteConsultationRepository extends JpaRepository<RecetteConsultation, Long>{

}
