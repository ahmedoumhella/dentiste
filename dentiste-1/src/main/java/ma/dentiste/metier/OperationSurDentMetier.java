package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.OperationSurDent;

public interface OperationSurDentMetier {
	public void addOperationSurDent(OperationSurDent operationSurDent);
	public void deleteOperationSurDent(OperationSurDent operationSurDent);
	public OperationSurDent updateOperationSurDent(OperationSurDent operationSurDent);
	public OperationSurDent findById_operation(Long id_operation);
	public List<OperationSurDent> findAll();
}
