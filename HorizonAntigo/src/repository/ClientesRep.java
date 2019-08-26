package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TbClientes;
import util.ConexaoBD;

public class ClientesRep {

    //Query para cadastrar no BD
    private static final String INSERT_ADD_CLIENTE = "insert into tb_clientes (nome_cliente, endereco_cliente, num_endereco_cliente, complemento_endereco_cliente,email_cliente,bairro_cliente,cidade_cliente,cep_cliente,estado_cliente,cpf_cnpj_cliente,rg_ie_cliente,im_cliente,telefone_cliente,celular_cliente,sexo_cliente,observacao_cliente,data_aniversario_cliente,data_cadastro_cliente,data_alteracao_cliente,verificaCnpj) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    //Query para listar dos Clientes do BD
    private static final String SELECT = "select * from tb_clientes order by nome_cliente";
    //Query para deletar cliente do BD
    private static final String DELETE_CLIENTE = "delete from tb_clientes where id_cliente = ?";
    //Query para fazer update do cliente
    private static final String UPDATE_MODIF_CLIENTE = "update tb_clientes set nome_cliente=?, endereco_cliente=?, num_endereco_cliente=?, complemento_endereco_cliente=? ,email_cliente=?, bairro_cliente=?, cidade_cliente=?, cep_cliente=?, estado_cliente=?, cpf_cnpj_cliente=?, rg_ie_cliente=? ,im_cliente=?, telefone_cliente=?, celular_cliente=?, sexo_cliente=? ,observacao_cliente=?, data_aniversario_cliente = ?, data_cadastro_cliente = ?, data_alteracao_cliente = ?, verificaCnpj = ? where id_cliente = ?";
    //Query inicial para pesquisar o cliente informado, faltando somente os parametros que são passados pelo método Pesquisar
    private static final String PESQUISA_CLIENTE = " select * from tb_clientes where nome_cliente like ";
    //Query inicial para pesquisar o endereço informado, faltando somente os parametros que são passados pelo método Pesquisar
    private static final String PESQUISA_ENDERECO = " select * from tb_clientes where endereco_cliente like ";
    //Query inicial para pesquisar o bairro informado, faltando somente os parametros que são passados pelo método Pesquisar
    private static final String PESQUISA_BAIRRO = " select * from tb_clientes where bairro_cliente like ";
    //Query inicial para pesquisar a cidade informado, faltando somente os parametros que são passados pelo método Pesquisar
    private static final String PESQUISA_CIDADE = " select * from tb_clientes where cidade_cliente like ";

    //Variavel utilizada como variavel temporiaria para armazenar o retorno da Query
    private String query;

    //Variavel para pesquisar, todas as query serao montadas e sobrescritas em cima dessa variavel
    //De incio recebe o select como parametro para listar todos os cadastros no BD
    String variavel = SELECT;

    private Connection connection = ConexaoBD.conectarBanco();
    private PreparedStatement pstm;

    public ClientesRep() {
    }

    //Contrutor para forçar a variavel "variavel" receber a query montada, para não retonar null
    public ClientesRep(String query) {
        this.query = query;
        this.variavel = query;
    }

    //Salva um novo cliente no BD
    public void salvarAdd(TbClientes clientesAdd) {

        try {

            pstm = connection.prepareStatement(INSERT_ADD_CLIENTE);
            pstm.setString(1, clientesAdd.getNomeCliente());
            pstm.setString(2, clientesAdd.getEnderecoCliente());
            pstm.setInt(3, clientesAdd.getNumEnderecoCliente());
            pstm.setString(4, clientesAdd.getComplementoEnderecoCliente());
            pstm.setString(5, clientesAdd.getEmailCliente());
            pstm.setString(6, clientesAdd.getBairroCliente());
            pstm.setString(7, clientesAdd.getCidadeCliente());
            pstm.setString(8, clientesAdd.getCepCliente());
            pstm.setString(9, clientesAdd.getEstadoCliente());
            pstm.setString(10, clientesAdd.getCpfCnpjCliente());
            pstm.setString(11, clientesAdd.getRgIeCliente());
            pstm.setString(12, clientesAdd.getImCliente());
            pstm.setString(13, clientesAdd.getTelefoneCliente());
            pstm.setString(14, clientesAdd.getCelularCliente());
            pstm.setInt(15, clientesAdd.getSexoCliente());
            pstm.setString(16, clientesAdd.getObservacaoCliente());
            pstm.setObject(17, clientesAdd.getDataAniversarioCliente());
            pstm.setObject(18, clientesAdd.getDataCadastroCliente());
            pstm.setObject(19, clientesAdd.getDataAlteracaoCliente());
            pstm.setInt(20, clientesAdd.getVerificaCnpj());
            System.out.println("insert");

            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    //Faz um update em um cliente ja existente no BD
    public void salvarModif(TbClientes clientesModif) {
        try {
            pstm = connection.prepareStatement(UPDATE_MODIF_CLIENTE);
            pstm.setString(1, clientesModif.getNomeCliente());
            pstm.setString(2, clientesModif.getEnderecoCliente());
            pstm.setInt(3, clientesModif.getNumEnderecoCliente());
            pstm.setString(4, clientesModif.getComplementoEnderecoCliente());
            pstm.setString(5, clientesModif.getEmailCliente());
            pstm.setString(6, clientesModif.getBairroCliente());
            pstm.setString(7, clientesModif.getCidadeCliente());
            pstm.setString(8, clientesModif.getCepCliente());
            pstm.setString(9, clientesModif.getEstadoCliente());
            pstm.setString(10, clientesModif.getCpfCnpjCliente());
            pstm.setString(11, clientesModif.getRgIeCliente());
            pstm.setString(12, clientesModif.getImCliente());
            pstm.setString(13, clientesModif.getTelefoneCliente());
            pstm.setString(14, clientesModif.getCelularCliente());
            pstm.setInt(15, clientesModif.getSexoCliente());
            pstm.setString(16, clientesModif.getObservacaoCliente());
            pstm.setObject(17, clientesModif.getDataAniversarioCliente());
            pstm.setObject(18, clientesModif.getDataCadastroCliente());
            pstm.setObject(19, clientesModif.getDataAlteracaoCliente());
            pstm.setInt(20, clientesModif.getVerificaCnpj());
            pstm.setInt(21, clientesModif.getIdCliente());
            pstm.execute();
            pstm.close();
            System.out.println("update");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    //Metodo para verificar o campo selecionado e passar a string que foi digitada na interface para definir qual tipo de busca
    //será feita e para montar a query completa para execução passando ela para variável "Variavel;
    public String pesquisar(String campoPesquisa, String busca) {
        if (campoPesquisa.equalsIgnoreCase("Nome")) {
            variavel = PESQUISA_CLIENTE + "'%" + busca + "%'"+"order by nome_cliente";
        } else if (campoPesquisa.equalsIgnoreCase("Endereço")) {
            variavel = PESQUISA_ENDERECO + "'%" + busca + "%'"+"order by nome_cliente";
        } else if (campoPesquisa.equalsIgnoreCase("Bairro")) {
            variavel = PESQUISA_BAIRRO + "'%" + busca + "%'"+"order by nome_cliente";
        } else if (campoPesquisa.equalsIgnoreCase("Cidade")) {
            variavel = PESQUISA_CIDADE + "'%" + busca + "%'"+"order by nome_cliente";
        }
        return variavel;
    }

    //Metodo para exclui um cliente do BD
    public void excluir(TbClientes clientes) {
        try {
            pstm = connection.prepareStatement(DELETE_CLIENTE);
            pstm.setInt(1, clientes.getIdCliente());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    //Método que realiza o select no BD e retorna o resultado todo para o AssrayList
    public List<TbClientes> listar() {
        List<TbClientes> clientes = new ArrayList<>();
        ResultSet res;

        try {
            //Percorre o Array preenchendo os campos abaixo do banco de dados
            pstm = connection.prepareStatement(variavel);
            res = pstm.executeQuery();

            while (res.next()) {
                TbClientes e = new TbClientes();
                e.setIdCliente(res.getInt("id_cliente"));
                e.setNumEnderecoCliente(res.getInt("num_endereco_cliente"));
                e.setSexoCliente(res.getInt("sexo_cliente"));
                e.setNomeCliente(res.getString("nome_cliente"));
                e.setEnderecoCliente(res.getString("endereco_cliente"));
                e.setComplementoEnderecoCliente(res.getString("complemento_endereco_cliente"));
                e.setEmailCliente(res.getString("email_cliente"));
                e.setBairroCliente(res.getString("bairro_cliente"));
                e.setCidadeCliente(res.getString("cidade_cliente"));
                e.setCepCliente(res.getString("cep_cliente"));
                e.setEstadoCliente(res.getString("estado_cliente"));
                e.setCpfCnpjCliente(res.getString("cpf_cnpj_cliente"));
                e.setImCliente(res.getString("im_cliente"));
                e.setRgIeCliente(res.getString("rg_ie_cliente"));
                e.setTelefoneCliente(res.getString("telefone_cliente"));
                e.setCelularCliente(res.getString("celular_cliente"));
                e.setObservacaoCliente(res.getString("observacao_cliente"));
                e.setDataAniversarioCliente(res.getDate("data_aniversario_cliente"));
                e.setDataCadastroCliente(res.getDate("data_cadastro_cliente"));
                e.setDataAlteracaoCliente(res.getDate("data_alteracao_cliente"));
                e.setVerificaCnpj(res.getInt("verificaCnpj"));

                clientes.add(e);
            }

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar buscar os estudantes do banco: " + ex.getMessage());
        }

        return clientes;

    }
}
