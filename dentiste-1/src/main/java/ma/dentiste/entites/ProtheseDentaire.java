package ma.dentiste.entites;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class ProtheseDentaire {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_PD ;
	private String mesure ;
	private String descreption ;
	private Date date ;
	
	@ManyToOne
	@JoinColumn(name="id_dentist")
	private Dentiste dentiste ;
	@ManyToOne
	@JoinColumn(name="id_patient")
	private Patient patient ;

	@ManyToOne
	@JoinColumn(name="id_prothesiste")
	private Prothesiste prothesiste ;
	
}
