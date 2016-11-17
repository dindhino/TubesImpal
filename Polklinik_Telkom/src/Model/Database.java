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
                    + "'" + p.getNamaPasien()+ "',"
                    + "'" + p.getKodePasien()+ "',"
                    + "'" + p.getPassword()+ "',"
                    + "'" + p.getUmur()+ "')";
            st.execute(query, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Pasien getPasien(String kodePasien) {
        Pasien p = null;
        try {
            String query = "SELECT * FROM `pasien` WHERE `kodePasien` = " + kodePasien;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Pasien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }

    public void saveKeluhan(Pasien p) {
        try {
            String query = "update pasien set keluhan ='"
                    + p.getKeluhan() + "' where kodePasien = "
                    + p.getKodePasien();
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
                    + p.getObat()+ "', `Jadwal` ='"
                    + p.getJadwal() + "' where `kodePasien` = "
                    + p.getKodePasien();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
