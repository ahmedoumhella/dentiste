package ma.dentiste.entites;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor 
@Entity
public class FacturePlanTraitement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_facturePlanTraitement;
	private Date date;
    private Double prix;
    
    @OneToOne
    @JoinColumn(name="id_planTraitement")
    private PlanTraitement planTraitement;
    @OneToMany(mappedBy="facturePlanTraitement")
	private Set<RecettePlanTraitement> recettesPlanTraitement= new HashSet<>();
}
