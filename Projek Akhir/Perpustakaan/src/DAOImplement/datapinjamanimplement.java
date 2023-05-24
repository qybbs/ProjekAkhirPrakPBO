/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplement;
import java.util.List;
import Model.*;

/**
 *
 * @author HP
 */
public interface datapinjamanimplement {
    public void pinjam(datapinjaman p);
    public void update(datapinjaman p);
    public void kembali(int id);
    public void delete(int id);
    public void denda();
    public List<datapinjaman> getAll();
    public List<datapinjaman> getUser(String id);
}