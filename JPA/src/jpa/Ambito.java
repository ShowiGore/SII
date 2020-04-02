package jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Ambito implements Serializable {
    
        
	private static final long serialVersionUID = 1L;
        @Id @GeneratedValue
        private Long id;
        @Column(nullable = false)
	private String Nombre;
	
	@ManyToMany//requiere
	private List<Actividad> actividades;
	@ManyToMany//conoce
	private List<Usuario> usuarios;
	@ManyToMany//crea
	private List<Administrador> administradores;
	
	public Ambito() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		id=id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	
	
}
