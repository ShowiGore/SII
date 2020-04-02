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
public class Usuario implements Serializable {
	
	@Id
	private String UID_Usuario;
	@Column(nullable = false)
	private String Nombre;
	@Column(nullable = false)
	private String Apellidos;
	
	@ManyToMany//participa
	private List <Actividad> actividades;
        
	@OneToMany//propone
	private List <Actividad> propuesta;
        
        @ManyToOne
        private Administrador administrador;
        
        @ManyToMany//conoce
        private List <Ambito> ambitos;
	
	public Usuario() {
		super();
	} 
	public String getUID_Usuario() {
		return this.UID_Usuario;
	}
	public void setUID_Usuario(String uid) {
		this.UID_Usuario = uid;
	}
	public String getNombre() {
		return this.Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre=nombre;
	}
	public String getApellidos() {
		return this.Apellidos;
	}
	public void setApellidos(String apellidos) {
		this.Apellidos=apellidos;
	}
	
}