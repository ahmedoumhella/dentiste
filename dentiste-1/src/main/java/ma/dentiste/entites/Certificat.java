package ma.dentiste.entites;

import java.util.Date;

import javax.persistence.*;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class Certificat {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_certificat;
	private Date date ;
	private String Contenu;
	
	@OneToOne
	@JoinColumn(name="id_consultation")
	private Consultation consultation ;
}
