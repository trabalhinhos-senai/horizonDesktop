package interfaces;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.TbClientes;
import repository.ClientesRep;

public class ClientesInterface extends AbstractTableModel {

    //Declara as variaveis do cliente Rep e do ArrayList
    private final ClientesRep cRep;
    private final List<TbClientes> clientes;

    //Inicia o rep e atribui ao array a query que está pré-definida no inicio do Rep
    public ClientesInterface() {
        cRep = new ClientesRep();
        clientes = cRep.listar();
    }

    //Inicia o rep e atribui ao array a query que foi passada como parametro para executar uma consulta
    public ClientesInterface(String query) {
        cRep = new ClientesRep(query);
        clientes = cRep.listar();
    }

    //pega a quantidade de linhas(elementos) que tem nessa tabela
    @Override
    public int getRowCount() {
        return clientes.size();
    }

    //Informamos quantas colunas nossa tabela ira ter
    @Override
    public int getColumnCount() {
        return 9;
    }

    //especificamos qual item vai ser em cada coluna, pegando a informação referente a coluna e a quantidade que declaramos anteriormente
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return clientes.get(rowIndex).getIdCliente();
            case 1:
                return clientes.get(rowIndex).getNomeCliente();
            case 2:
                return clientes.get(rowIndex).getCidadeCliente();
            case 3:
                return clientes.get(rowIndex).getEnderecoCliente();
            case 4:
                return clientes.get(rowIndex).getBairroCliente();
            case 5:
                return clientes.get(rowIndex).getEstadoCliente();
            case 6:
                return clientes.get(rowIndex).getCepCliente();
            case 7:
                return clientes.get(rowIndex).getTelefoneCliente();
            case 8:
                return clientes.get(rowIndex).getCelularCliente();
        }
        return null;
    }

    //Pega a linha selecionada e retorna ela
    public TbClientes get(int row) {
        return clientes.get(row);
    }

    //Setamos o nome de cada coluna que a nossa tabela ira ter
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Nome";
            case 2:
                return "Cidade";
            case 3:
                return "Endereco";
            case 4:
                return "Bairro";
            case 5:
                return "Estado";
            case 6:
                return "CEP";
            case 7:
                return "Telefone";
            case 8:
                return "Celular";
        }
        return null;
    }

}
