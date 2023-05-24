/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.List;
import DAOImplement.*;
import DAO.*;
import Model.*;
import View.AdminViewPinjaman;
import View.UserView;

/**
 *
 * @author HP
 */
public class datapinjamancontroller {
    AdminViewPinjaman frame;
    UserView frameuser;
    datapinjamanimplement impldatapinjaman;
    databukuimplement impldatabuku;
    datauserimplement impldatauser;
    List<datapinjaman> dp;
    List<datauser> du;
    List<databuku> db;
    
    public datapinjamancontroller(AdminViewPinjaman frame) {
        this.frame = frame;
        impldatapinjaman = new datapinjamanDAO();
        impldatabuku = new databukuDAO();
        impldatauser = new datauserDAO();
        dp = impldatapinjaman.getAll();
        db = impldatabuku.getAll();
        du = impldatauser.getAll();
    }
    
    public datapinjamancontroller(UserView frame) {
        this.frameuser = frame;
        impldatapinjaman = new datapinjamanDAO();
    }
    
    public void isiTabel() {
        dp = impldatapinjaman.getAll();
        modeltabeldatapinjaman mp = new modeltabeldatapinjaman(dp);
        modeltabeldatauser mu = new modeltabeldatauser(du);
        modeltabeldatabuku mb = new modeltabeldatabuku(db);
        frame.getTabelDataPinjaman().setModel(mp);
        frame.getTabelDataBuku().setModel(mb);
        frame.getTabelDataUser().setModel(mu);        
    }
    
    public void isiTabel(String id) {
        dp = impldatapinjaman.getUser(id);
        modeltabeldatapinjamanuser mp = new modeltabeldatapinjamanuser(dp);
        frameuser.getTabelDataPinjaman().setModel(mp);        
    }
    
    public void pinjam() {
        datapinjaman dp = new datapinjaman();
        dp.setIDUser(Integer.valueOf(frame.getTfIDUser().getText()));
        dp.setIDBuku(Integer.valueOf(frame.getTfIDBuku().getText()));
        impldatapinjaman.pinjam(dp);
    }
    
    public void update() {
        databuku db = new databuku();
        datapinjaman dp = new datapinjaman();
        dp.setID(Integer.valueOf(frame.getTfID().getText()));
        dp.setIDUser(Integer.valueOf(frame.getTfIDUser().getText()));
        dp.setIDBuku(Integer.valueOf(frame.getTfIDBuku().getText()));
        dp.setTglPinjam(frame.getTfTglPinjam().getText());
        dp.setTglHarusKembali(frame.getTfTglHarusKembali().getText());
        dp.setTglKembali(frame.getTfTglKembali().getText());
        dp.setDenda(Integer.valueOf(frame.getTfDenda().getText()));
        impldatapinjaman.update(dp);
    }
    
    public void delete() {
        int id = Integer.valueOf(frame.getTfID().getText());
        impldatapinjaman.delete(id);
    }
    
    public void kembali() {
        int id = Integer.valueOf(frame.getTfID().getText());
        impldatapinjaman.kembali(id);
        impldatapinjaman.denda();
    }
    
    public void clearTf() {
        frame.setTfID("");
        frame.setTfIDUser("");
        frame.setTfIDBuku("");
        frame.setTfUsername("");
        frame.setTfJudul("");
        frame.setTfTglPinjam("");
        frame.setTfTglHarusKembali("");
        frame.setTfTglKembali("");
        frame.setTfDenda("");
    }
}
