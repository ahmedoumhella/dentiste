package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.OperationSurDentMetier;
@Service
@Transactional
public class OperationSurDentMetierImpl implements OperationSurDentMetier {
    @Autowired
	private OperationSurDentR operationSurDentRepository ;

	@Override
	public void addOperationSurDent(OperationSurDent operationSurDent) {
		operationSurDentRepository.save(operationSurDent);
	}

	@Override
	public void deleteOperationSurDent(OperationSurDent operationSurDent) {
		operationSurDentRepository.delete(operationSurDent);
	}

	@Override
	public OperationSurDent updateOperationSurDent(OperationSurDent operationSurDent) {
		return operationSurDentRepository.save(operationSurDent);
		
	}

	

	@Override
	public OperationSurDent findById_operation(Long id_operation) {
		return operationSurDentRepository.findById(id_operation).get();

	}

	

	@Override
	public List<OperationSurDent> findAll() {
		return operationSurDentRepository.findAll();
	}
	
	
	

}
