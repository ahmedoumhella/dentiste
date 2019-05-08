package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.TypeOperation;

public interface TypeOperationMetier {
	public void addTypeOperation(TypeOperation typeOperation);
	public void deleteTypeOperation(TypeOperation typeOperation);
	public TypeOperation updateTypeOperation(TypeOperation typeOperation);
	public TypeOperation findById_type(Long id_type);
	public List<TypeOperation> findAll();
}
