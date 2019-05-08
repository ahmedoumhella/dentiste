package ma.dentiste.entites;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class PlanTraitement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_planTraitement ;
	private Date date_ajout ; 
	
	@ManyToOne
	@JoinColumn(name="id_patient")
	private Patient patient;
	
	@OneToOne(mappedBy="planTraitement")
	private FacturePlanTraitement facturePlanTraitement;
	
	@OneToMany(mappedBy="planTraitement")
	private Set<OperationSurDent> operations= new HashSet<>();
}
