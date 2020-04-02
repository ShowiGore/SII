package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Actividad;
import jpa.Administrador;
import jpa.Usuario;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-04-02T22:54:53")
@StaticMetamodel(Ambito.class)
public class Ambito_ { 

    public static volatile SingularAttribute<Ambito, String> Nombre;
    public static volatile ListAttribute<Ambito, Administrador> administradores;
    public static volatile SingularAttribute<Ambito, Long> id;
    public static volatile ListAttribute<Ambito, Actividad> actividades;
    public static volatile ListAttribute<Ambito, Usuario> usuarios;

}