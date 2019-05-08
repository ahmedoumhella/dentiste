package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.Dent;

public interface DentMetier {
	public void addDent(Dent dent);
	public void deleteDent(Dent dent);
	public Dent updateDent(Dent dent);
	public Dent findById_dent(Long id_dent);
	public List<Dent> findAll();
}
