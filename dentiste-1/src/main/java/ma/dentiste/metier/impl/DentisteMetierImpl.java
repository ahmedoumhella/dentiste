package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.DentisteMetier;
@Service
@Transactional
public class DentisteMetierImpl implements DentisteMetier {
    @Autowired
	private DentisteRepository dentisteRepository ;

	@Override
	public void addDentiste(Dentiste dentiste) {
		dentisteRepository.save(dentiste);
	}

	@Override
	public void deleteDentiste(Dentiste dentiste) {
		dentisteRepository.delete(dentiste);
	}

	@Override
	public Dentiste updateDentiste(Dentiste dentiste) {
		return dentisteRepository.save(dentiste);
		
	}

	

	@Override
	public Dentiste findById_personne(Long id_dentiste) {
		return dentisteRepository.findById(id_dentiste).get();

	}

	@Override
	public Dentiste findByCin(String cin) {
		return dentisteRepository.findByCin(cin);

	}

	@Override
	public List<Dentiste> findAll() {
		return dentisteRepository.findAll();
	}
	
	
	

}
