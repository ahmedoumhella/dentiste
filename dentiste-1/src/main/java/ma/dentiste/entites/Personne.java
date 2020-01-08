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
	public Long getId_personne() {
		return id_personne;
	}
	public void setId_personne(Long id_personne) {
		this.id_personne = id_personne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Date getDate_ajoute() {
		return date_ajoute;
	}
	public void setDate_ajoute(Date date_ajoute) {
		this.date_ajoute = date_ajoute;
	}
	public String getDiscriminator() {
		return discriminator;
	}
	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}
	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
	}
	@OneToOne
	@JoinColumn(name="id_profil")
	private Profil profil;
}
