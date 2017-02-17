/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.ui;

import com.vektorel.hrapp.entity.Kullanici;
import com.vektorel.hrapp.entity.KullaniciTip;
import com.vektorel.hrapp.service.KullaniciService;
import com.vektorel.hrapp.util.DefaultComboModel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author vektorel
 */
public class frmKullaniciEkle extends javax.swing.JDialog {

    KullaniciService kullaniciService = new KullaniciService();
    Kullanici kullanici;

    /**
     * Creates new form frmKullaniciEkle
     */
    public frmKullaniciEkle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        comboInit();
        kullaniciTabloyuDoldur();
    }

    public frmKullaniciEkle(java.awt.Frame parent, boolean modal, Kullanici kullanici) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txtNameSurname.setText(kullanici.getAdSoyad());
        txtPass.setText(kullanici.getPass());
        txtUsername.setText(kullanici.getUsername());
        txtUsername.setEditable(false);
        lblId.setText(kullanici.getId().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtNameSurname = new javax.swing.JTextField();
        btnKaydet = new javax.swing.JButton();
        btnIptal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbKulTip = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKullaniciListesi = new javax.swing.JTable();
        btnKullaniciGuncelle = new javax.swing.JButton();
        btnKullaniciSil = new javax.swing.JButton();
        btnSifreDegistir = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btnKaydet.setText("Kaydet");
        btnKaydet.setToolTipText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnIptal.setText("Iptal");
        btnIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIptalActionPerformed(evt);
            }
        });

        jLabel1.setText("Kullanıcı Adı");

        jLabel2.setText("Sifre :");

        jLabel3.setText("Ad Soyad");

        jLabel4.setText("Kullanıcı No");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Kullanıcı Detay");

        jLabel6.setText("Kullanıcı Tipi :");

        tblKullaniciListesi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblKullaniciListesi);

        btnKullaniciGuncelle.setText("Güncelle");
        btnKullaniciGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciGuncelleActionPerformed(evt);
            }
        });

        btnKullaniciSil.setText("Sil");
        btnKullaniciSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciSilActionPerformed(evt);
            }
        });

        btnSifreDegistir.setText("Şifre Değiştir");
        btnSifreDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSifreDegistirActionPerformed(evt);
            }
        });

        lblEmail.setText("e-mail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKaydet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKullaniciGuncelle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKullaniciSil, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(9, 9, 9)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 32, Short.MAX_VALUE)
                                .addComponent(btnIptal)
                                .addGap(18, 18, 18)
                                .addComponent(btnSifreDegistir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPass)
                                    .addComponent(cmbKulTip, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(cmbKulTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(lblEmail))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnKullaniciGuncelle)
                    .addComponent(btnIptal)
                    .addComponent(btnKullaniciSil)
                    .addComponent(btnSifreDegistir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        try {
            //KullaniciService ks = new KullaniciService();
            DefaultComboModel secilenModel = (DefaultComboModel) cmbKulTip.getSelectedItem();
            KullaniciTip t = KullaniciTip.getEnum(secilenModel.getValue().intValue());

            if (lblId.getText().trim().equals("")) {
                kullaniciService.save(new Kullanici(null, txtUsername.getText(), txtPass.getText(), txtNameSurname.getText(), txtEmail.getText(), t));
            } else {
                kullaniciService.update(new Kullanici(new Long(lblId.getText()), txtUsername.getText(), txtPass.getText(), txtNameSurname.getText(), txtEmail.getText(), t));
            }
            //this.dispose();
            kullaniciTabloyuDoldur();
            alanBosalt();
//            btnKullaniciGuncelle.setEnabled(true);
//            btnKaydet.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIptalActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnIptalActionPerformed

    private void btnKullaniciGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciGuncelleActionPerformed
        int seciliKayit = tblKullaniciListesi.getSelectedRow();
        if (seciliKayit > -1) {
            String value = tblKullaniciListesi.getValueAt(seciliKayit, 0).toString();
            Kullanici kullanici = kullaniciService.getById(new Long(value));

            lblId.setText(kullanici.getId().toString());
            txtUsername.setText(kullanici.getUsername());
            txtPass.setText(kullanici.getPass());
            txtNameSurname.setText(kullanici.getAdSoyad());
            txtEmail.setText(kullanici.getEmail());
            
//            btnKullaniciGuncelle.setEnabled(false);
//            btnKaydet.setEnabled(true);

        }
    }//GEN-LAST:event_btnKullaniciGuncelleActionPerformed

    private void btnKullaniciSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciSilActionPerformed
        int seciliKayit = tblKullaniciListesi.getSelectedRow();
        if (seciliKayit > -1) {
            String value = tblKullaniciListesi.getValueAt(seciliKayit, 0).toString();
            Kullanici kullanici = kullaniciService.getById(new Long(value));
            int a = JOptionPane.showConfirmDialog(rootPane, "Seçili Kaydı Silmek istiyor musunuz?", "Sil", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (a == 0) {
                kullaniciService.delete(kullanici);
                kullaniciTabloyuDoldur();
            }

        }

    }//GEN-LAST:event_btnKullaniciSilActionPerformed

    private void btnSifreDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSifreDegistirActionPerformed
        int seciliKayit = tblKullaniciListesi.getSelectedRow();
        if (seciliKayit > -1) {
            String value = tblKullaniciListesi.getValueAt(seciliKayit, 0).toString();
            Kullanici kullanici = kullaniciService.getById(new Long(value));
            frmSifreDegistir sifreDegistir = new frmSifreDegistir(null, true, kullanici);
            sifreDegistir.show();
            sifreDegistir.setLocationRelativeTo(null);

        }
    }//GEN-LAST:event_btnSifreDegistirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIptal;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnKullaniciGuncelle;
    private javax.swing.JButton btnKullaniciSil;
    private javax.swing.JButton btnSifreDegistir;
    private javax.swing.JComboBox<String> cmbKulTip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JTable tblKullaniciListesi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNameSurname;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void comboInit() {
        DefaultComboModel[] dizi = new DefaultComboModel[3];
        for (int i = 0; i < KullaniciTip.values().length; i++) {
            String label = KullaniciTip.values()[i].getLabel();
            dizi[i] = new DefaultComboModel(new Long(i), label);
        }
        cmbKulTip.setModel(new DefaultComboBoxModel(dizi));
    }

    private void kullaniciTabloyuDoldur() {
        List<Kullanici> kullanici = kullaniciService.getAll(null);
        String[][] data = new String[kullanici.size()][6];
        for (int i = 0; i < kullanici.size(); i++) {
            data[i][0] = kullanici.get(i).getId().toString();
            data[i][1] = kullanici.get(i).getAdSoyad();
            data[i][2] = kullanici.get(i).getUsername();
            if (kullanici.get(i).getKullaniciTip() != null) {
                data[i][3] = kullanici.get(i).getKullaniciTip().getLabel();
            }
            data[i][4] = kullanici.get(i).getEmail();

        }

        tblKullaniciListesi.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Id", "Ad Soyad", "Kullanıcı Adı", "Kullanıcı Rolü", "e-Mail"
                }
        ));
    }

    private void alanBosalt() {

        txtNameSurname.setText("");
        txtPass.setText("");
        txtUsername.setText("");
        txtEmail.setText("");
    }
}
