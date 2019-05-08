package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.Assurance;

public interface AssuranceMetier {
	public void addAssurance(Assurance assurance);
	public void deleteAssurance(Assurance assurance);
	public Assurance updateAssurance(Assurance assurance);
	public Assurance findById_assurance(Long id_assurance);
	public List<Assurance> findAll();
}
