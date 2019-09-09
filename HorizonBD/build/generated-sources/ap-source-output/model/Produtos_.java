package model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Fornecedor;
import model.Produto_Categoria;
import model.Produtos_Unid_Medida;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-09T19:36:58")
@StaticMetamodel(Produtos.class)
public class Produtos_ { 

    public static volatile SingularAttribute<Produtos, Produto_Categoria> produtoIdCategoria;
    public static volatile SingularAttribute<Produtos, Fornecedor> IdFornecedor;
    public static volatile SingularAttribute<Produtos, Integer> situacaoProduto;
    public static volatile SingularAttribute<Produtos, Integer> codRefProduto;
    public static volatile SingularAttribute<Produtos, Produtos_Unid_Medida> produtoIdUnidMedida;
    public static volatile SingularAttribute<Produtos, Double> precoCustoProduto;
    public static volatile SingularAttribute<Produtos, Date> dataAlteracaoProduto;
    public static volatile SingularAttribute<Produtos, Date> dataCadastroProduto;
    public static volatile SingularAttribute<Produtos, Double> precoVendaProduto;
    public static volatile SingularAttribute<Produtos, Integer> ID;
    public static volatile SingularAttribute<Produtos, Integer> codBarrasProduto;
    public static volatile SingularAttribute<Produtos, Integer> nomeProduto;
    public static volatile SingularAttribute<Produtos, Integer> excluirProduto;

}