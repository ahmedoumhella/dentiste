package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.Certificat;

public interface CertificatRepository extends JpaRepository<Certificat, Long>{

}
