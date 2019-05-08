package ma.dentiste.entites;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class Assurance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_assurance;
	private String numero_assurance;
	private String nom_assurance;
	private Date date_validite ;
	@OneToOne(mappedBy="assurance")
	private Patient patient;
}
