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
public class modeltabeldatabuku extends AbstractTableModel {
    
    List<databuku> db;
    
    public modeltabeldatabuku(List<databuku> db) {
        this.db = db;
    }

    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "ID";
            case 1 -> "ISBN";
            case 2 -> "JUDUL";
            case 3 -> "PENGARANG";
            case 4 -> "TAHUN TERBIT";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int row, int column) {
        return switch (column) {
            case 0 -> db.get(row).getID();
            case 1 -> db.get(row).getISBN();
            case 2 -> db.get(row).getJudul();
            case 3 -> db.get(row).getPengarang();
            case 4 -> db.get(row).getTahunTerbit();
            default -> null;
        };
    }
    
}
