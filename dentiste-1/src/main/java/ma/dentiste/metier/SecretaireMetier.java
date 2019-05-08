package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.Secretaire;

public interface SecretaireMetier {
	public void addSecretaire(Secretaire secretaire);
	public void deleteSecretaire(Secretaire secretaire);
	public Secretaire updateSecretaire(Secretaire secretaire);
	public Secretaire findById_personne(Long id_personne);
	public Secretaire findByCin(String cin);
	public List<Secretaire> findAll();
}
