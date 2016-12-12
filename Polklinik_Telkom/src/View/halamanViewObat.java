/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Admin;
import Model.Aplikasi;
import Model.Jadwal;
import Model.Obat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dhino
 */
public class halamanViewObat extends javax.swing.JFrame implements ActionListener {

    Aplikasi model;
    Admin admin;

    /**
     * Creates new form halamanViewObat
     */
    public halamanViewObat(Aplikasi model, Admin admin) {
        initComponents();
        this.model = model;
        this.setLocationRelativeTo(null);
        this.setTitle("Halaman View Obat");
        this.setjLabel_NamaDokter(admin.getNamaAdmin());
        this.setVisible(true);
        this.addListener(this);
        this.admin = admin;

        ArrayList<Obat> ob = new ArrayList<Obat>();
        ob = model.getDb().getAllObat();

        DefaultTableModel dm = (DefaultTableModel) this.getjTable1().getModel();
        Object rowData[] = new Object[4];
        if (ob.size() == 0) {
            rowData[0] = " - ";
            rowData[1] = " - ";
            rowData[2] = " - ";
            rowData[3] = " - ";
            dm.addRow(rowData);
        } else {
            for (int i = 0; i < ob.size(); i++) {
                rowData[0] = ob.get(i).getIdObat();
                rowData[1] = ob.get(i).getNamaObat();
                rowData[2] = ob.get(i).getJenis();
                rowData[3] = ob.get(i).getHarga();
                dm.addRow(rowData);

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_MelihatShiftDokter = new javax.swing.JButton();
        jLabel_NamaDokter = new javax.swing.JLabel();
        jLabel_NamaDokter1 = new javax.swing.JLabel();
        jPanel_foto = new javax.swing.JPanel();
        jButton_LogOut = new javax.swing.JButton();
        jLabel_MengelolaDataPasien = new javax.swing.JLabel();
        jButton_DeleteDataPasien = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_EditDataPasien = new javax.swing.JButton();
        jLabel_DataPAsien = new javax.swing.JLabel();
        jButton_ViewDataPasien = new javax.swing.JButton();
        jButton_MelihatJadwalPeriksa = new javax.swing.JButton();
        jButton_MengelolaShiftDokter = new javax.swing.JButton();
        jLabel_MengelolaDataPasien1 = new javax.swing.JLabel();
        jButton1_addobat = new javax.swing.JButton();
        jButton3_viewobat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 769));

        jButton_MelihatShiftDokter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MelihatShiftDokter.setText("Melihat Shift Dokter");

        jLabel_NamaDokter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_NamaDokter.setText("Nama Admin");

        jLabel_NamaDokter1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_NamaDokter1.setText("ADMIN");

        javax.swing.GroupLayout jPanel_fotoLayout = new javax.swing.GroupLayout(jPanel_foto);
        jPanel_foto.setLayout(jPanel_fotoLayout);
        jPanel_fotoLayout.setHorizontalGroup(
            jPanel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        jPanel_fotoLayout.setVerticalGroup(
            jPanel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        jButton_LogOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_LogOut.setText("LogOut");

        jLabel_MengelolaDataPasien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_MengelolaDataPasien.setText("Mengelola Data Pasien");

        jButton_DeleteDataPasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_DeleteDataPasien.setText("Delete Data Pasien");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Obat", "Nama Obat", "Jenis", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton_EditDataPasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_EditDataPasien.setText("Edit Data Pasien");

        jLabel_DataPAsien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_DataPAsien.setText("OBAT");

        jButton_ViewDataPasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_ViewDataPasien.setText("View Data Pasien");

        jButton_MelihatJadwalPeriksa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MelihatJadwalPeriksa.setText("Melihat Jadwal Periksa");

        jButton_MengelolaShiftDokter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MengelolaShiftDokter.setText("Mengelola Shift Dokter");

        jLabel_MengelolaDataPasien1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_MengelolaDataPasien1.setText("Mengelola Jadwal");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_EditDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_ViewDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_DeleteDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_MengelolaDataPasien)
                            .addComponent(jButton_MelihatShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_MengelolaShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_MelihatJadwalPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_MengelolaDataPasien1)
                            .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_NamaDokter)
                                    .addComponent(jLabel_NamaDokter1)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_DataPAsien)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3_viewobat)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1_addobat)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel_DataPAsien)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_MengelolaDataPasien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_ViewDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_EditDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_DeleteDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel_MengelolaDataPasien1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_MengelolaShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_MelihatShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_MelihatJadwalPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel_NamaDokter1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_NamaDokter)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3_viewobat)
                    .addComponent(jButton1_addobat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjButton_DeleteDataPasien() {
        return jButton_DeleteDataPasien;
    }

    public JButton getjButton_EditDataPasien() {
        return jButton_EditDataPasien;
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

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjLabel_NamaDokter(String jLabel_NamaDokter) {
        this.jLabel_NamaDokter.setText(jLabel_NamaDokter);
    }

    public JButton getjButton1_addobat() {
        return jButton1_addobat;
    }

    public JButton getjButton3_viewobat() {
        return jButton3_viewobat;
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_addobat;
    private javax.swing.JButton jButton3_viewobat;
    private javax.swing.JButton jButton_DeleteDataPasien;
    private javax.swing.JButton jButton_EditDataPasien;
    private javax.swing.JButton jButton_LogOut;
    private javax.swing.JButton jButton_MelihatJadwalPeriksa;
    private javax.swing.JButton jButton_MelihatShiftDokter;
    private javax.swing.JButton jButton_MengelolaShiftDokter;
    private javax.swing.JButton jButton_ViewDataPasien;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_DataPAsien;
    private javax.swing.JLabel jLabel_MengelolaDataPasien;
    private javax.swing.JLabel jLabel_MengelolaDataPasien1;
    private javax.swing.JLabel jLabel_NamaDokter;
    private javax.swing.JLabel jLabel_NamaDokter1;
    private javax.swing.JPanel jPanel_foto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void addListener(ActionListener e) {
        jButton_DeleteDataPasien.addActionListener(e);
        jButton_EditDataPasien.addActionListener(e);
        jButton_LogOut.addActionListener(e);
        jButton_MelihatJadwalPeriksa.addActionListener(e);
        jButton_MelihatShiftDokter.addActionListener(e);
        jButton_MengelolaShiftDokter.addActionListener(e);
        jButton_ViewDataPasien.addActionListener(e);
        jButton1_addobat.addActionListener(e);
        jButton3_viewobat.addActionListener(e);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(this.getjButton_DeleteDataPasien())) {
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
        } else if (source.equals(this.getjButton1_addobat())) {
            new halamanMembuatObat(model, admin);
            this.dispose();
        } else if (source.equals(this.getjButton3_viewobat())) {
            new halamanViewObat(model, admin);
            this.dispose();
        }
    }
}