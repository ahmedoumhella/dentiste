package ma.dentiste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.dentiste.entites.OperationSurDent;

public interface OperationSurDentR extends JpaRepository<OperationSurDent, Long> {

}
