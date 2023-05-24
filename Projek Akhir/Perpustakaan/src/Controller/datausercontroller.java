/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.List;
import DAOImplement.datauserimplement;
import DAO.datauserDAO;
import Model.*;
import View.AdminView;
import View.AdminViewUser;
import View.Login;
import View.UserView;

/**
 *
 * @author HP
 */
public class datausercontroller {
    AdminViewUser frame;
    datauserimplement impldatauser;
    List<datauser> du;
    
    public datausercontroller(AdminViewUser frame) {
        this.frame = frame;
        impldatauser = new datauserDAO();
        du = impldatauser.getAll();
    }
    
    public datausercontroller(Login frame) {
        impldatauser = new datauserDAO();
    }
    
    public void login(datauser du) {
        datauser user = impldatauser.check(du);
        switch (user.getUserType()) {
                case "admin" -> {
                    AdminView a = new AdminView();
                    a.setLUsername(du.getUsername());
                    a.setVisible(true);
                    a.setLocationRelativeTo(null);
                }
                case "user" -> {
                    UserView u = new UserView();
                    u.setlUsername(user.getUsername());
                    u.isipinjam(user.getUsername());
                    u.setVisible(true);
                    u.setLocationRelativeTo(null);
                }
            }
    }
    
    public void isiTabel() {
        du = impldatauser.getAll();
        modeltabeldatauseradmin mu = new modeltabeldatauseradmin(du);
        frame.getTabelDataUser().setModel(mu);
        
    }
    
    public void insert() {
        datauser du = new datauser();
        du.setID(Integer.valueOf(frame.getTfID().getText()));
        du.setUsername(frame.getTfUsername().getText());
        du.setPassword(frame.getPfPassword().getText());
        du.setUserType(frame.getTfUserType().getText());
        impldatauser.insert(du);
    }
    
    public void update() {
        datauser du = new datauser();
        du.setUsername(frame.getTfUsername().getText());
        du.setPassword(frame.getPfPassword().getText());
        du.setUserType(frame.getTfUserType().getText());
        du.setID(Integer.valueOf(frame.getTfID().getText()));
        impldatauser.update(du);
    }
    
    public void delete() {
        int id = Integer.valueOf(frame.getTfID().getText());
        impldatauser.delete(id);
    }
    
    public void clearTf() {
        frame.setTfID("");
        frame.setTfUsername("");
        frame.setPfPassword("");
        frame.setTfUserType("");
    }
}
