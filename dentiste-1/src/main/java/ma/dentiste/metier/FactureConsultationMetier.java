package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.FactureConsultation;

public interface FactureConsultationMetier {
	public void addFactureConsultation(FactureConsultation factureConsultation);
	public void deleteFactureConsultation(FactureConsultation factureConsultation);
	public FactureConsultation updateFactureConsultation(FactureConsultation factureConsultation);
	public FactureConsultation findById_factureConsultation(Long id_factureConsultation);
	public List<FactureConsultation> findAll();
}
