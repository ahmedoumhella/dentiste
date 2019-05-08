package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{
	Patient findByCin(String cin);

}
