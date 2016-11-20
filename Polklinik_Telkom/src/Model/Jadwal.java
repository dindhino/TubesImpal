package Model;


import java.util.ArrayList;

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
    private String hari;
    private String tanggal;
    private ArrayList<Dokter> dokter;

    public Jadwal(String kodeJadwal,String shift, String hari, String tanggal) {
        this.kodeJadwal = kodeJadwal;
        this.shift = shift;
        this.hari = hari;
        this.tanggal = tanggal;
        this.dokter = new ArrayList<>();
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

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public ArrayList<Dokter> getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter.add(dokter);
    }

}
