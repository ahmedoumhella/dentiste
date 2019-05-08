package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.RecettePlanTraitementMetier;
@Service
@Transactional
public class RecettePlanTraitementMetierImpl2 implements RecettePlanTraitementMetier {
    @Autowired
	private RecettePlanTraitementRepository recettePlanTraitementRepository ;

	@Override
	public void addRecettePlanTraitement(RecettePlanTraitement recettePlanTraitement) {
		recettePlanTraitementRepository.save(recettePlanTraitement);
	}

	@Override
	public void deleteRecettePlanTraitement(RecettePlanTraitement recettePlanTraitement) {
		recettePlanTraitementRepository.delete(recettePlanTraitement);
	}

	@Override
	public RecettePlanTraitement updateRecettePlanTraitement(RecettePlanTraitement recettePlanTraitement) {
		return recettePlanTraitementRepository.save(recettePlanTraitement);
		
	}

	

	@Override
	public RecettePlanTraitement findById_recettePlanTraitement(Long id_recettePlanTraitement) {
		return recettePlanTraitementRepository.findById(id_recettePlanTraitement).get();

	}

	

	@Override
	public List<RecettePlanTraitement> findAll() {
		return recettePlanTraitementRepository.findAll();
	}
	
	
	

}
