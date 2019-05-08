package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.Certificat;

public interface CertificatController {
	public void addCertificat(Certificat certificat);
	public void deleteCertificat(Certificat certificat);
	public Certificat updateCertificat(Certificat certificat);
	public Certificat findById_certificat(Long id_certificat);
	public List<Certificat> findAll();
}
