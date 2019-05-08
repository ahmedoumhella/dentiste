package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.FactureConsultationController;
@RestController
@RequestMapping(value="/factureConsultation")
public class FactureConsultationControllerImpl implements FactureConsultationController{

	@Autowired
	private FactureConsultationMetier metier;
	
	@RequestMapping(value="/factureConsultations")
	public List<FactureConsultation> findAll(){
	List<FactureConsultation>  factureConsultations =metier.findAll();
	return factureConsultations;
	
	}

	@Override
	@RequestMapping(value="/addFactureConsultation")

	public void addFactureConsultation(FactureConsultation factureConsultation) {
		metier.addFactureConsultation(factureConsultation);
		
	}

	@Override
	@RequestMapping(value="/deleteFactureConsultation")

	public void deleteFactureConsultation(FactureConsultation factureConsultation) {
		metier.deleteFactureConsultation(factureConsultation);
		
	}

	@Override
	@RequestMapping(value="/updateFactureConsultation")

	public FactureConsultation updateFactureConsultation(FactureConsultation factureConsultation) {
		return metier.updateFactureConsultation(factureConsultation);
	}

	@Override
	@RequestMapping(value="/findById/{id_factureConsultation}")

	public FactureConsultation findById_factureConsultation(@PathVariable("id_factureConsultation") Long id_factureConsultation) {
		
		try {
			return metier.findById_factureConsultation(id_factureConsultation) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
