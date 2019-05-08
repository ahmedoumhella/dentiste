package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.*;

public interface PersonneMetier {
 
	public void addPersonne(Personne personne);
	public void deletePersonne(Personne personne);
	public Personne updatePersonne(Personne personne);
	public Personne findById_personne(Long id_personne);
	public Personne findByCin(String cin);
	public List<Personne> findAll();

}
