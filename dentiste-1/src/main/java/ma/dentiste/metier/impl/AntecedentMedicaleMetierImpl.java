package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.AntecedentMedicaleMetier;
@Service
@Transactional
public class AntecedentMedicaleMetierImpl implements AntecedentMedicaleMetier {
    @Autowired
	private AntecedentMedicaleRepository antecedentMedicaleRepository ;

	@Override
	public void addAntecedentMedicale(AntecedentMedicale antecedentMedicale) {
		antecedentMedicaleRepository.save(antecedentMedicale);
	}

	@Override
	public void deleteAntecedentMedicale(AntecedentMedicale antecedentMedicale) {
		antecedentMedicaleRepository.delete(antecedentMedicale);
	}

	@Override
	public AntecedentMedicale updateAntecedentMedicale(AntecedentMedicale antecedentMedicale) {
		return antecedentMedicaleRepository.save(antecedentMedicale);
		
	}

	

	@Override
	public AntecedentMedicale findById_antecedentMedicale(Long id_antecedentMedicale) {
		return antecedentMedicaleRepository.findById(id_antecedentMedicale).get();

	}

	

	@Override
	public List<AntecedentMedicale> findAll() {
		return antecedentMedicaleRepository.findAll();
	}
	
	
	

}
