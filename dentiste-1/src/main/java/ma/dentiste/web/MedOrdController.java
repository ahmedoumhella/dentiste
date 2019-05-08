package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.MedOrd;
import ma.dentiste.entites.Pk;

public interface MedOrdController {
	public void addMedOrd(MedOrd medOrd);
	public void deleteMedOrd(MedOrd medOrd);
	public MedOrd updateMedOrd(MedOrd medOrd);
	public MedOrd findById(Pk pk);
	public List<MedOrd> findAll();
}
