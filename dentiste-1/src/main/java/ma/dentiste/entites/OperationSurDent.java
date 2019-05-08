package ma.dentiste.entites;


import javax.persistence.*;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class OperationSurDent {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_operation ; 
	private String cmnt ;
	@ManyToOne
	@JoinColumn(name="id_dent")
	private Dent dent;
	
	@ManyToOne
	@JoinColumn(name="id_type")
	private TypeOperation type;
	
	
	@ManyToOne
	@JoinColumn(name="id_planTraitement")
	private PlanTraitement planTraitement;
	
	@ManyToOne
	@JoinColumn(name="id_consultation")
	private Consultation consultation;
	
}
