package ma.dentiste.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor 
@Entity
public class TypeOperation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_type ; 
	private String libelle;
	private Double prix_default;
	@OneToMany(mappedBy="type")
	private Set<OperationSurDent> operatiens= new HashSet<>();

}
