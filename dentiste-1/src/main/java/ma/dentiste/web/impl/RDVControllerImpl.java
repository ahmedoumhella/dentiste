package ma.dentiste.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.dentiste.entites.*;
import ma.dentiste.metier.*;
import ma.dentiste.web.RDVController;
@RestController
@RequestMapping(value="/rdv")
public class RDVControllerImpl implements RDVController{

	@Autowired
	private RDVMetier metier;
	
	@RequestMapping(value="/rdvs")
	public List<RDV> findAll(){
	List<RDV>  rdvs =metier.findAll();
	return rdvs;
	
	}

	@Override
	@RequestMapping(value="/addRDV")

	public void addRDV(RDV rdv) {
		metier.addRDV(rdv);
		
	}

	@Override
	@RequestMapping(value="/deleteRDV")

	public void deleteRDV(RDV rdv) {
		metier.deleteRDV(rdv);
		
	}

	@Override
	@RequestMapping(value="/updateRDV")

	public RDV updateRDV(RDV rdv) {
		return metier.updateRDV(rdv);
	}

	@Override
	@RequestMapping(value="/findById/{id_rdv}")

	public RDV findById_rdv(@PathVariable("id_rdv") Long id_rdv) {
		
		try {
			return metier.findById_rdv(id_rdv) ;
			
		}catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	

	
}
