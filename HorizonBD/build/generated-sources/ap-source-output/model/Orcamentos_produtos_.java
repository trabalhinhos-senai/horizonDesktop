package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Orcamentos;
import model.Produtos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-09T19:36:58")
@StaticMetamodel(Orcamentos_produtos.class)
public class Orcamentos_produtos_ { 

    public static volatile SingularAttribute<Orcamentos_produtos, Double> vlr_unidade_produto;
    public static volatile SingularAttribute<Orcamentos_produtos, Produtos> id_Produto;
    public static volatile SingularAttribute<Orcamentos_produtos, Orcamentos> id_Orcamento;
    public static volatile SingularAttribute<Orcamentos_produtos, Integer> ID;
    public static volatile SingularAttribute<Orcamentos_produtos, Integer> qtd_prod;

}