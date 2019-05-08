package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.DentController;
@RestController
@RequestMapping(value="/dent")
public class DentControllerImpl implements DentController{

	@Autowired
	private DentMetier metier;
	
	@RequestMapping(value="/dents")
	public List<Dent> findAll(){
	List<Dent>  dents =metier.findAll();
	return dents;
	
	}

	@Override
	@RequestMapping(value="/addDent")

	public void addDent(Dent dent) {
		metier.addDent(dent);
		
	}

	@Override
	@RequestMapping(value="/deleteDent")

	public void deleteDent(Dent dent) {
		metier.deleteDent(dent);
		
	}

	@Override
	@RequestMapping(value="/updateDent")

	public Dent updateDent(Dent dent) {
		return metier.updateDent(dent);
	}

	@Override
	@RequestMapping(value="/findById/{id_dent}")

	public Dent findById_dent(@PathVariable("id_dent") Long id_dent) {
		
		try {
			return metier.findById_dent(id_dent) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
