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
public class Pasien {

    private String namaPasien;
    private String kodePasien;
    private String password;
    private int umur;
    private String keluhan;
    private String diagnosa;
    private ArrayList<Obat> obat;
    private ArrayList<Jadwal> jadwal;

    public Pasien(String namaPasien, String kodePasien, String password, int umur) {
        this.namaPasien = namaPasien;
        this.kodePasien = kodePasien;
        this.password = password;
        this.umur = umur;
        this.obat = new ArrayList<>();
        this.jadwal = new ArrayList<>();
        this.keluhan = "";
        this.diagnosa = "";
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

    public void inputKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
    
    public void memilihShiftPenjadwalan(Jadwal yangdipilih) {
        this.jadwal.add(yangdipilih);
    }
    
    public void viewJadwalPeriksa(Jadwal jdw) {
        System.out.println("Shift   : " + jdw.getShift());
        System.out.println("Hari    : " + jdw.getHari());
        System.out.println("Tanggal : " + jdw.getTanggal());
        System.out.print("Dokter  : ");
        for (Dokter d : jdw.getDokter()) {
            System.out.print(d.getNamaDokter() + " ");
        }
    }

    public ArrayList<Jadwal> getJadwal() {
        return jadwal;
    }

    public void setJadwal(ArrayList<Jadwal> jadwal) {
        this.jadwal = jadwal;
    }

    public ArrayList<Obat> getObat() {
        return obat;
    }

    public void setObat(Obat obat) {
        this.obat.add(obat);
    }
    
    
    
    
}
