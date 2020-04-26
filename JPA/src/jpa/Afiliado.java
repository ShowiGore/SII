package jpa;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
    @JoinTable(name = "AFILIADO_ENTIDADES", joinColumns = { @JoinColumn(name = "afiliado_fk") }, inverseJoinColumns = { @JoinColumn(name = "entidades_fk") })
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
    
    public int hashCode() {
            int hash = 0;
            hash += (DNI != null ? DNI.hashCode() : 0);
            return hash;
       }

    public boolean equals(Object object) {

        if (!(object instanceof Afiliado)) {
            return false;
        }
        Afiliado other = (Afiliado) object;

        if ((this.DNI == null && other.DNI != null) || (this.DNI != null && !this.DNI.equals(other.DNI))) {
            return false;
        }
        return true;
    }
	
}
