package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.Prothesiste;

public interface ProthesisteController {
	public void addProthesiste(Prothesiste prothesiste);
	public void deleteProthesiste(Prothesiste prothesiste);
	public Prothesiste updateProthesiste(Prothesiste prothesiste);
	public Prothesiste findById_personne(Long id_personne);
	public List<Prothesiste> findAll();
	Prothesiste findByCin(String cin);
}
