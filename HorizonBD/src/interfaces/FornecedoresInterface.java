package interfaces;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.TbFornecedor;
import repository.FornecedoresRep;

public class FornecedoresInterface extends AbstractTableModel {

    //Declara as variaveis do cliente Rep e do ArrayList
    private final FornecedoresRep fRep;
    private final List<TbFornecedor> fornecedor;

    //Inicia o rep e atribui ao array a query que está pré-definida no inicio do Rep
    public FornecedoresInterface() {
        fRep = new FornecedoresRep();
        fornecedor = fRep.listar();
    }

    //Inicia o rep e atribui ao array a query que foi passada como parametro para executar uma consulta
    public FornecedoresInterface(String query) {
        fRep = new FornecedoresRep(query);
        fornecedor = fRep.listar();
    }

    //pega a quantidade de linhas(elementos) que tem nessa tabela
    @Override
    public int getRowCount() {
        return fornecedor.size();
    }

    //Informamos quantas colunas nossa tabela ira ter
    @Override
    public int getColumnCount() {
        return 1;
    }
    //especificamos qual item vai ser em cada coluna, pegando a informação referente a coluna e a quantidade que declaramos anteriormente

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return fornecedor.get(rowIndex).getNomeFornecedor();

        }
        return null;
    }

    //Pega a linha selecionada e retorna ela
    public TbFornecedor get(int row) {
        return fornecedor.get(row);
    }

    //Setamos o nome de cada coluna que a nossa tabela ira ter
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nome";

        }
        return null;
    }

}
