package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TbProdutos;

import util.ConexaoBD;

//id_produto    cod_barras_prod     cod_ref_prod    unid_medida_prod    preco_custo_prod    preco_venda_prod    margem_lucro_drop
//situacao_prod     data_cadastro_prod      data_alteracao_prod     observacao_prod     nome_prod       id_fornecedor
public class ProdutoRep {

    private static final String INSERT_ADD_PRODUTO = "insert into tb_produtos (cod_barras_prod, cod_ref_prod, unid_medida_prod, preco_custo_prod, preco_venda_prod, margem_lucro_prod, situacao_prod, data_cadastro_prod, data_alteracao_prod, observacao_prod, nome_prod, nome_fornecedor, categoria_prod) values (?,?,?,?,?,?,?,?,?,?,?,?,?);";

    private static final String SELECT = "select * from tb_produtos";

    private static final String DELETE_PRODUTO = "delete from tb_produtos where id_produto = ?";

    private static final String UPDATE_MODIF_PRODUTO = "update tb_produtos set cod_barras_prod = ?, cod_ref_prod = ?, unid_medida_prod = ?, preco_custo_prod = ?, preco_venda_prod = ?, margem_lucro_prod = ?, situacao_prod = ?, data_cadastro_prod = ?, data_alteracao_prod = ?, observacao_prod = ?, nome_prod = ?, nome_fornecedor = ?, categoria_prod = ? where id_produto = ?";

    private static final String PESQUISAR_PRODUTO = " select * from tb_produtos where nome_prod like ";

    private Connection connection = ConexaoBD.conectarBanco();
    private PreparedStatement pstm;

    private String query;
    private String variavel = SELECT;

    //construtores e pesquisa_______
    public ProdutoRep() {

    }

    public ProdutoRep(String query) {
        this.variavel = query;
        this.query = query;
    }
    //______________________________

    //Pesquisar_____________________
    public String pesquisar(String campoPesquisa, String campoStatus, String busca) {
        variavel = SELECT;
        switch (campoPesquisa) {
            case "Todos":
                
                break;
            case "Nome":
                variavel += " where nome_prod like " + "'%" + busca + "%'"  ;
                break;
            case "Cód. Referência":
                variavel += " where cod_ref_prod like " + "'%" + busca + "%'" ;
                break;
            case "Cód. Barras":
                variavel += " where cod_barras_prod like " + "'%" + busca + "%'";
                break;
        }

        switch (campoStatus) {
            case ("Todos"):
                
                break;
            case ("Ativos"):
                if (campoPesquisa.equals("Ativos")) {
                    variavel += " where situacao_prod = 1;";
                } else {
                    variavel += " where situacao_prod = 1;" ;
                }
                break;
            case ("Inativos"):
                if (campoPesquisa.equals("Inativos")) {
                    variavel += " where situacao_prod = 2;";
                } else {
                    variavel += " where situacao_prod = 2;";
                }
                break;
        }

        return variavel;
    }

    //______________________________
    //crud__________________________
    public void salvarAdd(TbProdutos produtoAdd) {

        try {

            pstm = connection.prepareStatement(INSERT_ADD_PRODUTO);
            pstm.setInt(1, produtoAdd.getCodBarrasProd());
            pstm.setInt(2, produtoAdd.getCodRefProd());
            pstm.setString(3, produtoAdd.getUnidMedidaProd());
            pstm.setBigDecimal(4, produtoAdd.getPrecoCustoProd());
            pstm.setBigDecimal(5, produtoAdd.getPrecoVendaProd());
            pstm.setDouble(6, produtoAdd.getMargemLucroProd());
            pstm.setInt(7, produtoAdd.getSituacaoProd());
            pstm.setObject(8, produtoAdd.getDataCadastroProd());
            pstm.setObject(9, produtoAdd.getDataAlteracaoProd());
            pstm.setString(10, produtoAdd.getObservacaoProd());
            pstm.setString(11, produtoAdd.getNomeProd());
            pstm.setString(12, produtoAdd.getNomeFornecedor());
            pstm.setString(13, produtoAdd.getCategoriaProd());
            System.out.println("insert");

            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public void salvarModif(TbProdutos produtoModif) {
        try {
            pstm = connection.prepareStatement(UPDATE_MODIF_PRODUTO);
            pstm.setInt(1, produtoModif.getCodBarrasProd());
            pstm.setInt(2, produtoModif.getCodRefProd());
            pstm.setString(3, produtoModif.getUnidMedidaProd());
            pstm.setBigDecimal(4, produtoModif.getPrecoCustoProd());
            pstm.setBigDecimal(5, produtoModif.getPrecoVendaProd());
            pstm.setDouble(6, produtoModif.getMargemLucroProd());
            pstm.setInt(7, produtoModif.getSituacaoProd());
            pstm.setObject(8, produtoModif.getDataCadastroProd());
            pstm.setObject(9, produtoModif.getDataAlteracaoProd());
            pstm.setString(10, produtoModif.getObservacaoProd());
            pstm.setString(11, produtoModif.getNomeProd());
            pstm.setString(12, produtoModif.getNomeFornecedor());
            pstm.setString(13, produtoModif.getCategoriaProd());
            pstm.setInt(14, produtoModif.getIdProduto());

            System.out.println("update");
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public void excluir(TbProdutos produto) {
        try {
            pstm = connection.prepareStatement(DELETE_PRODUTO);
            pstm.setInt(1, produto.getIdProduto());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public List<TbProdutos> listar() {
        List<TbProdutos> produtos = new ArrayList<>();
        ResultSet res;

        try {
            //Percorre o Array preenchendo os campos abaixo do banco de dados
            pstm = connection.prepareStatement(variavel);
            res = pstm.executeQuery();

            while (res.next()) {
                TbProdutos e = new TbProdutos();
                e.setIdProduto(res.getInt("id_produto"));
                e.setCodBarrasProd(res.getInt("cod_barras_prod"));
                e.setCodRefProd(res.getInt("cod_ref_prod"));
                e.setCategoriaProd(res.getString("categoria_prod"));
                e.setUnidMedidaProd(res.getString("unid_medida_prod"));
                e.setPrecoCustoProd(res.getBigDecimal("preco_custo_prod"));
                e.setPrecoVendaProd(res.getBigDecimal("preco_venda_prod"));
                e.setMargemLucroProd(res.getDouble("margem_lucro_prod"));
                e.setSituacaoProd(res.getInt("situacao_prod"));
                e.setDataCadastroProd(res.getDate("data_cadastro_prod"));
                e.setDataAlteracaoProd(res.getDate("data_alteracao_prod"));
                e.setObservacaoProd(res.getString("observacao_prod"));
                e.setNomeProd(res.getString("nome_prod"));
                e.setNomeFornecedor(res.getString("nome_fornecedor"));
                produtos.add(e);
            }

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar buscar os estudantes do banco: " + ex.getMessage());
        }

        return produtos;

    }
}
