package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.Ordonnance;

public interface OrdonnanceMetier {
	public void addOrdonnance(Ordonnance ordonnance);
	public void deleteOrdonnance(Ordonnance ordonnance);
	public Ordonnance updateOrdonnance(Ordonnance ordonnance);
	public Ordonnance findById_ordonnance(Long id_ordonnance);
	public List<Ordonnance> findAll();
}
