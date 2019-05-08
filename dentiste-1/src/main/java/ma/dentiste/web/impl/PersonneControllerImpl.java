package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.PersonneController;
@RestController
@RequestMapping(value="/personne")
public class PersonneControllerImpl implements PersonneController{

	@Autowired
	private PersonneMetier metier;
	
	@RequestMapping(value="/personnes")
	public List<Personne> findAll(){
	List<Personne>  personnes =metier.findAll();
	return personnes;
	
	}

	@Override
	@RequestMapping(value="/addPersonne")

	public void addPersonne(Personne personne) {
		metier.addPersonne(personne);
		
	}

	@Override
	@RequestMapping(value="/deletePersonne")

	public void deletePersonne(Personne personne) {
		metier.deletePersonne(personne);
		
	}

	@Override
	@RequestMapping(value="/updatePersonne")

	public Personne updatePersonne(Personne personne) {
		return metier.updatePersonne(personne);
	}

	@Override
	@RequestMapping(value="/findById/{id_personne}")

	public Personne findById_personne(@PathVariable("id_personne") Long id_personne) {
		
		try {
			return metier.findById_personne(id_personne) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	@Override
	@RequestMapping(value="/findByCin/{cin}")
	public Personne findByCin(@PathVariable("cin") String cin) {
		try {
			return metier.findByCin(cin) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
}
