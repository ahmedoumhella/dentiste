package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.Medicament;

public interface MedicamentRepository extends JpaRepository<Medicament, Long>{

}
