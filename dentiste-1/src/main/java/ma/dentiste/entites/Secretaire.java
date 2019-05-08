package ma.dentiste.entites;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @EqualsAndHashCode(callSuper=false)
@Entity @DiscriminatorValue("secretaire")
public class Secretaire extends Personne {
	
	
	@OneToMany(mappedBy="secretaire")
	private Set<RDV> rdvs= new HashSet<>();

}
