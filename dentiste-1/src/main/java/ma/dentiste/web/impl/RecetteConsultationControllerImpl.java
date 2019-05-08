package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.RecetteConsultationController;
@RestController
@RequestMapping(value="/recetteConsultation")
public class RecetteConsultationControllerImpl implements RecetteConsultationController{

	@Autowired
	private RecetteConsultationMetier metier;
	
	@RequestMapping(value="/recetteConsultations")
	public List<RecetteConsultation> findAll(){
	List<RecetteConsultation>  recetteConsultations =metier.findAll();
	return recetteConsultations;
	
	}

	@Override
	@RequestMapping(value="/addRecetteConsultation")

	public void addRecetteConsultation(RecetteConsultation recetteConsultation) {
		metier.addRecetteConsultation(recetteConsultation);
		
	}

	@Override
	@RequestMapping(value="/deleteRecetteConsultation")

	public void deleteRecetteConsultation(RecetteConsultation recetteConsultation) {
		metier.deleteRecetteConsultation(recetteConsultation);
		
	}

	@Override
	@RequestMapping(value="/updateRecetteConsultation")

	public RecetteConsultation updateRecetteConsultation(RecetteConsultation recetteConsultation) {
		return metier.updateRecetteConsultation(recetteConsultation);
	}

	@Override
	@RequestMapping(value="/findById/{id_recetteConsultation}")

	public RecetteConsultation findById_recetteConsultation(@PathVariable("id_recetteConsultation") Long id_recetteConsultation) {
		
		try {
			return metier.findById_recetteConsultation(id_recetteConsultation) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
