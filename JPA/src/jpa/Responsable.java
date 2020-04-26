/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author David
 */
@Entity
public class Responsable extends Usuario implements Serializable {

    
    @Column(unique=true)
    private String DNI;
    private String descripcion;
    
    @OneToMany//valida
    private List <Actividad> actividades;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public int hashCode() {
            int hash = 0;
            hash += (DNI != null ? DNI.hashCode() : 0);
            return hash;
    }
        
    public boolean equals(Object object) {

        if (!(object instanceof Responsable)) {
            return false;
        }
        Responsable other = (Responsable) object;

        if ((this.DNI == null && other.DNI != null) || (this.DNI != null && !this.DNI.equals(other.DNI))) {
            return false;
        }
        return true;
    }
    
}
