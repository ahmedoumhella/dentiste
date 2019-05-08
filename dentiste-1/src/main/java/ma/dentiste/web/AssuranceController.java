package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.Assurance;

public interface AssuranceController {
	public void addAssurance(Assurance assurance);
	public void deleteAssurance(Assurance assurance);
	public Assurance updateAssurance(Assurance assurance);
	public Assurance findById_assurance(Long id_assurance);
	public List<Assurance> findAll();
}
