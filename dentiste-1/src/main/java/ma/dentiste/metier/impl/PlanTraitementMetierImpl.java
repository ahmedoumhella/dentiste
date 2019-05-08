package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.PlanTraitementMetier;
@Service
@Transactional
public class PlanTraitementMetierImpl implements PlanTraitementMetier {
    @Autowired
	private PlanTraitementRepository planTraitementRepository ;

	@Override
	public void addPlanTraitement(PlanTraitement planTraitement) {
		planTraitementRepository.save(planTraitement);
	}

	@Override
	public void deletePlanTraitement(PlanTraitement planTraitement) {
		planTraitementRepository.delete(planTraitement);
	}

	@Override
	public PlanTraitement updatePlanTraitement(PlanTraitement planTraitement) {
		return planTraitementRepository.save(planTraitement);
		
	}

	

	@Override
	public PlanTraitement findById_planTraitement(Long id_planTraitement) {
		return planTraitementRepository.findById(id_planTraitement).get();

	}

	

	@Override
	public List<PlanTraitement> findAll() {
		return planTraitementRepository.findAll();
	}
	
	
	

}
