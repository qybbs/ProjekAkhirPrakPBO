/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import java.util.*;
import Model.*;
import Connector.Connector;
import DAOImplement.databukuimplement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class databukuDAO implements databukuimplement{
    Connection connection;
    
    final String select = "SELECT * FROM buku;";
    final String insert = "INSERT INTO buku (ISBN, Judul, Pengarang, Tahun_terbit) VALUES (?, ?, ?, ?);";
    final String update = "UPDATE buku SET ISBN = ?, Judul = ?, Pengarang = ?, Tahun_terbit = ? WHERE ID = ?;";
    final String delete = "DELETE FROM buku WHERE ID = ?;";
    
    public databukuDAO() {
        connection = Connector.connection();
    }
    
    @Override
    public void insert(databuku b) {
        PreparedStatement statement = null; 
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, b.getISBN());
            statement.setString(2, b.getJudul());
            statement.setString(3, b.getPengarang());
            statement.setString(4, b.getTahunTerbit());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                b.setID(rs.getInt(1));
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
    public void update(databuku b) {
        PreparedStatement statement = null; 
        try {
            statement = connection.prepareStatement(update, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, b.getISBN());
            statement.setString(2, b.getJudul());
            statement.setString(3, b.getPengarang());
            statement.setString(4, b.getTahunTerbit());
            statement.setInt(5, b.getID());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                b.setID(rs.getInt(1));
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
    public List<databuku> getAll() {
        List<databuku> db = null;
        try {
            db = new ArrayList<databuku>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                databuku buku = new databuku();
                buku.setID(rs.getInt("ID"));
                buku.setISBN(rs.getString("ISBN"));
                buku.setJudul(rs.getString("Judul"));
                buku.setPengarang(rs.getString("Pengarang"));
                buku.setTahunTerbit(rs.getString("Tahun_terbit"));
                db.add(buku);
            }
        } catch(SQLException ex) {
            Logger.getLogger(databukuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return db;
    }
    
    @Override
    public List<databuku> getCari(String a, String b) {
        List<databuku> db = null;
        String search = "SELECT * FROM buku WHERE "+ a +" LIKE '%"+ b +"%';";
        try {
            db = new ArrayList<databuku>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(search);
            while (rs.next()) {
                databuku buku = new databuku();
                buku.setID(rs.getInt("ID"));
                buku.setISBN(rs.getString("ISBN"));
                buku.setJudul(rs.getString("Judul"));
                buku.setPengarang(rs.getString("Pengarang"));
                buku.setTahunTerbit(rs.getString("Tahun_terbit"));
                db.add(buku);
            }
        } catch(SQLException ex) {
            Logger.getLogger(databukuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return db;
    }
    
}
