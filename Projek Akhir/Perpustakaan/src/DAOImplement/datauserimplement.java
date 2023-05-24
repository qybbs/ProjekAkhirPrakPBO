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
public interface datauserimplement {
    public void insert(datauser u);
    public void update(datauser u);
    public void delete(int id);
    public datauser check(datauser u);
    public List<datauser> getAll();
}