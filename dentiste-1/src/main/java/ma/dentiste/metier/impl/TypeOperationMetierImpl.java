package ma.dentiste.metier.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.dentiste.dao.*;
import ma.dentiste.entites.*;
import ma.dentiste.metier.TypeOperationMetier;
@Service
@Transactional
public class TypeOperationMetierImpl implements TypeOperationMetier {
    @Autowired
	private TypeOperationRepository typeOperationRepository ;

	@Override
	public void addTypeOperation(TypeOperation typeOperation) {
		typeOperationRepository.save(typeOperation);
	}

	@Override
	public void deleteTypeOperation(TypeOperation typeOperation) {
		typeOperationRepository.delete(typeOperation);
	}

	@Override
	public TypeOperation updateTypeOperation(TypeOperation typeOperation) {
		return typeOperationRepository.save(typeOperation);
		
	}

	

	@Override
	public TypeOperation findById_type(Long id_type) {
		return typeOperationRepository.findById(id_type).get();

	}

	

	@Override
	public List<TypeOperation> findAll() {
		return typeOperationRepository.findAll();
	}
	
	
	

}
