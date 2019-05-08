package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.ConsultationController;
@RestController
@RequestMapping(value="/consultation")
public class ConsultationControllerImpl implements ConsultationController{

	@Autowired
	private ConsultationMetier metier;
	
	@RequestMapping(value="/consultations")
	public List<Consultation> findAll(){
	List<Consultation>  consultations =metier.findAll();
	return consultations;
	
	}

	@Override
	@RequestMapping(value="/addConsultation")

	public void addConsultation(Consultation consultation) {
		metier.addConsultation(consultation);
		
	}

	@Override
	@RequestMapping(value="/deleteConsultation")

	public void deleteConsultation(Consultation consultation) {
		metier.deleteConsultation(consultation);
		
	}

	@Override
	@RequestMapping(value="/updateConsultation")

	public Consultation updateConsultation(Consultation consultation) {
		return metier.updateConsultation(consultation);
	}

	@Override
	@RequestMapping(value="/findById/{id_consultation}")

	public Consultation findById_consultation(@PathVariable("id_consultation") Long id_consultation) {
		
		try {
			return metier.findById_consultation(id_consultation) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
