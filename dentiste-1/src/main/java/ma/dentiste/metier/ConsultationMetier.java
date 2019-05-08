package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.Consultation;

public interface ConsultationMetier {
	public void addConsultation(Consultation consultation);
	public void deleteConsultation(Consultation consultation);
	public Consultation updateConsultation(Consultation consultation);
	public Consultation findById_consultation(Long id_consultation);
	public List<Consultation> findAll();
}
