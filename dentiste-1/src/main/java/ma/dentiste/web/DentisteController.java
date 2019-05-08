package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.Dentiste;

public interface DentisteController {

	public void addDentiste(Dentiste dentiste);
	public void deleteDentiste(Dentiste dentiste);
	public Dentiste updateDentiste(Dentiste dentiste);
	public Dentiste findById_personne(Long id_personne);
	public Dentiste findByCin(String cin);
	public List<Dentiste> findAll();
}
