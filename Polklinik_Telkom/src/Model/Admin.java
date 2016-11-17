/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Ganis
 */
public class Admin {

    private String namaAdmin;
    private String kodeAdmin;
    private String password;
    private ArrayList<Pasien> pasien;
    private Database db;

    public Admin(String namaAdmin, String kodeAdmin, String password) {
        this.db = new Database();
        this.namaAdmin = namaAdmin;
        this.kodeAdmin = kodeAdmin;
        this.password = password;
        this.pasien = pasien;
    }

    public String getKodeAdmin() {
        return kodeAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public ArrayList<Pasien> getPasien() {
        return pasien;
    }

    public String getPassword() {
        return password;
    }

    public void setKodeAdmin(String kodeAdmin) {
        this.kodeAdmin = kodeAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public void setPasien(Pasien pasien) {
        this.pasien.add(pasien);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void viewDataPasien() {
        for (Pasien p : pasien) {
            System.out.print("Nama  : " + p.getNamaPasien());
            for (Jadwal j : p.getJadwal()) {
                System.out.println("Shift: " + j.getShift());
            }
        }
    }

    public void viewPasien() {
        for (Pasien p : pasien) {
            System.out.println("Nama  : " + p.getNamaPasien());
            System.out.println("Umur  : " + p.getUmur());
            System.out.println("Kode Pasien : " + p.getKodePasien());
            System.out.println("Keluhan : " + p.getKeluhan());
            System.out.println("Diagnosa : " + p.getDiagnosa());
            System.out.println("Obat : " + p.getObat());
            for (Jadwal j : p.getJadwal()) {
                System.out.println("Shift: " + j.getShift());
            }
        }
    }

    public void editDataPasien(Pasien p) {
        db.editPasien(p);
    }

    public void deleteDataPasien(Pasien pas) {
        db.deletePasien(pas);
    }

    public void viewShiftJadwal() {
        for (Pasien pas : pasien) {
            for (Jadwal jad : pas.getJadwal()) {
                for (Dokter d : jad.getDokter()) {
                    System.out.println("Nama Dokter : " + d.getNamaDokter());
                    for (Pasien ps : d.getPasien()) {
                        for (Jadwal jd : ps.getJadwal()) {
                            System.out.println("Shift : " + jd.getShift());
                        }
                    }
                    for (Pasien p : d.getPasien()) {
                        System.out.print("Nama  : " + p.getNamaPasien());
                    }
                }
            }
        }
    }

    public void createShiftJadwal(Pasien pasien) {
        db.saveJadwal(pasien);
    }

    public void viewJadwalPeriksa() {
       for (Pasien p : pasien){
           System.out.println("Nama Pasien: "+p.getNamaPasien());
           for (Jadwal j : p.getJadwal()){
                System.out.println("Nama Dokter: "+j.getDokter());
                System.out.println("Shift: "+j.getShift());
                System.out.println("Tanggal: "+j.getTanggal());
                System.out.println("Hari: "+j.getHari());
           }
       }
    }
}
