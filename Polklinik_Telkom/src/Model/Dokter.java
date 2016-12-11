package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dhino
 */
public class Dokter {

    private String namaDokter;
    private String kodeDokter;
    private String password;
    private String alamat;
    public Database db;

    public Dokter() {
        this.namaDokter = null;
        this.kodeDokter = null;
        this.password = null;
        this.alamat = null;
    }

    public Dokter(String namaDokter, String kodeDokter, String password, String alamat) {
        this.db = new Database();
        this.namaDokter = namaDokter;
        this.kodeDokter = kodeDokter;
        this.password = password;
        this.alamat = alamat;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getKodeDokter() {
        return kodeDokter;
    }

    public void setKodeDokter(String kodeDokter) {
        this.kodeDokter = kodeDokter;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
