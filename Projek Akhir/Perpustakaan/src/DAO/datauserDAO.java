/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import java.util.*;
import Model.*;
import Connector.Connector;
import DAOImplement.datauserimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import View.AdminView;

/**
 *
 * @author HP
 */
public class datauserDAO implements datauserimplement{
    Connection connection;
    
    final String select = "SELECT * FROM user WHERE UserType = 'user';";
    final String insert = "INSERT INTO user (ID, Username, Password, UserType) VALUES (?, ?, ?, ?);";
    final String update = "UPDATE user SET Username = ?, Password = ? WHERE ID = ?;";
    final String delete = "DELETE FROM user WHERE ID = ?;";
    
    public datauserDAO() {
        connection = Connector.connection();
    }
    
    @Override
    public void insert(datauser u) {
        PreparedStatement statement = null; 
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, u.getID());
            statement.setString(2, u.getUsername());
            statement.setString(3, u.getPassword());
            statement.setString(4, "user");
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                u.setID(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(datauser u) {
        PreparedStatement statement = null; 
        try {
            statement = connection.prepareStatement(update, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, u.getUsername());
            statement.setString(2, u.getPassword());
            statement.setInt(3, u.getID());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                u.setID(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<datauser> getAll() {
        List<datauser> du = null;
        try {
            du = new ArrayList<datauser>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                datauser user = new datauser();
                user.setID(rs.getInt("ID"));
                user.setUsername(rs.getString("Username"));
                user.setPassword(rs.getString("Password"));
                user.setUserType(rs.getString("UserType"));
                du.add(user);
            }
        } catch(SQLException ex) {
            Logger.getLogger(datauserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return du;
    }

    @Override
    public datauser check(datauser u) {
        datauser du = new datauser();
        
        String check = "SELECT * FROM user WHERE Username = ? AND Password = ?;";
        
        try {
            PreparedStatement st = connection.prepareStatement(check, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            st.setString(1, u.getUsername());
            st.setString(2, u.getPassword());
            ResultSet rs = st.executeQuery();
            if (rs.next() == false) {
                            JOptionPane.showMessageDialog(null, "Invalid Username/Password!");
                        } else {
                            rs.beforeFirst();
                            while (rs.next()) {
                                du.setID(rs.getInt("ID"));
                                du.setUsername(rs.getString("Username"));
                                du.setPassword(rs.getString("Password"));
                                du.setUserType(rs.getString("UserType"));
                            }
                        }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return du;
    }
    
}
