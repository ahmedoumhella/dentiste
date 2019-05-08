package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.TypeOperation;

public interface TypeOperationController {
	public void addTypeOperation(TypeOperation typeOperation);
	public void deleteTypeOperation(TypeOperation typeOperation);
	public TypeOperation updateTypeOperation(TypeOperation typeOperation);
	public TypeOperation findById_type(Long id_type);
	public List<TypeOperation> findAll();
}
