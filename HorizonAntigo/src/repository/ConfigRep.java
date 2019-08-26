package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TbConfigSistema;
import util.ConexaoBD;

public class ConfigRep {

    //private static final String INSERT_MODIF_CONFIG = "insert into tb_config_sistema (id_emp_config, nome_emp_config, endereco_emp_config, num_emp_config, bairro_emp_config, cidade_emp_config, telefone_emp_config, email_emp_config) values (?,?,?,?,?,?,?,?);";
    private static final String SELECT = "select * from tb_config_sistema";
    
    private static final String UPDATE_MODIF_CONFIG = "update tb_config_sistema set nome_emp_config=?, endereco_emp_config=?, num_emp_config=?, bairro_emp_config=?, cidade_emp_config=?, telefone_emp_config=?, email_emp_config=? where id_emp_config = ?";

    private Connection connection = ConexaoBD.conectarBanco();
    private PreparedStatement pstm;

    public void salvarModif(TbConfigSistema configAdd) {

        try {
            pstm = connection.prepareStatement(UPDATE_MODIF_CONFIG);
            pstm.setString(1, configAdd.getNomeEmpConfig());
            pstm.setString(2, configAdd.getEnderecoEmpConfig());
            pstm.setInt(3, configAdd.getNumEmpConfig());
            pstm.setString(4, configAdd.getBairroEmpConfig());
            pstm.setString(5, configAdd.getCidadeEmpCliente());
            pstm.setString(6, configAdd.getTelefoneEmpCliente());
            pstm.setString(7, configAdd.getEmailEmpCliente());
            pstm.setInt(8, configAdd.getIdEmpConfig());
            
            pstm.execute();
            pstm.close();
            
            System.out.println("update");
            
            
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public List<TbConfigSistema> listar() {
        List<TbConfigSistema> config = new ArrayList<>();
        ResultSet res;

        try {
            //Percorre o Array preenchendo os campos abaixo do banco de dados
            pstm = connection.prepareStatement(SELECT);
            res = pstm.executeQuery();

            while (res.next()) {
                TbConfigSistema e = new TbConfigSistema();
                e.setNomeEmpConfig(res.getString("nome_emp_config"));
                e.setEnderecoEmpConfig(res.getString("endereco_emp_config"));
                e.setNumEmpConfig(res.getInt("num_emp_config"));
                e.setBairroEmpConfig(res.getString("bairro_emp_config"));
                e.setCidadeEmpCliente(res.getString("cidade_emp_config"));
                e.setTelefoneEmpCliente(res.getString("telefone_emp_config"));
                e.setEmailEmpCliente(res.getString("email_emp_config"));
                e.setIdEmpConfig(res.getInt("id_emp_config"));

                config.add(e);
            }

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar buscar os estudantes do banco: " + ex.getMessage());
        }

        return config;

    }
}
