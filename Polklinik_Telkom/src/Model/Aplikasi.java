/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Dhino
 */
public class Aplikasi {
    private ArrayList<Pasien> listPasien;
    private ArrayList<Dokter> listDokter;
    private ArrayList<Jadwal> listJadwal;
    private ArrayList<Obat> listObat;
    private ArrayList<Admin> admin;
    private Database db;

    public Aplikasi() {
        this.listPasien = new ArrayList<>();
        this.listDokter = new ArrayList<>();
        this.listJadwal = new ArrayList<>();
        this.listObat = new ArrayList<>();
        this.admin = new ArrayList<>();
        this.db = new Database();
        db.connect();
    }

    public ArrayList<Pasien> getListPasien() {
        return listPasien;
    }

    public ArrayList<Dokter> getListDokter() {
        return listDokter;
    }

    public ArrayList<Jadwal> getListJadwal() {
        return listJadwal;
    }

    public ArrayList<Obat> getListObat() {
        return listObat;
    }

    public ArrayList<Admin> getAdmin() {
        return admin;
    }

    public Database getDb() {
        return db;
    }

    public Pasien getPasien(String kodePasien) {
        for (Pasien p : listPasien) {
            if (p.getKodePasien() == kodePasien) {
                return p;
            }
        }
        Pasien p = db.getPasien(kodePasien);
        listPasien.add(p);
        return p;
    }

    public void setListPasien(Pasien pasien) {
        this.listPasien.add(pasien);
    }

    public Dokter getDokter(String kodeDokter, String pwd) {
        for (Dokter p : listDokter) {
            if (p.getKodeDokter() == kodeDokter && p.getPassword() == pwd) {
                return p;
            }
        }
        Dokter p = db.getDokter(kodeDokter, pwd);
        listDokter.add(p);
        return p;
    }

    public void setListDokter(Dokter dokter) {
        this.listDokter.add(dokter);
    }

    public Jadwal getJadwal(String kodeJadwal) {
        for (Jadwal j : listJadwal) {
            if (j.getKodeJadwal() == kodeJadwal) {
                return j;
            }
        }
        Jadwal j = db.getJadwal(kodeJadwal);
        listJadwal.add(j);
        return j;
    }

    public void setListJadwal(Jadwal jadwal) {
        this.listJadwal.add(jadwal);
    }

    public Obat getObat(String idObat) {
        for (Obat o: listObat) {
            if (o.getIdObat() == idObat) {
                return o;
            }
        }
        Obat o = db.getObat(idObat);
        listObat.add(o);
        return o;
    }

    public void setListObat(Obat obat) {
        this.listObat.add(obat);
    }

    public Admin getAdmin(String kodeAdmin) {
        for (Admin a: admin) {
            if (a.getKodeAdmin() == kodeAdmin) {
                return a;
            }
        }
        Admin a= db.getAdmin(kodeAdmin);
        admin.add(a);
        return a;
    }    
}
