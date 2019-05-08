package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.FacturePlanTraitementMetier;
@Service
@Transactional
public class FacturePlanTraitementMetierImpl implements FacturePlanTraitementMetier {
    @Autowired
	private FacturePlanTraitementRepository facturePlanTraitementRepository ;

	@Override
	public void addFacturePlanTraitement(FacturePlanTraitement facturePlanTraitement) {
		facturePlanTraitementRepository.save(facturePlanTraitement);
	}

	@Override
	public void deleteFacturePlanTraitement(FacturePlanTraitement facturePlanTraitement) {
		facturePlanTraitementRepository.delete(facturePlanTraitement);
	}

	@Override
	public FacturePlanTraitement updateFacturePlanTraitement(FacturePlanTraitement facturePlanTraitement) {
		return facturePlanTraitementRepository.save(facturePlanTraitement);
		
	}

	

	@Override
	public FacturePlanTraitement findById_facturePlanTraitement(Long id_facturePlanTraitement) {
		return facturePlanTraitementRepository.findById(id_facturePlanTraitement).get();

	}

	

	@Override
	public List<FacturePlanTraitement> findAll() {
		return facturePlanTraitementRepository.findAll();
	}
	
	
	

}
