package interfaces;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.TbLogin;
import repository.LoginRep;

public class LoginInterface extends AbstractTableModel {

    private final LoginRep lRep;
    private final List<TbLogin> login;

    public LoginInterface() {
        lRep = new LoginRep();
        login = lRep.listar();
    }

    @Override
    public int getRowCount() {
        return login.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return login.get(rowIndex).getIdLogin();
            case 1:
                return login.get(rowIndex).getNomeLogin();
            case 2:
                return login.get(rowIndex).getSenhaLogin();
        }
        return null;

    }

    public TbLogin get(int row) {
        return login.get(row);
    }

    @Override
    public String getColumnName(int column) {
switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Nome";
            case 2:
                return "Senha";           
        }
        return null;
    
    }

}
