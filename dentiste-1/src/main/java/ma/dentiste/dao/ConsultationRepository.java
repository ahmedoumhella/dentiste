package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.Consultation;


public interface ConsultationRepository extends JpaRepository<Consultation, Long>{

}
