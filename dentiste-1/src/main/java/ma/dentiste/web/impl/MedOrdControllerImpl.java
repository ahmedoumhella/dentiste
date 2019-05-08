package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.MedOrdController;
@RestController
@RequestMapping(value="/medOrd")
public class MedOrdControllerImpl implements MedOrdController{

	@Autowired
	private MedOrdMetier metier;
	
	@RequestMapping(value="/medOrds")
	public List<MedOrd> findAll(){
	List<MedOrd>  medOrds =metier.findAll();
	return medOrds;
	
	}

	@Override
	@RequestMapping(value="/addMedOrd")

	public void addMedOrd(MedOrd medOrd) {
		metier.addMedOrd(medOrd);
		
	}

	@Override
	@RequestMapping(value="/deleteMedOrd")

	public void deleteMedOrd(MedOrd medOrd) {
		metier.deleteMedOrd(medOrd);
		
	}

	@Override
	@RequestMapping(value="/updateMedOrd")

	public MedOrd updateMedOrd(MedOrd medOrd) {
		return metier.updateMedOrd(medOrd);
	}

	@Override
	@RequestMapping(value="/findById/{pk}")

	public MedOrd findById(@PathVariable("pk") Pk pk) {
		
		try {
			return metier.findById(pk) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
