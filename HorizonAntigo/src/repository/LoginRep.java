package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TbClientes;
import model.TbFornecedor;
import model.TbLogin;
import util.ConexaoBD;

public class LoginRep {

    private static final String INSERT_ADD_USER = "insert into tb_login (nome_login,senha_login,permissao_login) values (?,?,?);";

    private static final String SELECT = "select * from tb_login";

    private static final String DELETE_USER = "delete from tb_login where id_login = ?";

    private static final String UPDATE_USER = "update tb_login set nome_login =?, senha_login=?, permissao_login=? where id_login = ?";

    private Connection connection = ConexaoBD.conectarBanco();
    private PreparedStatement pstm;

    public LoginRep() {
    }

    public void salvarAdd(TbLogin loginAdd) {

        try {

            pstm = connection.prepareStatement(INSERT_ADD_USER);
            pstm.setString(1, loginAdd.getNomeLogin());
            pstm.setString(2, loginAdd.getSenhaLogin());
            pstm.setInt(3, loginAdd.getPermissaoLogin());
            System.out.println("insert");

            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public void salvarModif(TbLogin loginModif) {
        try {
            pstm = connection.prepareStatement(UPDATE_USER);
            pstm.setString(1, loginModif.getNomeLogin());
            pstm.setString(2, loginModif.getSenhaLogin());
            pstm.setInt(3, loginModif.getPermissaoLogin());
            pstm.setInt(4, loginModif.getIdLogin());

            pstm.execute();
            pstm.close();
            System.out.println("update");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public TbLogin checarLogin(String Login, String Senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;
        TbLogin usuario = new TbLogin();

        try {
            stmt = connection.prepareStatement("SELECT * FROM tb_login where nome_login =? and senha_login=?");
            stmt.setString(1, Login);
            stmt.setString(2, Senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                usuario.setIdLogin(rs.getInt("id_login"));
                usuario.setNomeLogin(rs.getString("nome_login"));
                usuario.setSenhaLogin(rs.getString("senha_login"));
                usuario.setPermissaoLogin(rs.getInt("permissao_login"));
            }

        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao encontrar o usuario no banco");
        }
        return usuario;

    }

    public void excluir(TbLogin logins) {
        try {
            pstm = connection.prepareStatement(DELETE_USER);
            pstm.setInt(1, logins.getIdLogin());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public List<TbLogin> listar() {
        List<TbLogin> logins = new ArrayList<>();
        ResultSet res;

        try {
            //Percorre o Array preenchendo os campos abaixo do banco de dados
            pstm = connection.prepareStatement(SELECT);
            res = pstm.executeQuery();

            while (res.next()) {
                TbLogin e = new TbLogin();
                e.setIdLogin(res.getInt("id_login"));
                e.setNomeLogin(res.getString("nome_login"));
                e.setSenhaLogin(res.getString("senha_login"));
                e.setPermissaoLogin(res.getInt("permissao_login"));

                logins.add(e);
            }

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar buscar os logins: " + ex.getMessage());
        }

        return logins;

    }

}
