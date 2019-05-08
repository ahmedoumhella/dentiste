package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.AntecedentMedicale;

public interface AntecedentMedicaleController {
	public void addAntecedentMedicale(AntecedentMedicale antecedentMedicale);
	public void deleteAntecedentMedicale(AntecedentMedicale antecedentMedicale);
	public AntecedentMedicale updateAntecedentMedicale(AntecedentMedicale antecedentMedicale);
	public AntecedentMedicale findById_antecedentMedicale(Long id_antecedent);
	public List<AntecedentMedicale> findAll();
}
