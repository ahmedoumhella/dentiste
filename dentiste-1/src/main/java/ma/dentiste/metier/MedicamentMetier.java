package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.Medicament;

public interface MedicamentMetier {
	public void addMedicament(Medicament medicament);
	public void deleteMedicament(Medicament medicament);
	public Medicament updateMedicament(Medicament medicament);
	public Medicament findById_medicament(Long id_medicament);
	public List<Medicament> findAll();
}
