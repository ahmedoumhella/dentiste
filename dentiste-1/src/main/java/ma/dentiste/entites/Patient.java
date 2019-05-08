package ma.dentiste.entites;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @EqualsAndHashCode(callSuper=false)
@Entity @DiscriminatorValue("patient")
public class Patient extends Personne{
private Boolean confirme ;

@OneToMany(mappedBy="patient")
private Set<PlanTraitement> plansTraitement= new HashSet<>();
	
@ManyToMany(mappedBy="patients")
private Set<AntecedentMedicale> antecedents=new HashSet<>();

@OneToOne
@JoinColumn(name="id_assurance")
private Assurance assurance;

@OneToMany(mappedBy="patient")
private Set<RDV> rdvs= new HashSet<>();

@OneToMany(mappedBy="patient")
private Set<Consultation> consultations= new HashSet<>();




@OneToMany(mappedBy="patient")
private Set<ProtheseDentaire> ProtheseDentaires= new HashSet<>();

}
