package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.RecetteConsultationMetier;
@Service
@Transactional
public class RecetteConsultationMetierImpl implements RecetteConsultationMetier {
    @Autowired
	private RecetteConsultationRepository recetteConsultationRepository ;

	@Override
	public void addRecetteConsultation(RecetteConsultation recetteConsultation) {
		recetteConsultationRepository.save(recetteConsultation);
	}

	@Override
	public void deleteRecetteConsultation(RecetteConsultation recetteConsultation) {
		recetteConsultationRepository.delete(recetteConsultation);
	}

	@Override
	public RecetteConsultation updateRecetteConsultation(RecetteConsultation recetteConsultation) {
		return recetteConsultationRepository.save(recetteConsultation);
		
	}

	

	@Override
	public RecetteConsultation findById_recetteConsultation(Long id_recetteConsultation) {
		return recetteConsultationRepository.findById(id_recetteConsultation).get();

	}

	

	@Override
	public List<RecetteConsultation> findAll() {
		return recetteConsultationRepository.findAll();
	}
	
	
	

}
