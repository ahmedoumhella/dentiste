package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.Prothesiste;;


public interface ProthesisteRepository extends JpaRepository<Prothesiste, Long>{
	Prothesiste findByCin(String cin);

}
