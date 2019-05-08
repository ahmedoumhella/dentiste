package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.ProtheseDentaireController;
@RestController
@RequestMapping(value="/protheseDentaire")
public class ProtheseDentaireControllerImpl implements ProtheseDentaireController{

	@Autowired
	private ProtheseDentaireMetier metier;
	
	@RequestMapping(value="/protheseDentaires")
	public List<ProtheseDentaire> findAll(){
	List<ProtheseDentaire>  protheseDentaires =metier.findAll();
	return protheseDentaires;
	
	}

	@Override
	@RequestMapping(value="/addProtheseDentaire")

	public void addProtheseDentaire(ProtheseDentaire protheseDentaire) {
		metier.addProtheseDentaire(protheseDentaire);
		
	}

	@Override
	@RequestMapping(value="/deleteProtheseDentaire")

	public void deleteProtheseDentaire(ProtheseDentaire protheseDentaire) {
		metier.deleteProtheseDentaire(protheseDentaire);
		
	}

	@Override
	@RequestMapping(value="/updateProtheseDentaire")

	public ProtheseDentaire updateProtheseDentaire(ProtheseDentaire protheseDentaire) {
		return metier.updateProtheseDentaire(protheseDentaire);
	}

	@Override
	@RequestMapping(value="/findById/{id_PD}")

	public ProtheseDentaire findById_PD(@PathVariable("id_¨PD") Long id_PD) {
		
		try {
			return metier.findById_PD(id_PD) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
