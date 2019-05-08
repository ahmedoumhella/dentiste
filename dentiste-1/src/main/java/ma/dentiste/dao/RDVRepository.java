package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.RDV;

public interface RDVRepository extends JpaRepository<RDV, Long> {

}
