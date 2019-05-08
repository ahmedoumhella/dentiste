package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.ProtheseDentaire;

public interface ProtheseDentaireController {
	public void addProtheseDentaire(ProtheseDentaire protheseDentaire);
	public void deleteProtheseDentaire(ProtheseDentaire protheseDentaire);
	public ProtheseDentaire updateProtheseDentaire(ProtheseDentaire protheseDentaire);
	public ProtheseDentaire findById_PD(Long id_PD);
	public List<ProtheseDentaire> findAll();
}
