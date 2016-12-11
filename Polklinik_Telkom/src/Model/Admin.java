/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ganis
 */
public class Admin {

    private String namaAdmin;
    private String kodeAdmin;
    private String password;
    private Database db;

    public Admin(String namaAdmin, String kodeAdmin, String password) {
        this.db = new Database();
        this.namaAdmin = namaAdmin;
        this.kodeAdmin = kodeAdmin;
        this.password = password;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public String getKodeAdmin() {
        return kodeAdmin;
    }

    public void setKodeAdmin(String kodeAdmin) {
        this.kodeAdmin = kodeAdmin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
