package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.CertificatController;
@RestController
@RequestMapping(value="/certificat")
public class CertificatControllerImpl implements CertificatController{

	@Autowired
	private CertificatMetier metier;
	
	@RequestMapping(value="/certificats")
	public List<Certificat> findAll(){
	List<Certificat>  certificats =metier.findAll();
	return certificats;
	
	}

	@Override
	@RequestMapping(value="/addCertificat")

	public void addCertificat(Certificat certificat) {
		metier.addCertificat(certificat);
		
	}

	@Override
	@RequestMapping(value="/deleteCertificat")

	public void deleteCertificat(Certificat certificat) {
		metier.deleteCertificat(certificat);
		
	}

	@Override
	@RequestMapping(value="/updateCertificat")

	public Certificat updateCertificat(Certificat certificat) {
		return metier.updateCertificat(certificat);
	}

	@Override
	@RequestMapping(value="/findById/{id_certificat}")

	public Certificat findById_certificat(@PathVariable("id_certificat") Long id_certificat) {
		
		try {
			return metier.findById_certificat(id_certificat) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
