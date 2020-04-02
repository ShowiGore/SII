package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Actividad;
import jpa.Administrador;
import jpa.Ambito;
import jpa.Curso;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-04-02T22:54:53")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> Nombre;
    public static volatile ListAttribute<Usuario, Curso> cursos;
    public static volatile SingularAttribute<Usuario, String> Apellidos;
    public static volatile ListAttribute<Usuario, Administrador> administrador;
    public static volatile SingularAttribute<Usuario, String> UID_Usuario;
    public static volatile ListAttribute<Usuario, Actividad> propuesta;
    public static volatile ListAttribute<Usuario, Ambito> ambitos;
    public static volatile ListAttribute<Usuario, Actividad> actividades;

}