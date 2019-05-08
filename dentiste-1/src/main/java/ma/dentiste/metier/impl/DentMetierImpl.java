package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.DentMetier;
@Service
@Transactional
public class DentMetierImpl implements DentMetier {
    @Autowired
	private DentRepository dentRepository ;

	@Override
	public void addDent(Dent dent) {
		dentRepository.save(dent);
	}

	@Override
	public void deleteDent(Dent dent) {
		dentRepository.delete(dent);
	}

	@Override
	public Dent updateDent(Dent dent) {
		return dentRepository.save(dent);
		
	}

	

	@Override
	public Dent findById_dent(Long id_dent) {
		return dentRepository.findById(id_dent).get();

	}

	

	@Override
	public List<Dent> findAll() {
		return dentRepository.findAll();
	}
	
	
	

}
