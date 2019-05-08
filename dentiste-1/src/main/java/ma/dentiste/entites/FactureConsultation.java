package ma.dentiste.entites;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class FactureConsultation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_factureConsultation ;
	private double montant_globale ;
	

	@OneToOne
	@JoinColumn(name="id_consultation")
	private Consultation consultation ;
	
	@OneToMany(mappedBy="factureConsultation")
	private Set<RecetteConsultation> recettesConsultation= new HashSet<>();
}
