package ma.dentiste.entites;

import java.util.Date;

import javax.persistence.*;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class RecettePlanTraitement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_recettePlanTraitement;
	private Date date ;
	private Double montant_paye;
	
	@ManyToOne
	@JoinColumn(name="id_facturePlanTraitement")
	private FacturePlanTraitement facturePlanTraitement ;
}
