package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.OrdonnanceController;
@RestController
@RequestMapping(value="/ordonnance")
public class OrdonnanceControllerImpl implements OrdonnanceController{

	@Autowired
	private OrdonnanceMetier metier;
	
	@RequestMapping(value="/ordonnances")
	public List<Ordonnance> findAll(){
	List<Ordonnance>  ordonnances =metier.findAll();
	return ordonnances;
	
	}

	@Override
	@RequestMapping(value="/addOrdonnance")

	public void addOrdonnance(Ordonnance ordonnance) {
		metier.addOrdonnance(ordonnance);
		
	}

	@Override
	@RequestMapping(value="/deleteOrdonnance")

	public void deleteOrdonnance(Ordonnance ordonnance) {
		metier.deleteOrdonnance(ordonnance);
		
	}

	@Override
	@RequestMapping(value="/updateOrdonnance")

	public Ordonnance updateOrdonnance(Ordonnance ordonnance) {
		return metier.updateOrdonnance(ordonnance);
	}

	@Override
	@RequestMapping(value="/findById/{id_ordonnance}")

	public Ordonnance findById_ordonnance(@PathVariable("id_ordonnance") Long id_ordonnance) {
		
		try {
			return metier.findById_ordonnance(id_ordonnance) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
