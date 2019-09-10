package repository;

import horizonbd.HorizonBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;
import model.TbFornecedor;
import util.ConexaoBD;

public class FornecedoresRep {

    private static final String SELECT = "select * from tb_fornecedor order by nome_fornecedor";

    private static final String DELETE_CLIENTE = "delete from tb_fornecedor where idfornecedor = ?";

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
    

    public void salvarAdd(Fornecedor fornecedor) {

        HorizonBD.getEm().persist(fornecedor);
        
        HorizonBD.getEm().getTransaction().begin();
        HorizonBD.getEm().getTransaction().commit();   
    }
    
    

    public String pesquisar(String campoPesquisa, String busca) {

        if (campoPesquisa.equalsIgnoreCase("Nome")) {

            variavel = pesquisar_fornecedor + "'%" + busca + "%'"+"order by nome_fornecedor";

        }
        
        return variavel;
    }

    public void salvarModif(Fornecedor fornecedor) {
        

        HorizonBD.getEm().merge(fornecedor);

        HorizonBD.getEm().getTransaction().begin();
        HorizonBD.getEm().getTransaction().commit();       
        
    }

    public void excluir(Fornecedor fornecedor) {
        
        HorizonBD.getEm().getTransaction().begin();
        HorizonBD.getEm().remove(HorizonBD.getEm().merge(fornecedor));
        HorizonBD.getEm().getTransaction().commit();

    }

    public List<Fornecedor> listar() {
        List<Fornecedor> fornecedor = new ArrayList<>();
        
        return HorizonBD.getEm().createQuery("select c from fornecedor c").getResultList();

    }
}
