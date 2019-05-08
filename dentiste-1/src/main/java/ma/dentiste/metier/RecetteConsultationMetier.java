package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.RecetteConsultation;

public interface RecetteConsultationMetier {
	public void addRecetteConsultation(RecetteConsultation recetteConsultation);
	public void deleteRecetteConsultation(RecetteConsultation recetteConsultation);
	public RecetteConsultation updateRecetteConsultation(RecetteConsultation recetteConsultation);
	public RecetteConsultation findById_recetteConsultation(Long id_recetteConsultation);
	public List<RecetteConsultation> findAll();
}
