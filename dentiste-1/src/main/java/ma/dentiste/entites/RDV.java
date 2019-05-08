package ma.dentiste.entites;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor 
public class RDV {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_rdv;
	private Date date;
	private String  heure ;
	private Date date_ajout;
	
	@ManyToOne
	@JoinColumn(name="id_patient")
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name="id_secretaire")
	private Secretaire secretaire;


}
