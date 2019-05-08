package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.Dent;

public interface DentController {
	public void addDent(Dent dent);
	public void deleteDent(Dent dent);
	public Dent updateDent(Dent dent);
	public Dent findById_dent(Long id_dent);
	public List<Dent> findAll();
}
