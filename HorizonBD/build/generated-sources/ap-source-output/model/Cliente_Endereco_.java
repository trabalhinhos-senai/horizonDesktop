package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cidade;
import model.Clientes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-09T19:36:58")
@StaticMetamodel(Cliente_Endereco.class)
public class Cliente_Endereco_ { 

    public static volatile SingularAttribute<Cliente_Endereco, Clientes> cliente;
    public static volatile SingularAttribute<Cliente_Endereco, Cidade> cidade;
    public static volatile SingularAttribute<Cliente_Endereco, Integer> num_end_cliente;
    public static volatile SingularAttribute<Cliente_Endereco, String> endereco_cliente;
    public static volatile SingularAttribute<Cliente_Endereco, Integer> ID;
    public static volatile SingularAttribute<Cliente_Endereco, String> bairro_cliente;
    public static volatile SingularAttribute<Cliente_Endereco, String> complemento_endereco;
    public static volatile SingularAttribute<Cliente_Endereco, String> cep_cliente;

}