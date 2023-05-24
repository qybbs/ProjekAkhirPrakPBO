/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class datapinjaman {
    private Integer ID;
    private Integer IDUser;
    private Integer IDBuku;
    private String Username;
    private String Judul;
    private String TglPinjam;
    private String TglHarusKembali;
    private String TglKembali;
    private Integer Denda;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getIDUser() {
        return IDUser;
    }

    public void setIDUser(Integer IDUser) {
        this.IDUser = IDUser;
    }

    public Integer getIDBuku() {
        return IDBuku;
    }

    public void setIDBuku(Integer IDBuku) {
        this.IDBuku = IDBuku;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getTglPinjam() {
        return TglPinjam;
    }

    public void setTglPinjam(String TglPinjam) {
        this.TglPinjam = TglPinjam;
    }

    public String getTglHarusKembali() {
        return TglHarusKembali;
    }

    public void setTglHarusKembali(String TglHarusKembali) {
        this.TglHarusKembali = TglHarusKembali;
    }

    public String getTglKembali() {
        return TglKembali;
    }

    public void setTglKembali(String TglKembali) {
        this.TglKembali = TglKembali;
    }

    public Integer getDenda() {
        return Denda;
    }

    public void setDenda(Integer Denda) {
        this.Denda = Denda;
    }
    
    
}
