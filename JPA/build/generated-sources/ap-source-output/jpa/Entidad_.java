package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Actividad;
import jpa.Afiliado;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-04-02T22:54:53")
@StaticMetamodel(Entidad.class)
public class Entidad_ { 

    public static volatile SingularAttribute<Entidad, String> Nombre;
    public static volatile SingularAttribute<Entidad, String> Email;
    public static volatile ListAttribute<Entidad, Actividad> actividadesO;
    public static volatile SingularAttribute<Entidad, String> NIF;
    public static volatile SingularAttribute<Entidad, String> Descripcion;
    public static volatile ListAttribute<Entidad, Afiliado> afiliados;

}