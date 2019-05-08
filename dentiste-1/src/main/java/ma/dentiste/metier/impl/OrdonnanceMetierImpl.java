package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.OrdonnanceMetier;
@Service
@Transactional
public class OrdonnanceMetierImpl implements OrdonnanceMetier {
    @Autowired
	private OrdonnanceRepository ordonnanceRepository ;

	@Override
	public void addOrdonnance(Ordonnance ordonnance) {
		ordonnanceRepository.save(ordonnance);
	}

	@Override
	public void deleteOrdonnance(Ordonnance ordonnance) {
		ordonnanceRepository.delete(ordonnance);
	}

	@Override
	public Ordonnance updateOrdonnance(Ordonnance ordonnance) {
		return ordonnanceRepository.save(ordonnance);
		
	}

	

	@Override
	public Ordonnance findById_ordonnance(Long id_ordonnance) {
		return ordonnanceRepository.findById(id_ordonnance).get();

	}

	

	@Override
	public List<Ordonnance> findAll() {
		return ordonnanceRepository.findAll();
	}
	
	
	

}
