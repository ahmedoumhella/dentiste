package ma.dentiste.entites;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class Ordonnance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_ordonnance ;
	private Date date_ajout ;
	
	@OneToOne
	@JoinColumn(name="id_consultation")
	private Consultation consultation ;
	

	@OneToMany (mappedBy="pk.ordonnance") 
	private Set<MedOrd> MedOrds=new HashSet<>();
}
