package ma.dentiste.entites;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class Consultation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_consultation ;
	private Date date ;
	private String cmnt;
	private Double prix_cons;
	
	@ManyToOne
	@JoinColumn(name="id_dentist")
	private Dentiste dentiste ;
	@ManyToOne
	@JoinColumn(name="id_patient")
	private Patient patient ;
	
	@OneToOne(mappedBy="consultation")
	private Ordonnance  ordonnance;
	
	@OneToOne(mappedBy="consultation")
	private Certificat  certificat;
	
	@OneToOne(mappedBy="consultation")
	private FactureConsultation  factureConsultation;
	
	@OneToMany(mappedBy="consultation")
	private Set<OperationSurDent> operatiens= new HashSet<>();

}
