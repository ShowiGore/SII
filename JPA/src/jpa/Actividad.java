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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author David
 */
@Entity
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private String estado;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    private String descripcion;
    private String NumParticipantes;
    private String Lugar;
    
    @ManyToMany//requiere
    @JoinTable(name = "ACTIVIDAD_CURSOS", joinColumns = { @JoinColumn(name = "actividad_fk") }, inverseJoinColumns = { @JoinColumn(name = "cursos_fk") })
    private List<Curso> cursos;
    
    @ManyToMany//participa
    @JoinTable(name = "ACTIVIDAD_USUARIOS", joinColumns = { @JoinColumn(name = "actividad_fk") }, inverseJoinColumns = { @JoinColumn(name = "usuarios_fk") })
    private List<Usuario> usuarios;
    
    @ManyToMany//requiere
    @JoinTable(name = "ACTIVIDAD_AMBITOS", joinColumns = { @JoinColumn(name = "actividad_fk") }, inverseJoinColumns = { @JoinColumn(name = "ambitos_fk") })
    private List<Ambito> ambitos;
    
    @ManyToOne//propone
    private Usuario usuario;
    
    @ManyToOne//valida
    private Responsable responsable;
    
    @ManyToOne//organiza
    private Entidad entidadesO;
    
    @ManyToOne//Valida
    private Afiliado afiliado;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
    public String getNumParticipantes(){
        return this.NumParticipantes;
    }
    
    public void setNumParticipantes(String num){
        this.NumParticipantes=num;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Artist[ id=" + id + " ]";
    }
    
}
