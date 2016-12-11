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

    private String server = "jdbc:mysql://localhost/polikliniktelkom_rev", dbuser = "root", dbpass = "";
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

    public void regPasien(Pasien p) {
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

    public void regDokter(Dokter p) {
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

    public void saveNewJadwal(Jadwal j) {
        try {
//            DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
//            Date date = format.parse(j.getTanggal());
            String query = "INSERT INTO `jadwal`(`kodeJadwal`, `tanggal`, `shift`, `hari`, `Dokter`) VALUES ("
                    + "'" + j.getKodeJadwal() + "',"
                    + "'" + j.getTanggal() + "',"
                    + "'" + j.getShift() + "',"
                    + "'" + j.getKodeDokter() + "')";
            st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void newObat(Obat ob) {
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

    public void inputKeluhan(Pasien p) {
        try {
            String query = "UPDATE `pasien` set `keluhan` = '" + p.getKeluhan() + "' where `kodePasien` = '" + p.getKodePasien() + "'";
            st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void inputDiagnosa(Pasien p) {
        try {
            String query = "update pasien set diagnosa ='"
                    + p.getDiagnosa() + "' where kodePasien = '"
                    + p.getKodePasien() + "'";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void inputObat(Pasien p) {
        try {
            String query = "update pasien set obat ='"
                    + p.getKodeObat() + "' where kodePasien = '"
                    + p.getKodePasien() + "'";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void pilihJadwal(Jadwal j, Pasien p) {
        try {
            String query = "update jadwal set kodePasien ='"
                    + p.getKodePasien() + "' where kodeJadwal = '"
                    + j.getKodeJadwal() + "'";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Pasien loginPasien(String kodePasien, String pwd) {
        Pasien p = null;
        try {
            String query = "SELECT * FROM `pasien` WHERE `kodePasien` = " + "'" + kodePasien + "' and `password`='" + pwd + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Pasien(rs.getString(2), rs.getString(1), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }

    public Pasien getPasien(String kodePasien) {
        Pasien p = null;
        try {
            String query = "SELECT * FROM `pasien` WHERE `kodePasien` = " + "'" + kodePasien + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Pasien(rs.getString(2), rs.getString(1), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }

    public void editPasien(Pasien p) {
        try {
            String query = "update pasien set `keluhan` ='"
                    + p.getKeluhan() + "', `diagnosa` ='"
                    + p.getDiagnosa() + "', `kodeObat` ='"
                    + p.getKodeObat() + "' where `kodePasien` = '"
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

    public Dokter getDokter(String kodeDokter) {
        Dokter p = null;
        try {
            String query = "SELECT * FROM `dokter` WHERE `kodeDokter` = " + "'" + kodeDokter + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Dokter(rs.getString(2), rs.getString(1), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }

    public Dokter loginDokter(String kodeDokter, String pwd) {
        Dokter p = null;
        try {
            String query = "SELECT * FROM `dokter` WHERE `kodeDokter` = " + "'" + kodeDokter + "' and `password`='" + pwd + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Dokter(rs.getString(2), rs.getString(1), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }

    public Admin loginAdmin(String kodeDokter, String pwd) {
        Admin p = null;
        try {
            String query = "SELECT * FROM `admin` WHERE `kodeAdmin` = " + "'" + kodeDokter + "' and `password`='" + pwd + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Admin(rs.getString(2), rs.getString(1), rs.getString(3));
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
                j = new Jadwal(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return j;
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

    public int countJadwal() {
        int count = 0;
        try {
            String query = "Select count(*) from `Jadwal`";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return count;
    }

    public int countObat() {
        int count = 0;
        try {
            String query = "Select count(*) from `Obat`";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return count;
    }

    public ArrayList<Dokter> getAllDokter() {
        Dokter p = null;
        ArrayList<Dokter> dok = new ArrayList<Dokter>();
        try {
            String query = "Select * from `Dokter`";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Dokter(rs.getString(2), rs.getString(1), rs.getString(3), rs.getString(4));
                dok.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dok;
    }

    public ArrayList<Jadwal> getAllJadwal() {
        Jadwal j = null;
        ArrayList<Jadwal> jad = new ArrayList<Jadwal>();
        try {
            String query = "Select * from `Jadwal`";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                j = new Jadwal(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                jad.add(j);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return jad;
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

    public ArrayList<Obat> getAllObat() {
        Obat o = null;
        ArrayList<Obat> ob = new ArrayList<Obat>();
        try {
            String query = "Select * from `Obat`";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                o = new Obat(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                ob.add(o);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ob;
    }

    public ArrayList<Pasien> getAllPasien() {
        Pasien p = null;
        ArrayList<Pasien> pas = new ArrayList<Pasien>();
        try {
            String query = "Select * from `Obat`";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Pasien(rs.getString(2), rs.getString(1), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7));
                pas.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pas;
    }
}
