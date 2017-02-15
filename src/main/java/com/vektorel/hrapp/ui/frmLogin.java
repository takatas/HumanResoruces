/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.ui;

import com.vektorel.hrapp.entity.Kullanici;
import com.vektorel.hrapp.service.KullaniciService;
import com.vektorel.hrapp.ui.frmAnasayfa;
import java.awt.event.KeyEvent;
import java.security.spec.KeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author vektorel
 */
public class frmLogin extends javax.swing.JDialog {

    /**
     * Creates new form frmLogin
     */
    public frmLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIptal = new javax.swing.JButton();
        btnGiris = new javax.swing.JButton();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("Kullanıcı Adı :");

        jLabel2.setText("Şifre :");

        btnIptal.setText("İptal");
        btnIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIptalActionPerformed(evt);
            }
        });

        btnGiris.setText("Giriş");
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });

        txtKullaniciAdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKullaniciAdiKeyPressed(evt);
            }
        });

        txtSifre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSifreKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIptal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(btnGiris))
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(txtSifre, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIptal)
                    .addComponent(btnGiris))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
        KullaniciService ks = new KullaniciService();
        Kullanici kullanici = ks.getUsernameAndPassword(txtKullaniciAdi.getText(), txtSifre.getText());
        if (kullanici != null && kullanici.getId() != null) {
            
            
            frmKisiEkle kisiEkle = new frmKisiEkle(null, true);
            this.dispose();
            kisiEkle.show();
            kisiEkle.setLocationRelativeTo(null);
//            frmKullaniciEkle ekle = new frmKullaniciEkle(null, true);
//            ekle.show();
            
//            frmAnasayfa a = new frmAnasayfa(kullanici);
//            a.show();
//            a.setLocationRelativeTo(null);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı Adı veya Şifre Hatalı");
        }
    }//GEN-LAST:event_btnGirisActionPerformed

    private void btnIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIptalActionPerformed
        int a = JOptionPane.showConfirmDialog(rootPane, "Çıkmak istiyor musunuz?", "Çıkış", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnIptalActionPerformed

    private void txtKullaniciAdiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKullaniciAdiKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F9) {
            frmKullaniciEkle ekle = new frmKullaniciEkle(null, true);
            ekle.show();
        }
    }//GEN-LAST:event_txtKullaniciAdiKeyPressed

    private void txtSifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSifreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { // şifre alanında enter a basılırsa login olması sağlandı.
            KullaniciService ks = new KullaniciService();
            Kullanici kullanici = ks.getUsernameAndPassword(txtKullaniciAdi.getText(), txtSifre.getText());
            frmAnasayfa anasayfa = new frmAnasayfa(kullanici);
            this.dispose();
            anasayfa.show();
            anasayfa.setLocationRelativeTo(null);

        }
    }//GEN-LAST:event_txtSifreKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiris;
    private javax.swing.JButton btnIptal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}
