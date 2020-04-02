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

public class Afiliado extends Usuario implements Serializable {
    
    
	@Column(unique=true)
	private String DNI;
        @Column(unique=true)
	private String num_tlf;
        @Column(unique=true)
	private String email;
	
	@ManyToMany//pertenece
	private List<Entidad> entidades;
        
        @OneToMany//valida
        private List<Actividad> actividades;
	
	public Afiliado() {
		super();
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNum_tlf() {
		return num_tlf;
	}

	public void setNum_tlf(String num_tlf) {
		this.num_tlf = num_tlf;
	}
        
        public String getEmail() {
		return num_tlf;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
