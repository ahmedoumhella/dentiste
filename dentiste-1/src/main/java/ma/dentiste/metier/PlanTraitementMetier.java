package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.PlanTraitement;

public interface PlanTraitementMetier {
	public void addPlanTraitement(PlanTraitement planTraitement);
	public void deletePlanTraitement(PlanTraitement planTraitement);
	public PlanTraitement updatePlanTraitement(PlanTraitement planTraitement);
	public PlanTraitement findById_planTraitement(Long id_planTraitement);
	public List<PlanTraitement> findAll();
}
