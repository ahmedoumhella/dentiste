package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.Prothesiste;

public interface ProthesisteMetier {
	public void addProthesiste(Prothesiste prothesiste);
	public void deleteProthesiste(Prothesiste prothesiste);
	public Prothesiste updateProthesiste(Prothesiste prothesiste);
	public Prothesiste findById_personne(Long id_personne);
	public List<Prothesiste> findAll();
	Prothesiste findByCin(String cin);
}
