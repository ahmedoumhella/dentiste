package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.ConsultationMetier;
@Service
@Transactional
public class ConsultationMetierImpl implements ConsultationMetier {
    @Autowired
	private ConsultationRepository consultationRepository ;

	@Override
	public void addConsultation(Consultation consultation) {
		consultationRepository.save(consultation);
	}

	@Override
	public void deleteConsultation(Consultation consultation) {
		consultationRepository.delete(consultation);
	}

	@Override
	public Consultation updateConsultation(Consultation consultation) {
		return consultationRepository.save(consultation);
		
	}

	

	@Override
	public Consultation findById_consultation(Long id_consultation) {
		return consultationRepository.findById(id_consultation).get();

	}

	

	@Override
	public List<Consultation> findAll() {
		return consultationRepository.findAll();
	}
	
	
	

}
