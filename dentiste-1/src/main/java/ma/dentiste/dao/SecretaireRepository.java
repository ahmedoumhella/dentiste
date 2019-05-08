package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.Secretaire;

public interface SecretaireRepository extends JpaRepository<Secretaire, Long>{
	Secretaire findByCin(String cin);

}
