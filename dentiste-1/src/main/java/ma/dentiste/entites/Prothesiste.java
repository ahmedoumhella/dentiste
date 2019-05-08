package ma.dentiste.entites;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @EqualsAndHashCode(callSuper=false)
@Entity @DiscriminatorValue("prothesiste")
public class Prothesiste extends Personne {

	
	@OneToMany(mappedBy="prothesiste")
	private Set<ProtheseDentaire> ProtheseDentaires= new HashSet<>();

}
