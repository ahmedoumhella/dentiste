package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.AntecedentMedicale;

public interface AntecedentMedicaleMetier {
	public void addAntecedentMedicale(AntecedentMedicale antecedentMedicale);
	public void deleteAntecedentMedicale(AntecedentMedicale antecedentMedicale);
	public AntecedentMedicale updateAntecedentMedicale(AntecedentMedicale antecedentMedicale);
	public AntecedentMedicale findById_antecedentMedicale(Long id_antecedent);
	public List<AntecedentMedicale> findAll();
}
