package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.AssuranceMetier;
@Service
@Transactional
public class AssuranceMetierImpl implements AssuranceMetier {
    @Autowired
	private AssuranceRepository assuranceRepository ;

	@Override
	public void addAssurance(Assurance assurance) {
		assuranceRepository.save(assurance);
	}

	@Override
	public void deleteAssurance(Assurance assurance) {
		assuranceRepository.delete(assurance);
	}

	@Override
	public Assurance updateAssurance(Assurance assurance) {
		return assuranceRepository.save(assurance);
		
	}

	

	@Override
	public Assurance findById_assurance(Long id_assurance) {
		return assuranceRepository.findById(id_assurance).get();

	}

	

	@Override
	public List<Assurance> findAll() {
		return assuranceRepository.findAll();
	}
	
	
	

}
