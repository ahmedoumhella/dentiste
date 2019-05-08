package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.FacturePlanTraitementController;
@RestController
@RequestMapping(value="/facturePlanTraitement")
public class FacturePlanTraitementControllerImpl implements FacturePlanTraitementController{

	@Autowired
	private FacturePlanTraitementMetier metier;
	
	@RequestMapping(value="/facturePlanTraitements")
	public List<FacturePlanTraitement> findAll(){
	List<FacturePlanTraitement>  facturePlanTraitements =metier.findAll();
	return facturePlanTraitements;
	
	}

	@Override
	@RequestMapping(value="/addFacturePlanTraitement")

	public void addFacturePlanTraitement(FacturePlanTraitement facturePlanTraitement) {
		metier.addFacturePlanTraitement(facturePlanTraitement);
		
	}

	@Override
	@RequestMapping(value="/deleteFacturePlanTraitement")

	public void deleteFacturePlanTraitement(FacturePlanTraitement facturePlanTraitement) {
		metier.deleteFacturePlanTraitement(facturePlanTraitement);
		
	}

	@Override
	@RequestMapping(value="/updateFacturePlanTraitement")

	public FacturePlanTraitement updateFacturePlanTraitement(FacturePlanTraitement facturePlanTraitement) {
		return metier.updateFacturePlanTraitement(facturePlanTraitement);
	}

	@Override
	@RequestMapping(value="/findById/{id_facturePlanTraitement}")

	public FacturePlanTraitement findById_facturePlanTraitement(@PathVariable("id_facturePlanTraitement") Long id_facturePlanTraitement) {
		
		try {
			return metier.findById_facturePlanTraitement(id_facturePlanTraitement) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
