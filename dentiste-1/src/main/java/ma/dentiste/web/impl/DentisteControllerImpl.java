package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.DentisteController;
@RestController
@RequestMapping(value="/dentiste")
public class DentisteControllerImpl implements DentisteController{

	@Autowired
	private DentisteMetier metier;
	
	@RequestMapping(value="/dentistes")
	public List<Dentiste> findAll(){
	List<Dentiste>  dentistes =metier.findAll();
	return dentistes;
	
	}

	@Override
	@RequestMapping(value="/addDentiste")

	public void addDentiste(Dentiste dentiste) {
		metier.addDentiste(dentiste);
		
	}

	@Override
	@RequestMapping(value="/deleteDentiste")

	public void deleteDentiste(Dentiste dentiste) {
		metier.deleteDentiste(dentiste);
		
	}

	@Override
	@RequestMapping(value="/updateDentiste")

	public Dentiste updateDentiste(Dentiste dentiste) {
		return metier.updateDentiste(dentiste);
	}

	@Override
	@RequestMapping(value="/findById/{id_personne}")

	public Dentiste findById_personne(@PathVariable("id_personne") Long id_personne) {
		
		try {
			return metier.findById_personne(id_personne) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	@Override
	@RequestMapping(value="/findByCin/{cin}")
	public Dentiste findByCin(@PathVariable("cin") String cin) {
		try {
			return metier.findByCin(cin) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
}
