package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.TypeOperationController;
@RestController
@RequestMapping(value="/typeOperation")
public class TypeOperationControllerImpl implements TypeOperationController{

	@Autowired
	private TypeOperationMetier metier;
	
	@RequestMapping(value="/typeOperations")
	public List<TypeOperation> findAll(){
	List<TypeOperation>  typeOperations =metier.findAll();
	return typeOperations;
	
	}

	@Override
	@RequestMapping(value="/addTypeOperation")

	public void addTypeOperation(TypeOperation typeOperation) {
		metier.addTypeOperation(typeOperation);
		
	}

	@Override
	@RequestMapping(value="/deleteTypeOperation")

	public void deleteTypeOperation(TypeOperation typeOperation) {
		metier.deleteTypeOperation(typeOperation);
		
	}

	@Override
	@RequestMapping(value="/updateTypeOperation")

	public TypeOperation updateTypeOperation(TypeOperation typeOperation) {
		return metier.updateTypeOperation(typeOperation);
	}

	@Override
	@RequestMapping(value="/findById/{id_typeOperation}")

	public TypeOperation findById_type(@PathVariable("id_type") Long id_type) {
		
		try {
			return metier.findById_type(id_type) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
