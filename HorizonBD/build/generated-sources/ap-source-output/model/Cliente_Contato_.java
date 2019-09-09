package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Clientes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-09T19:36:58")
@StaticMetamodel(Cliente_Contato.class)
public class Cliente_Contato_ { 

    public static volatile SingularAttribute<Cliente_Contato, String> email_cliente;
    public static volatile SingularAttribute<Cliente_Contato, String> telefone_cliente;
    public static volatile SingularAttribute<Cliente_Contato, String> celular_cliente;
    public static volatile SingularAttribute<Cliente_Contato, Clientes> clienteContato;
    public static volatile SingularAttribute<Cliente_Contato, Integer> ID;
    public static volatile SingularAttribute<Cliente_Contato, String> wpp_cliente;

}