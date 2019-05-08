package ma.dentiste.entites;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
@Embeddable
@Data @NoArgsConstructor
public class Pk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@ManyToOne
	@JoinColumn(name="id_ordonnance")
	private Ordonnance ordonnance;
	@ManyToOne
	@JoinColumn(name="id_medicament")
	private Medicament medicament;

}
