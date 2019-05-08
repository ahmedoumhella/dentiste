package ma.dentiste.entites;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class Profil {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_profil ;
	private String login;
	private String password;
	
	@OneToOne(mappedBy="profil")

	private Personne personne ;

}
