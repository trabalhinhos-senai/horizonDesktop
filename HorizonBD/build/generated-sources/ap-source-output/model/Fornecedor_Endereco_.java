package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cidade;
import model.Fornecedor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-09T19:36:58")
@StaticMetamodel(Fornecedor_Endereco.class)
public class Fornecedor_Endereco_ { 

    public static volatile SingularAttribute<Fornecedor_Endereco, Integer> num_endereco;
    public static volatile SingularAttribute<Fornecedor_Endereco, String> endereco;
    public static volatile SingularAttribute<Fornecedor_Endereco, Cidade> id_cidade;
    public static volatile SingularAttribute<Fornecedor_Endereco, Fornecedor> id_fornecedor;
    public static volatile SingularAttribute<Fornecedor_Endereco, String> bairro;
    public static volatile SingularAttribute<Fornecedor_Endereco, Integer> ID;
    public static volatile SingularAttribute<Fornecedor_Endereco, String> cep_fornecedor;

}