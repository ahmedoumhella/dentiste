package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.MedicamentController;
@RestController
@RequestMapping(value="/medicament")
public class MedicamentControllerImpl implements MedicamentController{

	@Autowired
	private MedicamentMetier metier;
	
	@RequestMapping(value="/medicaments")
	public List<Medicament> findAll(){
	List<Medicament>  medicaments =metier.findAll();
	return medicaments;
	
	}

	@Override
	@RequestMapping(value="/addMedicament")

	public void addMedicament(Medicament medicament) {
		metier.addMedicament(medicament);
		
	}

	@Override
	@RequestMapping(value="/deleteMedicament")

	public void deleteMedicament(Medicament medicament) {
		metier.deleteMedicament(medicament);
		
	}

	@Override
	@RequestMapping(value="/updateMedicament")

	public Medicament updateMedicament(Medicament medicament) {
		return metier.updateMedicament(medicament);
	}

	@Override
	@RequestMapping(value="/findById/{id_medicament}")

	public Medicament findById_medicament(@PathVariable("id_medicament") Long id_medicament) {
		
		try {
			return metier.findById_medicament(id_medicament) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
