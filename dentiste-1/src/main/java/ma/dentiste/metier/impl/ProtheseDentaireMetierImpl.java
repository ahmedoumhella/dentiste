package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.ProtheseDentaireMetier;
@Service
@Transactional
public class ProtheseDentaireMetierImpl implements ProtheseDentaireMetier {
    @Autowired
	private ProtheseDentaireRepository protheseDentaireRepository ;

	@Override
	public void addProtheseDentaire(ProtheseDentaire protheseDentaire) {
		protheseDentaireRepository.save(protheseDentaire);
	}

	@Override
	public void deleteProtheseDentaire(ProtheseDentaire protheseDentaire) {
		protheseDentaireRepository.delete(protheseDentaire);
	}

	@Override
	public ProtheseDentaire updateProtheseDentaire(ProtheseDentaire protheseDentaire) {
		return protheseDentaireRepository.save(protheseDentaire);
		
	}

	

	@Override
	public ProtheseDentaire findById_PD(Long id_PD) {
		return protheseDentaireRepository.findById(id_PD).get();

	}

	

	@Override
	public List<ProtheseDentaire> findAll() {
		return protheseDentaireRepository.findAll();
	}
	
	
	

}
