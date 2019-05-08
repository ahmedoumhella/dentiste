package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.FactureConsultationMetier;
@Service
@Transactional
public class FactureConsultationImpl implements FactureConsultationMetier {
    @Autowired
	private FactureConsultationRepository factureConsultationRepository ;

	@Override
	public void addFactureConsultation(FactureConsultation factureConsultation) {
		factureConsultationRepository.save(factureConsultation);
	}

	@Override
	public void deleteFactureConsultation(FactureConsultation factureConsultation) {
		factureConsultationRepository.delete(factureConsultation);
	}

	@Override
	public FactureConsultation updateFactureConsultation(FactureConsultation factureConsultation) {
		return factureConsultationRepository.save(factureConsultation);
		
	}

	

	@Override
	public FactureConsultation findById_factureConsultation(Long id_factureConsultation) {
		return factureConsultationRepository.findById(id_factureConsultation).get();

	}

	

	@Override
	public List<FactureConsultation> findAll() {
		return factureConsultationRepository.findAll();
	}
	
	
	

}
