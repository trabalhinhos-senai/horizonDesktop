package interfaces;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.TbProdutos;
import repository.ProdutoRep;

public class ProdutoInterface extends AbstractTableModel{

    private final ProdutoRep pRep;
    private final List<TbProdutos> produto;

    public ProdutoInterface() {
        pRep = new ProdutoRep();
        produto = pRep.listar();
    }

    public ProdutoInterface(String query) {
        pRep = new ProdutoRep(query);
        produto = pRep.listar();
    }

    @Override
    public int getRowCount() {
        return produto.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return produto.get(rowIndex).getIdProduto();
            case 1:
                return produto.get(rowIndex).getNomeProd();
            case 2:
                return produto.get(rowIndex).getCodBarrasProd();
            case 3:
                return produto.get(rowIndex).getCodRefProd();
            case 4:
                return produto.get(rowIndex).getPrecoCustoProd();
            case 5:
                return produto.get(rowIndex).getPrecoVendaProd();
        }
        return null;
    }

    public TbProdutos get(int row) {
        return produto.get(row);
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Produto";
            case 2:
                return "Codigo barra";
            case 3:
                return "Codigo ref.";
            case 4:
                return "preço custo";
            case 5:
                return "preço venda";

        }
        return null;
    }

}


