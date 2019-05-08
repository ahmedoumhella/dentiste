package ma.dentiste.web;

import java.util.List;

import ma.dentiste.entites.FacturePlanTraitement;

public interface FacturePlanTraitementController {
	public void addFacturePlanTraitement(FacturePlanTraitement facturePlanTraitement);
	public void deleteFacturePlanTraitement(FacturePlanTraitement facturePlanTraitement);
	public FacturePlanTraitement updateFacturePlanTraitement(FacturePlanTraitement facturePlanTraitement);
	public FacturePlanTraitement findById_facturePlanTraitement(Long id_facturePlanTraitement);
	public List<FacturePlanTraitement> findAll();
}
