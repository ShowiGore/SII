package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Actividad;
import jpa.Usuario;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-04-02T22:54:53")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, String> Nombre_Titulacion;
    public static volatile SingularAttribute<Curso, Long> id;
    public static volatile SingularAttribute<Curso, Integer> Curso;
    public static volatile ListAttribute<Curso, Actividad> actividades;
    public static volatile ListAttribute<Curso, Usuario> usuarios;

}