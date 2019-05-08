package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.OperationSurDentController;
@RestController
@RequestMapping(value="/operationSurDent")
public class OperationSurDentControllerImpl implements OperationSurDentController{

	@Autowired
	private OperationSurDentMetier metier;
	
	@RequestMapping(value="/operationSurDents")
	public List<OperationSurDent> findAll(){
	List<OperationSurDent>  operationSurDents =metier.findAll();
	return operationSurDents;
	
	}

	@Override
	@RequestMapping(value="/addOperationSurDent")

	public void addOperationSurDent(OperationSurDent operationSurDent) {
		metier.addOperationSurDent(operationSurDent);
		
	}

	@Override
	@RequestMapping(value="/deleteOperationSurDent")

	public void deleteOperationSurDent(OperationSurDent operationSurDent) {
		metier.deleteOperationSurDent(operationSurDent);
		
	}

	@Override
	@RequestMapping(value="/updateOperationSurDent")

	public OperationSurDent updateOperationSurDent(OperationSurDent operationSurDent) {
		return metier.updateOperationSurDent(operationSurDent);
	}

	@Override
	@RequestMapping(value="/findById/{id_operation}")

	public OperationSurDent findById_operation(@PathVariable("id_operation") Long id_operation) {
		
		try {
			return metier.findById_operation(id_operation) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
