package ma.dentiste.entites;


import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor 
@Entity @Inheritance(strategy=InheritanceType.SINGLE_TABLE) @DiscriminatorColumn(name="TYPE_PERSONNE")
public abstract class  Personne 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_personne ;
	private String nom ;
	private String prenom ;
	private String cin;
	private Date date_naissance;
	private String ville ;
	private String pays;
	private String telephone ;
	private String sexe ;
	private Date date_ajoute  ;
	
	@Column(name="TYPE_PERSONNE",insertable=false,updatable=false)
	  String discriminator;
	@OneToOne
	@JoinColumn(name="id_profil")
	private Profil profil;
}
