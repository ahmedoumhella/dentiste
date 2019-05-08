package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.AssuranceController;
@RestController
@RequestMapping(value="/assurance")
public class AssuranceControllerImpl implements AssuranceController{

	@Autowired
	private AssuranceMetier metier;
	
	@RequestMapping(value="/assurances")
	public List<Assurance> findAll(){
	List<Assurance>  assurances =metier.findAll();
	return assurances;
	
	}

	@Override
	@RequestMapping(value="/addAssurance")

	public void addAssurance(Assurance assurance) {
		metier.addAssurance(assurance);
		
	}

	@Override
	@RequestMapping(value="/deleteAssurance")

	public void deleteAssurance(Assurance assurance) {
		metier.deleteAssurance(assurance);
		
	}

	@Override
	@RequestMapping(value="/updateAssurance")

	public Assurance updateAssurance(Assurance assurance) {
		return metier.updateAssurance(assurance);
	}

	@Override
	@RequestMapping(value="/findById/{id_assurance}")

	public Assurance findById_assurance(@PathVariable("id_assurance") Long id_assurance) {
		
		try {
			return metier.findById_assurance(id_assurance) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
