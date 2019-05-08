package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.Ordonnance;

public interface OrdonnanceRepository extends JpaRepository<Ordonnance, Long> {

}
