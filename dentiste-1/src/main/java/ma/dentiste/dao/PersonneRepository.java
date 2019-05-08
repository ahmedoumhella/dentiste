package ma.dentiste.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.*;

public interface PersonneRepository extends JpaRepository<Personne, Long>{
	Personne findByCin(String cin);


	
}
