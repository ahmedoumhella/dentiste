package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.MedOrdMetier;
@Service
@Transactional
public class MedOrdMetierImpl implements MedOrdMetier {
    @Autowired
	private MedOrdRepository medOrdRepository ;

	@Override
	public void addMedOrd(MedOrd medOrd) {
		medOrdRepository.save(medOrd);
	}

	@Override
	public void deleteMedOrd(MedOrd medOrd) {
		medOrdRepository.delete(medOrd);
	}

	@Override
	public MedOrd updateMedOrd(MedOrd medOrd) {
		return medOrdRepository.save(medOrd);
		
	}

	

	@Override
	public MedOrd findById(Pk id_pk) {
		return medOrdRepository.findById(id_pk).get();

	}

	

	@Override
	public List<MedOrd> findAll() {
		return medOrdRepository.findAll();
	}
	
	
	

}
