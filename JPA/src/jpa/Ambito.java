package jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Ambito implements Serializable {
    
        
	private static final long serialVersionUID = 1L;
        @Id @GeneratedValue
        private Long id;
        @Column(nullable = false)
	private String Nombre;
	
	@ManyToMany(mappedBy = "ambitos")//requiere
	private List<Actividad> actividades;
	@ManyToMany//conoce
        @JoinTable(name = "USUARIO_AMBITO", joinColumns = { @JoinColumn(name = "usuario_fk") }, inverseJoinColumns = { @JoinColumn(name = "ambito_fk") })
	private List<Usuario> usuarios;
	@ManyToMany(mappedBy = "ambitos")//crea
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
	
	public int hashCode() {
            int hash = 0;
            hash += (id != null ? id.hashCode() : 0);
            return hash;
        }
        
        public boolean equals(Object object) {
             
            if (!(object instanceof Ambito)) {
                return false;
            }
            Ambito other = (Ambito) object;

            if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
                return false;
            }
            return true;
        }
	
	
}
