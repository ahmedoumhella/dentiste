package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.PlanTraitementController;
@RestController
@RequestMapping(value="/planTraitement")
public class PlanTraitementControllerImpl implements PlanTraitementController{

	@Autowired
	private PlanTraitementMetier metier;
	
	@RequestMapping(value="/planTraitements")
	public List<PlanTraitement> findAll(){
	List<PlanTraitement>  planTraitements =metier.findAll();
	return planTraitements;
	
	}

	@Override
	@RequestMapping(value="/addPlanTraitement")

	public void addPlanTraitement(PlanTraitement planTraitement) {
		metier.addPlanTraitement(planTraitement);
		
	}

	@Override
	@RequestMapping(value="/deletePlanTraitement")

	public void deletePlanTraitement(PlanTraitement planTraitement) {
		metier.deletePlanTraitement(planTraitement);
		
	}

	@Override
	@RequestMapping(value="/updatePlanTraitement")

	public PlanTraitement updatePlanTraitement(PlanTraitement planTraitement) {
		return metier.updatePlanTraitement(planTraitement);
	}

	@Override
	@RequestMapping(value="/findById/{id_planTraitement}")

	public PlanTraitement findById_planTraitement(@PathVariable("id_planTraitement") Long id_planTraitement) {
		
		try {
			return metier.findById_planTraitement(id_planTraitement) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
