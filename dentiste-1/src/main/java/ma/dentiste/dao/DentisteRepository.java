package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.Dentiste;

public interface DentisteRepository extends JpaRepository<Dentiste, Long> {

	Dentiste findByCin(String cin);

}
