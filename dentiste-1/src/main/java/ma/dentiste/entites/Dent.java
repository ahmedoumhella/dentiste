package ma.dentiste.entites;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
@Entity
public class Dent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_dent ;
	private String numero ;
	private String note ;
	
	
	
	//@ManyToOne
	//@JoinColumn(name="id_schema")
	//private SchemaDentaire schema;
	//modification1
	@OneToMany(mappedBy="dent")
	private Set<OperationSurDent> operatiens= new HashSet<>();

}
