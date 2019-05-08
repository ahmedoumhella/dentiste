package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.AntecedentMedicaleController;
@RestController
@RequestMapping(value="/antecedentMedicale")
public class AntecedentMedicaleControllerImpl implements AntecedentMedicaleController{

	@Autowired
	private AntecedentMedicaleMetier metier;
	
	@RequestMapping(value="/antecedentMedicales")
	public List<AntecedentMedicale> findAll(){
	List<AntecedentMedicale>  antecedentMedicales =metier.findAll();
	return antecedentMedicales;
	
	}

	@Override
	@RequestMapping(value="/addAntecedentMedicale")

	public void addAntecedentMedicale(AntecedentMedicale antecedentMedicale) {
		metier.addAntecedentMedicale(antecedentMedicale);
		
	}

	@Override
	@RequestMapping(value="/deleteAntecedentMedicale")

	public void deleteAntecedentMedicale(AntecedentMedicale antecedentMedicale) {
		metier.deleteAntecedentMedicale(antecedentMedicale);
		
	}

	@Override
	@RequestMapping(value="/updateAntecedentMedicale")

	public AntecedentMedicale updateAntecedentMedicale(AntecedentMedicale antecedentMedicale) {
		return metier.updateAntecedentMedicale(antecedentMedicale);
	}

	@Override
	@RequestMapping(value="/findById/{id_antecedentMedicale}")

	public AntecedentMedicale findById_antecedentMedicale(@PathVariable("id_antecedentMedicale") Long id_antecedentMedicale) {
		
		try {
			return metier.findById_antecedentMedicale(id_antecedentMedicale) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
