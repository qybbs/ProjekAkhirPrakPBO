/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.List;
import DAOImplement.databukuimplement;
import DAO.databukuDAO;
import Model.*;
import View.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class databukucontroller {
    AdminViewBuku frameadmin;
    UserView frameuser;
    AdminViewPinjaman framepinjam;
    databukuimplement impldatabuku;
    List<databuku> db;
    
    public databukucontroller(AdminViewBuku frame) {
        this.frameadmin = frame;
        impldatabuku = new databukuDAO();
        db = impldatabuku.getAll();
    }
    
    public databukucontroller(UserView frame) {
        this.frameuser = frame;
        impldatabuku = new databukuDAO();
        db = impldatabuku.getAll();
    }
    
    public databukucontroller(AdminViewPinjaman frame) {
        this.framepinjam = frame;
        impldatabuku = new databukuDAO();
        db = impldatabuku.getAll();
    }
    
    public void isiTabel() {
        db = impldatabuku.getAll();
        modeltabeldatabuku mb = new modeltabeldatabuku(db);
        if (this.frameuser == null) {
            frameadmin.getTabelDataBuku().setModel(mb);
        } else if (this.frameadmin == null) {
            frameuser.getTabelDataBuku().setModel(mb);
        } else {
            framepinjam.getTabelDataBuku().setModel(mb);
        }
    }
    
    public void isiTabelCari(String a) {
        String b = "";
        if (this.frameadmin != null ) {
            b = frameadmin.getTfCari().getText();
        } else if (this.frameuser != null) {
            b = frameuser.getTfCari().getText();
        } else {
            b = framepinjam.getTfCari().getText();
        }
        if (b.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kolom Pencarian masih kosong!");
        } else {
            db = impldatabuku.getCari(a, b);
            modeltabeldatabuku mb = new modeltabeldatabuku(db);
            if (this.frameadmin != null) {
                frameadmin.getTabelDataBuku().setModel(mb);
            } else if (this.frameuser != null) {
                frameuser.getTabelDataBuku().setModel(mb);
            } else {
                framepinjam.getTabelDataBuku().setModel(mb);
            }
        }
        
    }
    
    public void insert() {
        databuku db = new databuku();
        db.setISBN(frameadmin.getTfISBN().getText());
        db.setJudul(frameadmin.getTfJudul().getText());
        db.setPengarang(frameadmin.getTfPengarang().getText());
        db.setTahunTerbit(frameadmin.getTfTahunTerbit().getText());
        impldatabuku.insert(db);
    }
    
    public void update() {
        databuku db = new databuku();
        db.setISBN(frameadmin.getTfISBN().getText());
        db.setJudul(frameadmin.getTfJudul().getText());
        db.setPengarang(frameadmin.getTfPengarang().getText());
        db.setTahunTerbit(frameadmin.getTfTahunTerbit().getText());
        db.setID(Integer.valueOf(frameadmin.getTfID().getText()));
        impldatabuku.update(db);
    }
    
    public void delete() {
        int id = Integer.valueOf(frameadmin.getTfID().getText());
        impldatabuku.delete(id);
    }
    
    public void clearTf() {
        frameadmin.setTfID("");
        frameadmin.setTfISBN("");
        frameadmin.setTfJudul("");
        frameadmin.setTfPengarang("");
        frameadmin.setTfTahunTerbit("");
    }
}
