package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TbFornecedor;
import util.ConexaoBD;

public class FornecedoresRep {

    private static final String INSERT_ADD_FORNECEDOR = "insert into tb_fornecedor (nome_fornecedor) values (?);";

    private static final String SELECT = "select * from tb_fornecedor order by nome_fornecedor";

    private static final String DELETE_CLIENTE = "delete from tb_fornecedor where idfornecedor = ?";

    private static final String UPDATE_MODIF_FORNECEDOR = "update tb_fornecedor set nome_fornecedor=? where idfornecedor = ?";

    private static final String pesquisar_fornecedor = " select * from tb_fornecedor where nome_fornecedor like ";

    private Connection connection = ConexaoBD.conectarBanco();
    private PreparedStatement pstm;
    String query;
    String variavel = SELECT;

    public FornecedoresRep(String query) {
        this.query = query;
        this.variavel=query;
    }

    public FornecedoresRep() {
    }
    

    public void salvarAdd(TbFornecedor fornecedorAdd) {

        try {

            pstm = connection.prepareStatement(INSERT_ADD_FORNECEDOR);
            pstm.setString(1, fornecedorAdd.getNomeFornecedor());

            System.out.println("insert");

            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }
    
    

    public String pesquisar(String campoPesquisa, String busca) {

        if (campoPesquisa.equalsIgnoreCase("Nome")) {

            variavel = pesquisar_fornecedor + "'%" + busca + "%'"+"order by nome_fornecedor";

        }
        
        return variavel;
    }

    public void salvarModif(TbFornecedor fornecedorModif) {
        try {
            pstm = connection.prepareStatement(UPDATE_MODIF_FORNECEDOR);
            pstm.setString(1, fornecedorModif.getNomeFornecedor());
            pstm.setInt(2, fornecedorModif.getIdfornecedor());
            pstm.execute();
            pstm.close();
            System.out.println("update");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public void excluir(TbFornecedor fornecedor) {
        try {
            pstm = connection.prepareStatement(DELETE_CLIENTE);
            pstm.setInt(1, fornecedor.getIdfornecedor());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }

    }

    public List<TbFornecedor> listar() {
        List<TbFornecedor> fornecedor = new ArrayList<>();
        ResultSet res;

        try {
            //Percorre o Array preenchendo os campos abaixo do banco de dados
            pstm = connection.prepareStatement(variavel);
            res = pstm.executeQuery();

            while (res.next()) {
                TbFornecedor e = new TbFornecedor();
                e.setIdfornecedor(res.getInt("idfornecedor"));
                e.setNomeFornecedor(res.getString("nome_fornecedor"));

                fornecedor.add(e);
            }

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar buscar os estudantes do banco: " + ex.getMessage());
        }

        return fornecedor;

    }
}
