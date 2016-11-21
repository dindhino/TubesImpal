/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Dhino
 */
public class Database {

    private String server = "jdbc:mysql://localhost/polikliniktelkom", dbuser = "root", dbpass = "";
    private Statement st;
    private Connection con;

    public void connect() {
        try {
            con = DriverManager.getConnection(server, dbuser, dbpass);
            st = con.createStatement();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void savePasien(Pasien p) {
        try {

            String query = "INSERT INTO `pasien`(`namaPasien`, `kodePasien`, `password`, `umur`) VALUES ("
                    + "'" + p.getNamaPasien() + "',"
                    + "'" + p.getKodePasien() + "',"
                    + "'" + p.getPassword() + "',"
                    + "'" + p.getUmur() + "')";
            st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void saveKeluhan(Pasien p) {
        try {
            String query = "UPDATE `pasien` set `keluhan`='" + p.getKeluhan()
                    + "' where `kodePasien`='" + p.getKodePasien() + "'";
            st.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void saveDokter(Dokter p) {
        try {

            String query = "INSERT INTO `dokter`(`namaDokter`, `kodeDokter`, `password`, `alamat`) VALUES ("
                    + "'" + p.getNamaDokter() + "',"
                    + "'" + p.getKodeDokter() + "',"
                    + "'" + p.getPassword() + "',"
                    + "'" + p.getAlamat() + "')";
            st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Pasien getPasien(String kodePasien) {
        Pasien p = null;
        try {
            String query = "SELECT * FROM `pasien` WHERE `kodePasien` = " + "'" + kodePasien + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Pasien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }

    public void saveDiagnosa(Pasien p) {
        try {
            String query = "update pasien set diagnosa ='"
                    + p.getDiagnosa() + "' where kodePasien = '"
                    + p.getKodePasien() + "'";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void saveObat(Pasien p) {
        try {
            String query = "update pasien set obat ='"
                    + p.getObat() + "' where kodePasien = '"
                    + p.getKodePasien() + "'";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void saveJadwal(Pasien p) {
        try {
            String query = "update pasien set jadwal ='"
                    + p.getJadwal() + "' where kodePasien = '"
                    + p.getKodePasien() + "'";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void editPasien(Pasien p) {
        try {
            String query = "update pasien set `keluhan` ='"
                    + p.getKeluhan() + "', `diagnosa` ='"
                    + p.getDiagnosa() + "', `Obat` ='"
                    + p.getObat() + "', `Jadwal` ='"
                    + p.getJadwal() + "' where `kodePasien` = '"
                    + p.getKodePasien() + "'";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deletePasien(Pasien p) {
        try {
            String query = "delete from pasien where `kodePasien` = " + "'" + p.getKodePasien() + "'";
            st.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Jadwal(Jadwal j) {
        try {
            String query = "insert into `Jadwal` (`shift`, `tanggal`, `hari`) values ("
                    + "'" + j.getShift() + "'"
                    + "'" + j.getTanggal() + "'"
                    + "'" + j.getHari() + "')";
            st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateJadwal(Jadwal j, Pasien p) {
        try {
            String query = "update jadwal set shift ='"
                    + j.getShift() + "' where kodePasien = '"
                    + p.getKodePasien() + "'";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Dokter(Dokter d) {
        try {

            String query = "INSERT INTO `dokter`(`namaDokter`, `kodeDokter`, `password`, `alamat`) VALUES ("
                    + "'" + d.getNamaDokter() + "',"
                    + "'" + d.getKodeDokter() + "',"
                    + "'" + d.getPassword() + "',"
                    + "'" + d.getAlamat() + "')";
            st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Dokter getDokter(String kodeDokter) {
        Dokter p = null;
        try {
            String query = "SELECT * FROM `dokter` WHERE `kodeDokter` = " + "'" + kodeDokter + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Dokter(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }

    public Jadwal getJadwal(String kodeJadwal) {
        Jadwal j = null;
        try {
            String query = "SELECT * FROM `Jadwal` WHERE `kodeJadwal` = " + "'" + kodeJadwal + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                j = new Jadwal(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return j;
    }

    public Obat getObat(String kodeObat) {
        Obat o = null;
        try {
            String query = "SELECT * FROM `Obat` WHERE `kodeObat` = " + "'" + kodeObat + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                o = new Obat(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return o;
    }

    public Admin getAdmin(String kodeAdmin) {
        Admin a = null;
        try {
            String query = "SELECT * FROM `Admin` WHERE `kodeAdmin` = " + "'" + kodeAdmin + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                a = new Admin(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return a;
    }

    public void Obat(Obat ob) {
        try {

            String query = "INSERT INTO `obat`(`idObat`, `namaObat`, `jenis`, `harga`) VALUES ("
                    + "'" + ob.getIdObat() + "',"
                    + "'" + ob.getNamaObat() + "',"
                    + "'" + ob.getJenis() + "',"
                    + "'" + ob.getHarga() + "')";
            st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Admin(Admin a) {
        try {

            String query = "INSERT INTO `admin`(`namaAdmin`, `kodeAdmin`, `password`) VALUES ("
                    + "'" + a.getNamaAdmin() + "',"
                    + "'" + a.getKodeAdmin() + "',"
                    + "'" + a.getPassword() + "')";
            st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public int countDokter() {
        int count = 0;
        try {
            String query = "Select count(*) from `dokter`";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return count;
    }
}
