package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.ProthesisteMetier;
@Service
@Transactional
public class ProthesisteMetierImpl implements ProthesisteMetier {
    @Autowired
	private ProthesisteRepository prothesisteRepository ;

	@Override
	public void addProthesiste(Prothesiste prothesiste) {
		prothesisteRepository.save(prothesiste);
	}

	@Override
	public void deleteProthesiste(Prothesiste prothesiste) {
		prothesisteRepository.delete(prothesiste);
	}

	@Override
	public Prothesiste updateProthesiste(Prothesiste prothesiste) {
		return prothesisteRepository.save(prothesiste);
		
	}

	

	@Override
	public Prothesiste findById_personne(Long id_prothesiste) {
		return prothesisteRepository.findById(id_prothesiste).get();

	}

	@Override
	public Prothesiste findByCin(String cin) {
		return prothesisteRepository.findByCin(cin);

	}

	@Override
	public List<Prothesiste> findAll() {
		return prothesisteRepository.findAll();
	}
	
	
	

}
