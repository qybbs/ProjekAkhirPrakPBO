/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class modeltabeldatauser extends AbstractTableModel {
    
    List<datauser> du;
    
    public modeltabeldatauser(List<datauser> du) {
        this.du = du;
    }

    @Override
    public int getRowCount() {
        return du.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "ID";
            case 1 -> "USERNAME";
            case 2 -> "PASSWORD";
            case 3 -> "USER TYPE";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int row, int column) {
        return switch (column) {
            case 0 -> du.get(row).getID();
            case 1 -> du.get(row).getUsername();
            case 2 -> du.get(row).getPassword();
            case 3 -> du.get(row).getUserType();
            default -> null;
        };
    }
    
}