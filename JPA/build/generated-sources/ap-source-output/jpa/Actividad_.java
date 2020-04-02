package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Afiliado;
import jpa.Ambito;
import jpa.Curso;
import jpa.Entidad;
import jpa.Responsable;
import jpa.Usuario;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-04-02T22:54:53")
@StaticMetamodel(Actividad.class)
public class Actividad_ { 

    public static volatile SingularAttribute<Actividad, String> descripcion;
    public static volatile ListAttribute<Actividad, Curso> cursos;
    public static volatile SingularAttribute<Actividad, String> tipo;
    public static volatile SingularAttribute<Actividad, String> estado;
    public static volatile SingularAttribute<Actividad, Responsable> responsable;
    public static volatile SingularAttribute<Actividad, String> Lugar;
    public static volatile ListAttribute<Actividad, Usuario> usuarios;
    public static volatile SingularAttribute<Actividad, String> nombre;
    public static volatile SingularAttribute<Actividad, Date> fechaFin;
    public static volatile SingularAttribute<Actividad, Date> fechaInicio;
    public static volatile ListAttribute<Actividad, Ambito> ambitos;
    public static volatile SingularAttribute<Actividad, Afiliado> afiliado;
    public static volatile SingularAttribute<Actividad, Usuario> usuario;
    public static volatile SingularAttribute<Actividad, Entidad> entidadesO;
    public static volatile SingularAttribute<Actividad, Long> id;
    public static volatile SingularAttribute<Actividad, String> NumParticipantes;

}