package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.RecettePlanTraitement;

public interface RecettePlanTraitementMetier {
	public void addRecettePlanTraitement(RecettePlanTraitement recettePlanTraitement);
	public void deleteRecettePlanTraitement(RecettePlanTraitement recettePlanTraitement);
	public RecettePlanTraitement updateRecettePlanTraitement(RecettePlanTraitement recettePlanTraitement);
	public RecettePlanTraitement findById_recettePlanTraitement(Long id_recettePlanTraitement);
	public List<RecettePlanTraitement> findAll();
}
