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
public class Pasien {

    private String namaPasien;
    private String kodePasien;
    private String password;
    private int umur;
    private String keluhan;
    private String diagnosa;
    private String kodeObat;

    public Pasien() {
        this.namaPasien = "";
        this.kodePasien = "";
        this.password = "";
        this.umur = 0;
        this.keluhan = "";
        this.diagnosa = "";
        this.kodeObat = "";
    }

    public Pasien(String namaPasien, String kodePasien, String password, int umur) {
        this.namaPasien = namaPasien;
        this.kodePasien = kodePasien;
        this.password = password;
        this.umur = umur;
        this.keluhan = "";
        this.diagnosa = "";
        this.kodeObat = "";
    }

    public Pasien(String namaPasien, String kodePasien, String password, int umur, String keluhan, String diagnosa, String kodeObat) {
        this.namaPasien = namaPasien;
        this.kodePasien = kodePasien;
        this.password = password;
        this.umur = umur;
        this.keluhan = keluhan;
        this.diagnosa = diagnosa;
        this.kodeObat = kodeObat;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getKodePasien() {
        return kodePasien;
    }

    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    public String getKodeObat() {
        return kodeObat;
    }

    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }

}
