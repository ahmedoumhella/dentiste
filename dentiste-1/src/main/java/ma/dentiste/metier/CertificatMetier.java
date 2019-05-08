package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.Certificat;

public interface CertificatMetier {
	public void addCertificat(Certificat certificat);
	public void deleteCertificat(Certificat certificat);
	public Certificat updateCertificat(Certificat certificat);
	public Certificat findById_certificat(Long id_certificat);
	public List<Certificat> findAll();
}
