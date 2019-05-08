package ma.dentiste.entites;
import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class MedOrd {
	@Id
	private Pk pk ;
	private int nbr_boite;
	private int nbr_comprimer ;
	private String periode ;
	

}
