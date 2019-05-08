package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.MedicamentMetier;
@Service
@Transactional
public class MedicamentMetierImpl implements MedicamentMetier {
    @Autowired
	private MedicamentRepository medicamentRepository ;

	@Override
	public void addMedicament(Medicament medicament) {
		medicamentRepository.save(medicament);
	}

	@Override
	public void deleteMedicament(Medicament medicament) {
		medicamentRepository.delete(medicament);
	}

	@Override
	public Medicament updateMedicament(Medicament medicament) {
		return medicamentRepository.save(medicament);
		
	}

	

	@Override
	public Medicament findById_medicament(Long id_medicament) {
		return medicamentRepository.findById(id_medicament).get();

	}

	

	@Override
	public List<Medicament> findAll() {
		return medicamentRepository.findAll();
	}
	
	
	

}
