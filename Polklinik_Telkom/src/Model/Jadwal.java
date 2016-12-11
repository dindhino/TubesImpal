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
public class Jadwal {

    private String kodeJadwal;
    private String shift;
    private String tanggal;
    private String kodeDokter;
    private String kodePasien;

    public Jadwal(String kodeJadwal, String shift, String tanggal, String kodeDokter) {
        this.kodeJadwal = kodeJadwal;
        this.shift = shift;
        this.tanggal = tanggal;
        this.kodeDokter = kodeDokter;
        this.kodePasien = "";
    }

    public Jadwal(String kodeJadwal, String shift, String tanggal, String kodeDokter, String kodePasien) {
        this.kodeJadwal = kodeJadwal;
        this.shift = shift;
        this.tanggal = tanggal;
        this.kodeDokter = kodeDokter;
        this.kodePasien = kodePasien;
    }

    public Jadwal() {
        this.kodeJadwal = null;
        this.shift = null;
        this.tanggal = null;
        this.kodeDokter = null;
        this.kodePasien = null;
    }
    
    

    public String getKodeJadwal() {
        return kodeJadwal;
    }

    public void setKodeJadwal(String kodeJadwal) {
        this.kodeJadwal = kodeJadwal;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKodeDokter() {
        return kodeDokter;
    }

    public void setKodeDokter(String kodeDokter) {
        this.kodeDokter = kodeDokter;
    }

    public String getKodePasien() {
        return kodePasien;
    }

    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

}
