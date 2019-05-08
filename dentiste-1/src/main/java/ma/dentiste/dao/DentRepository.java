package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.Dent;

public interface DentRepository extends JpaRepository<Dent, Long>{

}
