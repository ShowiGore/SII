package jpa;

import java.io.Serializable;
import java.lang.String;
import java.util.List;
import javax.persistence.*;

@Entity

public class Entidad implements Serializable {
	
	@Id
	private String NIF;
	@Column(nullable = false)
	private String Nombre;
	private String Descripcion;
	@Column(unique= true)
	private String Email;
	@ManyToMany(mappedBy = "entidades")//pertenece
	private List <Afiliado> afiliados;
	
	@OneToMany//organiza
	private List <Actividad> actividadesO;
	
	public Entidad() { super(); }
	
	public void setNIF (String NIF) {this.NIF = NIF;}
	public String getNIF () {return this.NIF;}
	
	public void setNombre (String Nombre) {this.Nombre = Nombre;}
	public String getNombre () {return this.Nombre;}
	
	public void setDescripcion (String Descripcion) {this.Descripcion = Descripcion;}
	public String getDescripcion () {return this.Descripcion;}
	
	public void setEmail(String email){this.Email=email;}
	public String getEmail(){return this.Email;}
        
        public int hashCode() {
            int hash = 0;
            hash += (NIF != null ? NIF.hashCode() : 0);
            return hash;
        }
        
        public boolean equals(Object object) {
             
            if (!(object instanceof Entidad)) {
                return false;
            }
            Entidad other = (Entidad) object;

            if ((this.NIF == null && other.NIF != null) || (this.NIF != null && !this.NIF.equals(other.NIF))) {
                return false;
            }
            return true;
        }
	
}
