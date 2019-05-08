package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.CertificatMetier;
@Service
@Transactional
public class CertificatMetierImpl implements CertificatMetier {
    @Autowired
	private CertificatRepository certificatRepository ;

	@Override
	public void addCertificat(Certificat certificat) {
		certificatRepository.save(certificat);
	}

	@Override
	public void deleteCertificat(Certificat certificat) {
		certificatRepository.delete(certificat);
	}

	@Override
	public Certificat updateCertificat(Certificat certificat) {
		return certificatRepository.save(certificat);
		
	}

	

	@Override
	public Certificat findById_certificat(Long id_certificat) {
		return certificatRepository.findById(id_certificat).get();

	}

	

	@Override
	public List<Certificat> findAll() {
		return certificatRepository.findAll();
	}
	
	
	

}
