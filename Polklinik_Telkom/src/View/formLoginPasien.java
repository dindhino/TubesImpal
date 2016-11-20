/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
//import javax.swing.*;

import Model.Aplikasi;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


/**
 *
 * @author Ganis, Dhino
 */
public class formLoginPasien extends javax.swing.JFrame implements ActionListener {
    
    /*
    setPreferredSize(new Dimention(1366,763));
    setReziable(true);
    setVisible(true);
    frame.pack();
    */
        
    Aplikasi model;
    Pasien pasien;
    
    /**
     * Creates new form formLoginPasien
     */
    public formLoginPasien(Aplikasi model) {
        initComponents();
        this.model = model;
        this.setLocationRelativeTo(null);
        this.setTitle("Login Pasien");

        this.setVisible(true);
        this.addListener(this);
        
        this.pasien = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Login = new javax.swing.JLabel();
        jLabel_kdpas = new javax.swing.JLabel();
        jLabel_pwd = new javax.swing.JLabel();
        TextField_kdpas = new javax.swing.JTextField();
        jTextField_pwd = new javax.swing.JTextField();
        jButton_OK = new javax.swing.JButton();
        jButton_Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_Login.setText("Login");

        jLabel_kdpas.setText("Kode Pasien :");

        jLabel_pwd.setText("Password     :");

        TextField_kdpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_kdpasActionPerformed(evt);
            }
        });

        jButton_OK.setText("LogIn");

        jButton_Kembali.setText("Kembali");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton_Kembali)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_kdpas)
                            .addComponent(jLabel_pwd))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_kdpas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label_Login)
                        .addGap(234, 234, 234))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(label_Login)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_kdpas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_kdpas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_pwd)
                    .addComponent(jTextField_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Kembali)
                    .addComponent(jButton_OK))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_kdpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_kdpasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_kdpasActionPerformed

    public JButton getjButton_Kembali() {
        return jButton_Kembali;
    }

    public JButton getjButton_OK() {
        return jButton_OK;
    }

    public JTextField getTextField_kdpas() {
        return TextField_kdpas;
    }

    public void setTextField_kdpas(JTextField TextField_kdpas) {
        this.TextField_kdpas = TextField_kdpas;
    }

    public JTextField getjTextField_pwd() {
        return jTextField_pwd;
    }

    public void setjTextField_pwd(JTextField jTextField_pwd) {
        this.jTextField_pwd = jTextField_pwd;
    }

    public void addListener(ActionListener e) {
        jButton_OK.addActionListener(e);
        jButton_Kembali.addActionListener(e);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField_kdpas;
    private javax.swing.JButton jButton_Kembali;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JLabel jLabel_kdpas;
    private javax.swing.JLabel jLabel_pwd;
    private javax.swing.JTextField jTextField_pwd;
    private javax.swing.JLabel label_Login;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(this.getjButton_OK())) {
            String unm = this.getTextField_kdpas().getText();
            String pwd = this.getjTextField_pwd().getText();
            //cek db            
        } else if (source.equals(this.getjButton_Kembali())) {
            new PoliklinikTelkom(model);
            this.dispose();
        }
    }
}
