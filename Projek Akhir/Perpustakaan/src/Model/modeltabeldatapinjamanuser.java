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
public class modeltabeldatapinjamanuser extends AbstractTableModel {
    
    List<datapinjaman> dp;
    
    public modeltabeldatapinjamanuser(List<datapinjaman> dp) {
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
            case 1 -> "ID BUKU";
            case 2 -> "JUDUL";
            case 3 -> "TGL PINJAM";
            case 4 -> "TGL HARUS KEMBALI";
            case 5 -> "TGL KEMBALI";
            case 6 -> "DENDA";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int row, int column) {
        return switch (column) {
            case 0 -> dp.get(row).getID();
            case 1 -> dp.get(row).getIDBuku();
            case 2 -> dp.get(row).getJudul();
            case 3 -> dp.get(row).getTglPinjam();
            case 4 -> dp.get(row).getTglHarusKembali();
            case 5 -> dp.get(row).getTglKembali();
            case 6 -> dp.get(row).getDenda();
            default -> null;
        };
    }
    
}
