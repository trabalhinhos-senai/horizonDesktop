package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TabelaOrcamento;
import model.TabelaOrcamentoProduto;
import model.TbFornecedor;
import model.TbOrcamento;
import util.ConexaoBD;

public class OrcamentoRep {

    private static final String INSERT_ADD_ORCAMENTO = "insert into tabela_orcamento (obs_geral_orcamento, status_orcamento,nome_cliente_orcamento,telefone_orcamento,cpf_ou_cnpj_orcamento,valor_adicional,data_orcamento) values (?,?,?,?,?,?,?);";

    private static final String INSERT_ADD_ORCAMENTO_PRODUTO = "insert into tabela_orcamento_produto (d_prod_1,p_unit_1,q_item_1,d_prod_2,p_unit_2,q_item_2,d_prod_3,p_unit_3,q_item_3,d_prod_4,p_unit_4,q_item_4,d_prod_5,p_unit_5,q_item_5,d_prod_6,p_unit_6,q_item_6,d_prod_7,p_unit_7,q_item_7,d_prod_8,p_unit_8,q_item_8,d_prod_9,p_unit_9,q_item_9) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

    private static final String SELECT_TABELA_ORCAMENTO = "select * from tabela_orcamento";

    private static final String SELECT_TABELA_ORCAMENTO_PRODUTO = "select * from tabela_orcamento_produto";

    private static final String DELETE_ORCAMENTO_PRODUTO = "delete from tabela_orcamento_produto where id_orcamento = ?";

    private static final String DELETE_ORCAMENTO = "delete from tabela_orcamento where id_orcamento = ?";

    private static final String UPDATE_MODIF_ORCAMENTO = "update tabela_orcamento set obs_geral_orcamento = ?, status_orcamento=?, nome_cliente_orcamento=?,telefone_orcamento=?, cpf_ou_cnpj_orcamento=?, valor_adicional=?, data_orcamento=? where id_orcamento = ?";

    private static final String UPDATE_MODIF_ORCAMENTO_PRODUTO = "update tabela_orcamento_produto set d_prod_1=?, p_unit_1=?, q_item_1=?, d_prod_2=?, p_unit_2=?, q_item_2=?, d_prod_3=?, p_unit_3=?, q_item_3=?, d_prod_4=?, p_unit_4=?, q_item_4=?, d_prod_5=?, p_unit_5=?, q_item_5=?, d_prod_6=?, p_unit_6=?, q_item_6=?, d_prod_7=?, p_unit_7=?, q_item_7=?, d_prod_8=?,p_unit_8=?, q_item_8=?, d_prod_9=?, p_unit_9=?, q_item_9=? where id_orcamento = ?";

    private static final String pesquisar_fornecedor = " select * from tabela_orcamento where nome_fornecedor like ";

    private Connection connection = ConexaoBD.conectarBanco();
    private PreparedStatement pstm;
    String query;
    String variavel = SELECT_TABELA_ORCAMENTO;

    public OrcamentoRep(String query) {
        this.query = query;
        this.variavel = query;
    }

    public OrcamentoRep() {
    }

    public void salvarAddOrcamento(TabelaOrcamento orcamentoAdd) {

        try {

            pstm = connection.prepareStatement(INSERT_ADD_ORCAMENTO);
            pstm.setString(1, orcamentoAdd.getObsGeralOrcamento());
            pstm.setInt(2, orcamentoAdd.getStatusOrcamento());
            pstm.setString(3, orcamentoAdd.getNomeClienteOrcamento());
            pstm.setString(4, orcamentoAdd.getTelefoneOrcamento());
            pstm.setString(5, orcamentoAdd.getCpfOuCnpjOrcamento());
            pstm.setBigDecimal(6, orcamentoAdd.getValorAdicional());
            pstm.setObject(7, orcamentoAdd.getDataOrcamento());

            System.out.println("insert");

            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public void salvarAddOrcamentoProduto(TabelaOrcamentoProduto orcamentoProdutoAdd) {

        try {

            pstm = connection.prepareStatement(INSERT_ADD_ORCAMENTO_PRODUTO);
            pstm.setString(1, orcamentoProdutoAdd.getDProd1());
            pstm.setBigDecimal(2, orcamentoProdutoAdd.getPUnit1());
            pstm.setInt(3, orcamentoProdutoAdd.getQItem1());

            pstm.setString(4, orcamentoProdutoAdd.getDProd2());
            pstm.setBigDecimal(5, orcamentoProdutoAdd.getPUnit2());
            pstm.setInt(6, orcamentoProdutoAdd.getQItem2());

            pstm.setString(7, orcamentoProdutoAdd.getDProd3());
            pstm.setBigDecimal(8, orcamentoProdutoAdd.getPUnit3());
            pstm.setInt(9, orcamentoProdutoAdd.getQItem3());

            pstm.setString(10, orcamentoProdutoAdd.getDProd4());
            pstm.setBigDecimal(11, orcamentoProdutoAdd.getPUnit4());
            pstm.setInt(12, orcamentoProdutoAdd.getQItem4());

            pstm.setString(13, orcamentoProdutoAdd.getDProd5());
            pstm.setBigDecimal(14, orcamentoProdutoAdd.getPUnit5());
            pstm.setInt(15, orcamentoProdutoAdd.getQItem5());

            pstm.setString(16, orcamentoProdutoAdd.getDProd6());
            pstm.setBigDecimal(17, orcamentoProdutoAdd.getPUnit6());
            pstm.setInt(18, orcamentoProdutoAdd.getQItem6());

            pstm.setString(19, orcamentoProdutoAdd.getDProd7());
            pstm.setBigDecimal(20, orcamentoProdutoAdd.getPUnit7());
            pstm.setInt(21, orcamentoProdutoAdd.getQItem7());

            pstm.setString(22, orcamentoProdutoAdd.getDProd8());
            pstm.setBigDecimal(23, orcamentoProdutoAdd.getPUnit8());
            pstm.setInt(24, orcamentoProdutoAdd.getQItem8());

            pstm.setString(25, orcamentoProdutoAdd.getDProd9());
            pstm.setBigDecimal(26, orcamentoProdutoAdd.getPUnit9());
            pstm.setInt(27, orcamentoProdutoAdd.getQItem9());

//            pstm.setInt(28, orcamentoProdutoAdd.getIdOrcamento());
            System.out.println("insert");

            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public String pesquisar(String campoPesquisa, String busca, String campoStatus) {
        variavel = SELECT_TABELA_ORCAMENTO;

        switch (campoPesquisa) {
            case "Nome":
                variavel += " where nome_cliente_orcamento like " + "'%" + busca + "%'";
                break;
            case "ID":
                variavel += " where id_orcamento like " + "'%" + busca + "%'";
                break;
        }

        switch (campoStatus) {
            case ("Todos"):

                break;
            case ("Aguardando Aprovação"):

                variavel += " and status_orcamento = 1;";
                break;
            case ("Aprovado"):

                variavel += " and status_orcamento = 2;";
                break;
            case ("Não Aprovado"):

                variavel += " and status_orcamento = 3;";
                break;
        }
        System.out.println(variavel);
        return variavel;

    }

    public void salvarModifOrcamentoProduto(TabelaOrcamentoProduto orcamentoModifProduto) {
        try {
            pstm = connection.prepareStatement(UPDATE_MODIF_ORCAMENTO_PRODUTO);

            pstm.setString(1, orcamentoModifProduto.getDProd1());
            pstm.setBigDecimal(2, orcamentoModifProduto.getPUnit1());
            pstm.setInt(3, orcamentoModifProduto.getQItem1());

            pstm.setString(4, orcamentoModifProduto.getDProd2());
            pstm.setBigDecimal(5, orcamentoModifProduto.getPUnit2());
            pstm.setInt(6, orcamentoModifProduto.getQItem2());

            pstm.setString(7, orcamentoModifProduto.getDProd3());
            pstm.setBigDecimal(8, orcamentoModifProduto.getPUnit3());
            pstm.setInt(9, orcamentoModifProduto.getQItem3());

            pstm.setString(10, orcamentoModifProduto.getDProd4());
            pstm.setBigDecimal(11, orcamentoModifProduto.getPUnit4());
            pstm.setInt(12, orcamentoModifProduto.getQItem4());

            pstm.setString(13, orcamentoModifProduto.getDProd5());
            pstm.setBigDecimal(14, orcamentoModifProduto.getPUnit5());
            pstm.setInt(15, orcamentoModifProduto.getQItem5());

            pstm.setString(16, orcamentoModifProduto.getDProd6());
            pstm.setBigDecimal(17, orcamentoModifProduto.getPUnit6());
            pstm.setInt(18, orcamentoModifProduto.getQItem6());

            pstm.setString(19, orcamentoModifProduto.getDProd7());
            pstm.setBigDecimal(20, orcamentoModifProduto.getPUnit7());
            pstm.setInt(21, orcamentoModifProduto.getQItem7());

            pstm.setString(22, orcamentoModifProduto.getDProd8());
            pstm.setBigDecimal(23, orcamentoModifProduto.getPUnit8());
            pstm.setInt(24, orcamentoModifProduto.getQItem8());

            pstm.setString(25, orcamentoModifProduto.getDProd9());
            pstm.setBigDecimal(26, orcamentoModifProduto.getPUnit9());
            pstm.setInt(27, orcamentoModifProduto.getQItem9());

            pstm.setInt(28, orcamentoModifProduto.getIdOrcamento());

            pstm.execute();
            pstm.close();
            System.out.println("update");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public void salvarModifOrcamento(TabelaOrcamento orcamentoModif) {
        try {
            pstm = connection.prepareStatement(UPDATE_MODIF_ORCAMENTO);
            pstm.setString(1, orcamentoModif.getObsGeralOrcamento());
            pstm.setInt(2, orcamentoModif.getStatusOrcamento());
            pstm.setString(3, orcamentoModif.getNomeClienteOrcamento());
            pstm.setString(4, orcamentoModif.getTelefoneOrcamento());
            pstm.setString(5, orcamentoModif.getCpfOuCnpjOrcamento());
            pstm.setBigDecimal(6, orcamentoModif.getValorAdicional());
            pstm.setObject(7, orcamentoModif.getDataOrcamento());
            pstm.setInt(8, orcamentoModif.getIdOrcamento());

            pstm.execute();
            pstm.close();
            System.out.println("update");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public void excluirOrcamentoProduto(TabelaOrcamentoProduto orcamento) {
        try {
            pstm = connection.prepareStatement(DELETE_ORCAMENTO_PRODUTO);
            pstm.setInt(1, orcamento.getIdOrcamento());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }

    }

    public void excluir(TabelaOrcamento orcamento) {
        try {
            pstm = connection.prepareStatement(DELETE_ORCAMENTO);
            pstm.setInt(1, orcamento.getIdOrcamento());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }

    }

    public List<TabelaOrcamentoProduto> listarOrcamentoProduto() {
        List<TabelaOrcamentoProduto> orcamentoProduto = new ArrayList<>();
        ResultSet res;

        try {
            //Percorre o Array preenchendo os campos abaixo do banco de dados
            pstm = connection.prepareStatement(SELECT_TABELA_ORCAMENTO_PRODUTO);
            res = pstm.executeQuery();

            while (res.next()) {
                TabelaOrcamentoProduto e = new TabelaOrcamentoProduto();
                e.setIdOrcamento(res.getInt("id_orcamento"));

                e.setDProd1(res.getString("d_prod_1"));
                e.setPUnit1(res.getBigDecimal("p_unit_1"));
                e.setQItem1(res.getInt("q_item_1"));

                e.setDProd2(res.getString("d_prod_2"));
                e.setPUnit2(res.getBigDecimal("p_unit_2"));
                e.setQItem2(res.getInt("q_item_2"));

                e.setDProd3(res.getString("d_prod_3"));
                e.setPUnit3(res.getBigDecimal("p_unit_3"));
                e.setQItem3(res.getInt("q_item_3"));

                e.setDProd4(res.getString("d_prod_4"));
                e.setPUnit4(res.getBigDecimal("p_unit_4"));
                e.setQItem4(res.getInt("q_item_4"));

                e.setDProd5(res.getString("d_prod_5"));
                e.setPUnit5(res.getBigDecimal("p_unit_5"));
                e.setQItem5(res.getInt("q_item_5"));

                e.setDProd6(res.getString("d_prod_6"));
                e.setPUnit6(res.getBigDecimal("p_unit_6"));
                e.setQItem6(res.getInt("q_item_6"));

                e.setDProd7(res.getString("d_prod_7"));
                e.setPUnit7(res.getBigDecimal("p_unit_7"));
                e.setQItem7(res.getInt("q_item_7"));

                e.setDProd8(res.getString("d_prod_8"));
                e.setPUnit8(res.getBigDecimal("p_unit_8"));
                e.setQItem8(res.getInt("q_item_8"));

                e.setDProd9(res.getString("d_prod_9"));
                e.setPUnit9(res.getBigDecimal("p_unit_9"));
                e.setQItem9(res.getInt("q_item_9"));

                orcamentoProduto.add(e);
            }

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar buscar os estudantes do banco: " + ex.getMessage());
        }

        return orcamentoProduto;

    }

    public List<TabelaOrcamento> listarOrcamento() {
        List<TabelaOrcamento> orcamento = new ArrayList<>();
        ResultSet res;

        try {
            //Percorre o Array preenchendo os campos abaixo do banco de dados
            pstm = connection.prepareStatement(variavel);
            res = pstm.executeQuery();

            while (res.next()) {
                TabelaOrcamento e = new TabelaOrcamento();
                e.setIdOrcamento(res.getInt("id_orcamento"));
                e.setObsGeralOrcamento(res.getString("obs_geral_orcamento"));
                e.setStatusOrcamento(res.getInt("status_orcamento"));
                e.setNomeClienteOrcamento(res.getString("nome_cliente_orcamento"));
                e.setTelefoneOrcamento(res.getString("telefone_orcamento"));
                e.setCpfOuCnpjOrcamento(res.getString("cpf_ou_cnpj_orcamento"));
                e.setValorAdicional(res.getBigDecimal("valor_adicional"));
                e.setDataOrcamento(res.getDate("data_orcamento"));

                orcamento.add(e);
            }

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar buscar os estudantes do banco: " + ex.getMessage());
        }

        return orcamento;

    }
}
