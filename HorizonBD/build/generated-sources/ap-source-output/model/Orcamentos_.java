package model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Clientes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-09T19:36:58")
@StaticMetamodel(Orcamentos.class)
public class Orcamentos_ { 

    public static volatile SingularAttribute<Orcamentos, Clientes> id_cliente;
    public static volatile SingularAttribute<Orcamentos, Double> valor_adicional;
    public static volatile SingularAttribute<Orcamentos, Integer> ID;
    public static volatile SingularAttribute<Orcamentos, Date> data_orcamento;
    public static volatile SingularAttribute<Orcamentos, Integer> situacao_orcamento;
    public static volatile SingularAttribute<Orcamentos, String> observacoes_orcamento;

}