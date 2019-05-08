package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.OperationSurDent;

public interface OperationSurDentController {
	public void addOperationSurDent(OperationSurDent operationSurDent);
	public void deleteOperationSurDent(OperationSurDent operationSurDent);
	public OperationSurDent updateOperationSurDent(OperationSurDent operationSurDent);
	public OperationSurDent findById_operation(Long id_operation);
	public List<OperationSurDent> findAll();
}
