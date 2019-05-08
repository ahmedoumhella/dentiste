package ma.dentiste.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @EqualsAndHashCode(callSuper=false)
@Entity @DiscriminatorValue("personne")
public class Dentiste extends Personne {
	
	

	@OneToMany(mappedBy="dentiste")
	private Set<Consultation> consultations= new HashSet<>();
	
	@OneToMany(mappedBy="dentiste")
	private Set<ProtheseDentaire> ProtheseDentaires= new HashSet<>();

	
}
