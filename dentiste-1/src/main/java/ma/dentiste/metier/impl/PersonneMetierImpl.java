package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.PersonneMetier;
@Service
@Transactional
public class PersonneMetierImpl implements PersonneMetier {
    @Autowired
	private PersonneRepository personneRepository ;

	@Override
	public void addPersonne(Personne personne) {
		personneRepository.save(personne);
	}

	@Override
	public void deletePersonne(Personne personne) {
		personneRepository.delete(personne);
	}

	@Override
	public Personne updatePersonne(Personne personne) {
		return personneRepository.save(personne);
		
	}

	

	@Override
	public Personne findById_personne(Long id_personne) {
		return personneRepository.findById(id_personne).get();

	}

	@Override
	public Personne findByCin(String cin) {
		return personneRepository.findByCin(cin);

	}

	@Override
	public List<Personne> findAll() {
		return personneRepository.findAll();
	}
	
	
	

}
