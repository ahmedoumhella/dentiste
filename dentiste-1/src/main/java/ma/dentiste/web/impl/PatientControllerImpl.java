package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.PatientController;
@RestController
@RequestMapping(value="/patient")
public class PatientControllerImpl implements PatientController{

	@Autowired
	private PatientMetier metier;
	
	@RequestMapping(value="/patients")
	public List<Patient> findAll(){
	List<Patient>  patients =metier.findAll();
	return patients;
	
	}

	@Override
	@RequestMapping(value="/addPatient")

	public void addPatient(Patient patient) {
		metier.addPatient(patient);
		
	}

	@Override
	@RequestMapping(value="/deletePatient")

	public void deletePatient(Patient patient) {
		metier.deletePatient(patient);
		
	}

	@Override
	@RequestMapping(value="/updatePatient")

	public Patient updatePatient(Patient patient) {
		return metier.updatePatient(patient);
	}

	@Override
	@RequestMapping(value="/findById/{id_personne}")

	public Patient findById_personne(@PathVariable("id_personne") Long id_personne) {
		
		try {
			return metier.findById_personne(id_personne) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	@Override
	@RequestMapping(value="/findByCin/{cin}")
	public Patient findByCin(@PathVariable("cin") String cin) {
		try {
			return metier.findByCin(cin) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
}
