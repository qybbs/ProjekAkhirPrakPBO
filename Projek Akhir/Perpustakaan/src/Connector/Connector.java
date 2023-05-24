/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connector;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Connector {
    static Connection con;

    public static Connection connection() {
        if (con==null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("perpustakaan"); //Menyesuaikan Nama Database
            data.setUser("root");
            data.setPassword("");
            try {
                con = data.getConnection();
                System.out.println("Koneksi Berhasil!");
            } catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Koneksi gagal!");
            }
        }

        
        return con;
    }
}
