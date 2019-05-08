package ma.dentiste.metier;

import java.util.List;

import ma.dentiste.entites.RDV;

public interface RDVMetier {
	public void addRDV(RDV rdv);
	public void deleteRDV(RDV rdv);
	public RDV updateRDV(RDV rdv);
	public RDV findById_rdv(Long id_rdv);
	public List<RDV> findAll();
}
