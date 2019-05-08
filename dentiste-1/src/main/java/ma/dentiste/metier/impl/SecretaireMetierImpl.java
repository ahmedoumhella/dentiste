package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.SecretaireMetier;
@Service
@Transactional
public class SecretaireMetierImpl implements SecretaireMetier {
    @Autowired
	private SecretaireRepository secretaireRepository ;

	@Override
	public void addSecretaire(Secretaire secretaire) {
		secretaireRepository.save(secretaire);
	}

	@Override
	public void deleteSecretaire(Secretaire secretaire) {
		secretaireRepository.delete(secretaire);
	}

	@Override
	public Secretaire updateSecretaire(Secretaire secretaire) {
		return secretaireRepository.save(secretaire);
		
	}

	

	@Override
	public Secretaire findById_personne(Long id_secretaire) {
		return secretaireRepository.findById(id_secretaire).get();

	}

	@Override
	public Secretaire findByCin(String cin) {
		return secretaireRepository.findByCin(cin);

	}

	@Override
	public List<Secretaire> findAll() {
		return secretaireRepository.findAll();
	}
	
	
	

}
