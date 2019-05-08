package ma.dentiste.entites;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class AntecedentMedicale {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_antecedent;
	private String libelle;
	private String cmnt ;
	private Date date_ajout ;
	
	@ManyToMany
	@JoinTable(name="malade", joinColumns=@JoinColumn(name="id_antecedent"), inverseJoinColumns=@JoinColumn(name="id_personne"))
	private Set<Patient> patients=new HashSet<>();

}
