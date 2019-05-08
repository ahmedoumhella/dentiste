package ma.dentiste.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class Medicament {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_medicament;
	private String libelle ;
	
	
	

	@OneToMany (mappedBy="pk.medicament") 
	private Set<MedOrd> MedOrds=new HashSet<>();

}
