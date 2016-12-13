/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Admin;
import Model.Aplikasi;
import Model.Jadwal;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Dhino
 */
public class deleteDataPasien extends javax.swing.JFrame implements ActionListener {

    Aplikasi model;
    Admin admin;
    Pasien pasien;

    /**
     * Creates new form deleteDataPasien
     */
    public deleteDataPasien(Aplikasi model, Admin admin, Pasien pasien) {
        initComponents();
        this.model = model;
        this.setLocationRelativeTo(null);
        this.setTitle("Halaman Delete Data Pasien");
        this.setjLabel_NamaAdmin(admin.getNamaAdmin());
        this.setjLabel_namatext(pasien.getNamaPasien());
        this.setjLabel_kodepasientext(pasien.getKodePasien());
        this.setjLabel_umurtext(pasien.getUmur());
        this.setjTextArea_keluhan(pasien.getKeluhan());
        this.setjTextArea_diagnosadokter(pasien.getDiagnosa());
        this.setjTextArea_ResepObat(pasien.getKodeObat());
        this.setVisible(true);
        this.addListener(this);
        this.admin = admin;
        this.pasien = pasien;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_foto5 = new javax.swing.JPanel();
        jLabel_NamaAdmin1 = new javax.swing.JLabel();
        jLabel_NamaAdmin = new javax.swing.JLabel();
        jButton_LogOut = new javax.swing.JButton();
        jLabel_MengelolaDataPasien = new javax.swing.JLabel();
        jButton_ViewDataPasien = new javax.swing.JButton();
        jButton_EditDataPasien = new javax.swing.JButton();
        jButton_DeleteDataPasien = new javax.swing.JButton();
        jLabel_MengelolaDataPasien1 = new javax.swing.JLabel();
        jButton_MengelolaShiftDokter = new javax.swing.JButton();
        jButton_MelihatShiftDokter = new javax.swing.JButton();
        jButton_MelihatJadwalPeriksa = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_ResepObat = new javax.swing.JTextArea();
        jLabel_ResepObat = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_diagnosadokter = new javax.swing.JTextArea();
        jLabel_DiagnosDokter = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_keluhan = new javax.swing.JTextArea();
        jLabel_Keluhan = new javax.swing.JLabel();
        jLabel_kodepasientext = new javax.swing.JLabel();
        jLabel_umurtext = new javax.swing.JLabel();
        jLabel_namatext = new javax.swing.JLabel();
        jLabel_nama = new javax.swing.JLabel();
        jLabel_Umur = new javax.swing.JLabel();
        jLabel_KodePasien = new javax.swing.JLabel();
        jButton_Hapus = new javax.swing.JButton();
        jButton_kembali1 = new javax.swing.JButton();
        jButton1_addobat = new javax.swing.JButton();
        jButton3_viewobat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel_foto5Layout = new javax.swing.GroupLayout(jPanel_foto5);
        jPanel_foto5.setLayout(jPanel_foto5Layout);
        jPanel_foto5Layout.setHorizontalGroup(
            jPanel_foto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        jPanel_foto5Layout.setVerticalGroup(
            jPanel_foto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel_NamaAdmin1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_NamaAdmin1.setText("ADMIN");

        jLabel_NamaAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_NamaAdmin.setText("Nama Admin");

        jButton_LogOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_LogOut.setText("LogOut");

        jLabel_MengelolaDataPasien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_MengelolaDataPasien.setText("Mengelola Data Pasien");

        jButton_ViewDataPasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_ViewDataPasien.setText("View Data Pasien");

        jButton_EditDataPasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_EditDataPasien.setText("Edit Data Pasien");

        jButton_DeleteDataPasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_DeleteDataPasien.setText("Delete Data Pasien");

        jLabel_MengelolaDataPasien1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_MengelolaDataPasien1.setText("Mengelola Jadwal");

        jButton_MengelolaShiftDokter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MengelolaShiftDokter.setText("Mengelola Shift Dokter");

        jButton_MelihatShiftDokter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MelihatShiftDokter.setText("Melihat Shift Dokter");

        jButton_MelihatJadwalPeriksa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MelihatJadwalPeriksa.setText("Melihat Jadwal Periksa");

        jTextArea_ResepObat.setColumns(20);
        jTextArea_ResepObat.setRows(5);
        jScrollPane3.setViewportView(jTextArea_ResepObat);

        jLabel_ResepObat.setText("Resep Obat");

        jTextArea_diagnosadokter.setColumns(20);
        jTextArea_diagnosadokter.setRows(5);
        jScrollPane2.setViewportView(jTextArea_diagnosadokter);

        jLabel_DiagnosDokter.setText("Diagnosa Dokter");

        jTextArea_keluhan.setColumns(20);
        jTextArea_keluhan.setRows(5);
        jScrollPane1.setViewportView(jTextArea_keluhan);

        jLabel_Keluhan.setText("Keluhan");

        jLabel_kodepasientext.setText("jLabel3");

        jLabel_umurtext.setText("jLabel2");

        jLabel_namatext.setText("jLabel1");

        jLabel_nama.setText("Nama :");

        jLabel_Umur.setText("Umur :");

        jLabel_KodePasien.setText("Kode Pasien :");

        jButton_Hapus.setText("Hapus");

        jButton_kembali1.setText("Kembali");

        jButton1_addobat.setText("Membuat Obat");

        jButton3_viewobat.setText("Melihat Obat");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mengelola Obat");
        jLabel2.setMaximumSize(new java.awt.Dimension(138, 22));
        jLabel2.setMinimumSize(new java.awt.Dimension(138, 22));
        jLabel2.setPreferredSize(new java.awt.Dimension(138, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_foto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_NamaAdmin)
                            .addComponent(jLabel_NamaAdmin1)))
                    .addComponent(jButton_MelihatJadwalPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_EditDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ViewDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_DeleteDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_MengelolaDataPasien)
                    .addComponent(jButton_MelihatShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_MengelolaShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_MengelolaDataPasien1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1_addobat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3_viewobat, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_kembali1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_Keluhan)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel_DiagnosDokter)
                        .addComponent(jScrollPane2)
                        .addComponent(jLabel_ResepObat)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_KodePasien)
                                .addComponent(jLabel_Umur)
                                .addComponent(jLabel_nama))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_namatext)
                                .addComponent(jLabel_umurtext)
                                .addComponent(jLabel_kodepasientext)))))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nama)
                            .addComponent(jLabel_namatext))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Umur)
                            .addComponent(jLabel_umurtext)
                            .addComponent(jLabel_NamaAdmin1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_KodePasien)
                            .addComponent(jLabel_kodepasientext)
                            .addComponent(jLabel_NamaAdmin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel_foto5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel_Keluhan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_DiagnosDokter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ResepObat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_kembali1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_MengelolaDataPasien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_ViewDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_EditDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jButton_DeleteDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel_MengelolaDataPasien1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_MengelolaShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_MelihatShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_MelihatJadwalPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1_addobat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3_viewobat))
                        .addGap(88, 88, 88))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjButton_DeleteDataPasien() {
        return jButton_DeleteDataPasien;
    }

    public JButton getjButton_EditDataPasien() {
        return jButton_EditDataPasien;
    }

    public JButton getjButton_Hapus() {
        return jButton_Hapus;
    }

    public JButton getjButton_LogOut() {
        return jButton_LogOut;
    }

    public JButton getjButton_MelihatJadwalPeriksa() {
        return jButton_MelihatJadwalPeriksa;
    }

    public JButton getjButton_MelihatShiftDokter() {
        return jButton_MelihatShiftDokter;
    }

    public JButton getjButton_MengelolaShiftDokter() {
        return jButton_MengelolaShiftDokter;
    }

    public JButton getjButton_ViewDataPasien() {
        return jButton_ViewDataPasien;
    }

    public JButton getjButton_kembali1() {
        return jButton_kembali1;
    }

    public void setjLabel_NamaAdmin(String jLabel_NamaAdmin) {
        this.jLabel_NamaAdmin.setText(jLabel_NamaAdmin);
    }

    public JLabel getjLabel_namatext() {
        return jLabel_namatext;
    }

    public void setjLabel_namatext(String jLabel_namatext) {
        this.jLabel_namatext.setText(jLabel_namatext);
    }

    public JLabel getjLabel_umurtext() {
        return jLabel_umurtext;
    }

    public void setjLabel_umurtext(int jLabel_umurtext) {
        this.jLabel_umurtext.setText(Integer.toString(jLabel_umurtext));
    }

    public JTextArea getjTextArea_ResepObat() {
        return jTextArea_ResepObat;
    }

    public void setjTextArea_ResepObat(String obat) {
        this.jTextArea_ResepObat.setText(obat);
    }

    public JTextArea getjTextArea_diagnosadokter() {
        return jTextArea_diagnosadokter;
    }

    public void setjTextArea_diagnosadokter(String jTextArea_diagnosadokter) {
        this.jTextArea_diagnosadokter.setText(jTextArea_diagnosadokter);
    }

    public JTextArea getjTextArea_keluhan() {
        return jTextArea_keluhan;
    }

    public void setjTextArea_keluhan(String jTextArea_keluhan) {
        this.jTextArea_keluhan.setText(jTextArea_keluhan);
    }

    public JLabel getjLabel_kodepasientext() {
        return jLabel_kodepasientext;
    }

    public void setjLabel_kodepasientext(String jLabel_kodepasientext) {
        this.jLabel_kodepasientext.setText(jLabel_kodepasientext);
    }

    public JButton getjButton1_addobat() {
        return jButton1_addobat;
    }

    public JButton getjButton3_viewobat() {
        return jButton3_viewobat;
    }
    
    

    public void addListener(ActionListener e) {
        jButton_DeleteDataPasien.addActionListener(e);
        jButton_EditDataPasien.addActionListener(e);
        jButton_LogOut.addActionListener(e);
        jButton_MelihatJadwalPeriksa.addActionListener(e);
        jButton_MelihatShiftDokter.addActionListener(e);
        jButton_MengelolaShiftDokter.addActionListener(e);
        jButton_ViewDataPasien.addActionListener(e);
        jButton_kembali1.addActionListener(e);
        jButton_Hapus.addActionListener(e);
        jButton1_addobat.addActionListener(e);
        jButton3_viewobat.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_addobat;
    private javax.swing.JButton jButton3_viewobat;
    private javax.swing.JButton jButton_DeleteDataPasien;
    private javax.swing.JButton jButton_EditDataPasien;
    private javax.swing.JButton jButton_Hapus;
    private javax.swing.JButton jButton_LogOut;
    private javax.swing.JButton jButton_MelihatJadwalPeriksa;
    private javax.swing.JButton jButton_MelihatShiftDokter;
    private javax.swing.JButton jButton_MengelolaShiftDokter;
    private javax.swing.JButton jButton_ViewDataPasien;
    private javax.swing.JButton jButton_kembali1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_DiagnosDokter;
    private javax.swing.JLabel jLabel_Keluhan;
    private javax.swing.JLabel jLabel_KodePasien;
    private javax.swing.JLabel jLabel_MengelolaDataPasien;
    private javax.swing.JLabel jLabel_MengelolaDataPasien1;
    private javax.swing.JLabel jLabel_NamaAdmin;
    private javax.swing.JLabel jLabel_NamaAdmin1;
    private javax.swing.JLabel jLabel_ResepObat;
    private javax.swing.JLabel jLabel_Umur;
    private javax.swing.JLabel jLabel_kodepasientext;
    private javax.swing.JLabel jLabel_nama;
    private javax.swing.JLabel jLabel_namatext;
    private javax.swing.JLabel jLabel_umurtext;
    private javax.swing.JPanel jPanel_foto5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_ResepObat;
    private javax.swing.JTextArea jTextArea_diagnosadokter;
    private javax.swing.JTextArea jTextArea_keluhan;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(this.getjButton_DeleteDataPasien())) {
            //DELETE
            model.getDb().deletePasien(pasien);
            new deleteDataPasien1(model, admin);
            this.dispose();
        } else if (source.equals(this.getjButton_EditDataPasien())) {
            new editDataPasien1(model, admin);
            this.dispose();
        } else if (source.equals(this.getjButton_LogOut())) {
            new PoliklinikTelkom(model);
            this.dispose();
        } else if (source.equals(this.getjButton_MelihatJadwalPeriksa())) {
            new halamanViewJadwalPeriksaAdmin(model, admin);
            this.dispose();
        } else if (source.equals(this.getjButton_MelihatShiftDokter())) {
            new halamanLiatShiftJadwalAdmin(model, admin);
            this.dispose();
        } else if (source.equals(this.getjButton_MengelolaShiftDokter())) {
            new halamanMembuatShiftJadwal(model, admin);
            this.dispose();
        } else if (source.equals(this.getjButton_ViewDataPasien())) {
            new viewDataPasien(model, admin);
            this.dispose();
        } else if (source.equals(this.getjButton_kembali1())) {
            new deleteDataPasien1(model, admin);
            this.dispose();
        } else if (source.equals(this.getjButton_Hapus())) {
            ArrayList<Jadwal> jad = model.getDb().getAllJadwal();
            for (int i = 0; i < jad.size(); i++) {
                if (jad.get(i).getKodePasien() != null) {
                    if (jad.get(i).getKodePasien().equals(pasien.getKodePasien())) {
                        model.getDb().deletePasienFromJadwal(jad.get(i));
                    }
                }
            }
            model.getDb().deletePasien(pasien);
            JOptionPane.showMessageDialog(this, "Data berhasil di hapus");
            new deleteDataPasien1(model, admin);
            this.dispose();
        } else if (source.equals(this.getjButton1_addobat())) {
            new halamanMembuatObat(model, admin);
            this.dispose();
        } else if (source.equals(this.getjButton3_viewobat())) {
            new halamanViewObat(model, admin);
            this.dispose();
        }
    }
}
