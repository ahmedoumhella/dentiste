package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.MedOrd;
import ma.dentiste.entites.Pk;

public interface MedOrdRepository extends JpaRepository<MedOrd, Pk> {

}
