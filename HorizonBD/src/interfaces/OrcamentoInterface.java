package interfaces;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.TabelaOrcamento;
import repository.OrcamentoRep;

public class OrcamentoInterface extends AbstractTableModel {

    //Declara as variaveis do cliente Rep e do ArrayList
    private final OrcamentoRep oRep;
    private final List<TabelaOrcamento> orcamentos;

    //Inicia o rep e atribui ao array a query que está pré-definida no inicio do Rep
    public OrcamentoInterface() {
        oRep = new OrcamentoRep();
        orcamentos = oRep.listarOrcamento();
    }

    //Inicia o rep e atribui ao array a query que foi passada como parametro para executar uma consulta
    public OrcamentoInterface(String query) {
        oRep = new OrcamentoRep(query);
        orcamentos = oRep.listarOrcamento();
    }

    //pega a quantidade de linhas(elementos) que tem nessa tabela
    @Override
    public int getRowCount() {
        return orcamentos.size();
    }

    //Informamos quantas colunas nossa tabela ira ter
    @Override
    public int getColumnCount() {
        return 3;
    }

    //especificamos qual item vai ser em cada coluna, pegando a informação referente a coluna e a quantidade que declaramos anteriormente
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return orcamentos.get(rowIndex).getIdOrcamento();
            case 1:
                return orcamentos.get(rowIndex).getNomeClienteOrcamento();
            case 2:
                int i = orcamentos.get(rowIndex).getStatusOrcamento();
                String n = "";

                switch (i) {
                    case 1:
                        n = "Aguardando Aprovacao";
                        break;
                    case 2:
                        n = "Aprovado";
                        break;
                    case 3:
                        n = "Não Aprovado";
                        break;

                }
                return n;

        }
        return null;
    }

    //Pega a linha selecionada e retorna ela
    public TabelaOrcamento get(int row) {
        return orcamentos.get(row);
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
                return "Status";
        }
        return null;
    }

}
