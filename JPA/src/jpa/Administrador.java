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
public class Administrador extends Usuario implements Serializable {
	
        @ManyToMany//administra
	private List<Usuario> usuarios;
	@ManyToMany//crea
	private List<Ambito> ambitos;
	
	public Administrador() {
		super();
	}
        
}
