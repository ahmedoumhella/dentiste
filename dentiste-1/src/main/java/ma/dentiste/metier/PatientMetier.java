package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.Patient;

public interface PatientMetier {

	public void addPatient(Patient patient);
	public void deletePatient(Patient patient);
	public Patient updatePatient(Patient patient);
	public Patient findById_personne(Long id_personne);
	public Patient findByCin(String cin);
	public List<Patient> findAll();
}
