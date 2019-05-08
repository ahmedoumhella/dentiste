package ma.dentiste.entites;

import java.util.Date;

import javax.persistence.*;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class RecetteConsultation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_recetteConsultation;
	private Date date ;
	private Double montant_paye;
	
	@ManyToOne
	@JoinColumn(name="id_factureConsultation")
	private FactureConsultation factureConsultation ;
}
