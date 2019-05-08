package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.FactureConsultation;

public interface FactureConsultationController {
	public void addFactureConsultation(FactureConsultation factureConsultation);
	public void deleteFactureConsultation(FactureConsultation factureConsultation);
	public FactureConsultation updateFactureConsultation(FactureConsultation factureConsultation);
	public FactureConsultation findById_factureConsultation(Long id_factureConsultation);
	public List<FactureConsultation> findAll();
}
