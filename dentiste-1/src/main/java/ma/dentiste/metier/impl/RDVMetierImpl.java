package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.RDVMetier;
@Service
@Transactional
public class RDVMetierImpl implements RDVMetier {
    @Autowired
	private RDVRepository rdvRepository ;

	@Override
	public void addRDV(RDV rdv) {
		rdvRepository.save(rdv);
	}

	@Override
	public void deleteRDV(RDV rdv) {
		rdvRepository.delete(rdv);
	}

	@Override
	public RDV updateRDV(RDV rdv) {
		return rdvRepository.save(rdv);
		
	}

	

	@Override
	public RDV findById_rdv(Long id_rdv) {
		return rdvRepository.findById(id_rdv).get();

	}

	

	@Override
	public List<RDV> findAll() {
		return rdvRepository.findAll();
	}
	
	
	

}
