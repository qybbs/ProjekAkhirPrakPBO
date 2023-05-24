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
public class modeltabeldatapinjaman extends AbstractTableModel {
    
    List<datapinjaman> dp;
    
    public modeltabeldatapinjaman(List<datapinjaman> dp) {
        this.dp = dp;
    }

    @Override
    public int getRowCount() {
        return dp.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "ID";
            case 1 -> "ID USER";
            case 2 -> "ID BUKU";
            case 3 -> "USERNAME";
            case 4 -> "JUDUL";
            case 5 -> "TGL PINJAM";
            case 6 -> "TGL HARUS KEMBALI";
            case 7 -> "TGL KEMBALI";
            case 8 -> "DENDA";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int row, int column) {
        return switch (column) {
            case 0 -> dp.get(row).getID();
            case 1 -> dp.get(row).getIDUser();
            case 2 -> dp.get(row).getIDBuku();
            case 3 -> dp.get(row).getUsername();
            case 4 -> dp.get(row).getJudul();
            case 5 -> dp.get(row).getTglPinjam();
            case 6 -> dp.get(row).getTglHarusKembali();
            case 7 -> dp.get(row).getTglKembali();
            case 8 -> dp.get(row).getDenda();
            default -> null;
        };
    }
    
}
