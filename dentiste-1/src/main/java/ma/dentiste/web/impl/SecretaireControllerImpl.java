package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.SecretaireController;
@RestController
@RequestMapping(value="/secretaire")
public class SecretaireControllerImpl implements SecretaireController{

	@Autowired
	private SecretaireMetier metier;
	
	@RequestMapping(value="/secretaires")
	public List<Secretaire> findAll(){
	List<Secretaire>  secretaires =metier.findAll();
	return secretaires;
	
	}

	@Override
	@RequestMapping(value="/addSecretaire")

	public void addSecretaire(Secretaire secretaire) {
		metier.addSecretaire(secretaire);
		
	}

	@Override
	@RequestMapping(value="/deleteSecretaire")

	public void deleteSecretaire(Secretaire secretaire) {
		metier.deleteSecretaire(secretaire);
		
	}

	@Override
	@RequestMapping(value="/updateSecretaire")

	public Secretaire updateSecretaire(Secretaire secretaire) {
		return metier.updateSecretaire(secretaire);
	}

	@Override
	@RequestMapping(value="/findById/{id_personne}")

	public Secretaire findById_personne(@PathVariable("id_personne") Long id_personne) {
		
		try {
			return metier.findById_personne(id_personne) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	@Override
	@RequestMapping(value="/findByCin/{cin}")
	public Secretaire findByCin(@PathVariable("cin") String cin) {
		try {
			return metier.findByCin(cin) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
}
