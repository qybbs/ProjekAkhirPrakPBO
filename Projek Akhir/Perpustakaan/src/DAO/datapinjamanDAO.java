/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import java.util.*;
import Model.*;
import Connector.Connector;
import DAOImplement.datapinjamanimplement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class datapinjamanDAO implements datapinjamanimplement{
    Connection connection;
    
    final String select = "SELECT p.*, u.Username, b.Judul FROM peminjaman p, buku b, user u WHERE p.IDUser = u.ID AND p.IDBuku = b.ID;";
    final String pinjam = "INSERT INTO peminjaman (IDUSer, IDBuku, TglPinjam, TglHarusKembali) VALUES (?, ?, CURRENT_DATE, ADDDATE(CURRENT_DATE, INTERVAL 5 DAY));";
    final String kembali = "UPDATE peminjaman SET TglKembali = CURRENT_DATE WHERE ID = ?;";
    final String update = "UPDATE peminjaman SET IDUser = ?, IDBuku = ?, TglPinjam = ?, TglHarusKembali = ?, Denda = ? WHERE ID = ?;";
    final String updatekembali = "UPDATE peminjaman SET IDUser = ?, IDBuku = ?, TglPinjam = ?, TglHarusKembali = ?, TglKembali = ?, Denda = ? WHERE ID = ?;";
    final String denda = "UPDATE peminjaman SET Denda = (DATEDIFF(TglKembali, TglHarusKembali))*2500 WHERE (DATEDIFF(TglKembali, TglHarusKembali)) > 0";
    final String delete = "DELETE FROM peminjaman WHERE ID = ?;";
    
    public datapinjamanDAO() {
        connection = Connector.connection();
    }
    
    @Override
    public void pinjam(datapinjaman p) {
        PreparedStatement statement = null; 
        try {
            statement = connection.prepareStatement(pinjam, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getIDUser().toString());
            statement.setString(2, p.getIDBuku().toString());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                p.setID(rs.getInt(1));
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
    public void update(datapinjaman p) {
        PreparedStatement statement = null; 
        try {
            if ("".equals(p.getTglKembali())) {
                statement = connection.prepareStatement(update, Statement.RETURN_GENERATED_KEYS);
            } else {
                statement = connection.prepareStatement(updatekembali, Statement.RETURN_GENERATED_KEYS);
            }
            statement.setString(1, p.getIDUser().toString());
            statement.setString(2, p.getIDBuku().toString());
            statement.setString(3, p.getTglPinjam());
            statement.setString(4, p.getTglHarusKembali());
            if ("".equals(p.getTglKembali())) {
                statement.setString(5, p.getDenda().toString());
                statement.setString(6,p.getID().toString());
            } else {
                statement.setString(5, p.getTglKembali());
                statement.setString(6, p.getDenda().toString());
                statement.setString(7,p.getID().toString());
            }
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                p.setID(rs.getInt(1));
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
    public void kembali(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(kembali);
            
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
    public void denda() {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(denda);
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
    public List<datapinjaman> getAll() {
        List<datapinjaman> dp = null;
        try {
            dp = new ArrayList<datapinjaman>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                datapinjaman pinjaman = new datapinjaman();
                pinjaman.setID(rs.getInt("ID"));
                pinjaman.setIDUser(rs.getInt("IDUser"));
                pinjaman.setIDBuku(rs.getInt("IDBuku"));
                pinjaman.setTglPinjam(rs.getString("TglPinjam"));
                pinjaman.setTglHarusKembali(rs.getString("TglHarusKembali"));
                pinjaman.setTglKembali(rs.getString("TglKembali"));
                pinjaman.setDenda(rs.getInt("Denda"));
                pinjaman.setUsername(rs.getString("Username"));
                pinjaman.setJudul(rs.getString("Judul"));
                dp.add(pinjaman);
            }
        } catch(SQLException ex) {
            Logger.getLogger(datapinjamanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dp;
    }
    
    @Override
    public List<datapinjaman> getUser(String id) {
        List<datapinjaman> dp = null;
        try {
            dp = new ArrayList<datapinjaman>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                if (rs.getString("Username").equals(id)) {
                    datapinjaman pinjaman = new datapinjaman();
                    pinjaman.setID(rs.getInt("ID"));
                    pinjaman.setIDUser(rs.getInt("IDUser"));
                    pinjaman.setIDBuku(rs.getInt("IDBuku"));
                    pinjaman.setTglPinjam(rs.getString("TglPinjam"));
                    pinjaman.setTglHarusKembali(rs.getString("TglHarusKembali"));
                    pinjaman.setTglKembali(rs.getString("TglKembali"));
                    pinjaman.setDenda(rs.getInt("Denda"));
                    pinjaman.setUsername(rs.getString("Username"));
                    pinjaman.setJudul(rs.getString("Judul"));
                    dp.add(pinjaman);
                }
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(datapinjamanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dp;
    }
    
    
}
