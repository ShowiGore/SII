package jpa;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Voluntario extends Usuario implements Serializable {
	
        @Column(unique=true)
	private String email;
        
	@ManyToMany//estudia
	private List<Curso> cursos;
	
	public Voluntario() {
		super();
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
}
