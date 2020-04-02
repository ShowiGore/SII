package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Entidad;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-04-02T22:54:53")
@StaticMetamodel(Afiliado.class)
public class Afiliado_ extends Usuario_ {

    public static volatile SingularAttribute<Afiliado, String> num_tlf;
    public static volatile ListAttribute<Afiliado, Entidad> entidades;
    public static volatile SingularAttribute<Afiliado, String> DNI;
    public static volatile SingularAttribute<Afiliado, String> email;

}