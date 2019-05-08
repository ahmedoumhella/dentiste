package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.RecettePlanTraitementController;
@RestController
@RequestMapping(value="/recettePlanTraitement")
public class RecettePlanTraitementControllerImpl implements RecettePlanTraitementController{

	@Autowired
	private RecettePlanTraitementMetier metier;
	
	@RequestMapping(value="/recettePlanTraitements")
	public List<RecettePlanTraitement> findAll(){
	List<RecettePlanTraitement>  recettePlanTraitements =metier.findAll();
	return recettePlanTraitements;
	
	}

	@Override
	@RequestMapping(value="/addRecettePlanTraitement")

	public void addRecettePlanTraitement(RecettePlanTraitement recettePlanTraitement) {
		metier.addRecettePlanTraitement(recettePlanTraitement);
		
	}

	@Override
	@RequestMapping(value="/deleteRecettePlanTraitement")

	public void deleteRecettePlanTraitement(RecettePlanTraitement recettePlanTraitement) {
		metier.deleteRecettePlanTraitement(recettePlanTraitement);
		
	}

	@Override
	@RequestMapping(value="/updateRecettePlanTraitement")

	public RecettePlanTraitement updateRecettePlanTraitement(RecettePlanTraitement recettePlanTraitement) {
		return metier.updateRecettePlanTraitement(recettePlanTraitement);
	}

	@Override
	@RequestMapping(value="/findById/{id_recettePlanTraitement}")

	public RecettePlanTraitement findById_recettePlanTraitement(@PathVariable("id_recettePlanTraitement") Long id_recettePlanTraitement) {
		
		try {
			return metier.findById_recettePlanTraitement(id_recettePlanTraitement) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
