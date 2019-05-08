package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.PatientMetier;
@Service
@Transactional
public class PatientMetierImpl implements PatientMetier {
    @Autowired
	private PatientRepository patientRepository ;

	@Override
	public void addPatient(Patient patient) {
		patientRepository.save(patient);
	}

	@Override
	public void deletePatient(Patient patient) {
		patientRepository.delete(patient);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		return patientRepository.save(patient);
		
	}

	

	@Override
	public Patient findById_personne(Long id_patient) {
		return patientRepository.findById(id_patient).get();

	}

	@Override
	public Patient findByCin(String cin) {
		return patientRepository.findByCin(cin);

	}

	@Override
	public List<Patient> findAll() {
		return patientRepository.findAll();
	}
	
	
	

}
