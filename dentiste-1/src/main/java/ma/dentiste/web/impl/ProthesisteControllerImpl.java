package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.ProthesisteController;
@RestController
@RequestMapping(value="/prothesiste")
public class ProthesisteControllerImpl implements ProthesisteController{

	@Autowired
	private ProthesisteMetier metier;
	
	@RequestMapping(value="/prothesistes")
	public List<Prothesiste> findAll(){
	List<Prothesiste>  prothesistes =metier.findAll();
	return prothesistes;
	
	}

	@Override
	@RequestMapping(value="/addProthesiste")

	public void addProthesiste(Prothesiste prothesiste) {
		metier.addProthesiste(prothesiste);
		
	}

	@Override
	@RequestMapping(value="/deleteProthesiste")

	public void deleteProthesiste(Prothesiste prothesiste) {
		metier.deleteProthesiste(prothesiste);
		
	}

	@Override
	@RequestMapping(value="/updateProthesiste")

	public Prothesiste updateProthesiste(Prothesiste prothesiste) {
		return metier.updateProthesiste(prothesiste);
	}

	@Override
	@RequestMapping(value="/findById/{id_personne}")

	public Prothesiste findById_personne(@PathVariable("id_personne") Long id_personne) {
		
		try {
			return metier.findById_personne(id_personne) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	@Override
	@RequestMapping(value="/findByCin/{cin}")
	public Prothesiste findByCin(@PathVariable("cin") String cin) {
		try {
			return metier.findByCin(cin) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
}
