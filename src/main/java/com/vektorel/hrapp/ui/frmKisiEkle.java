/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.ui;

import com.vektorel.hrapp.entity.Cinsiyet;
import com.vektorel.hrapp.entity.Il;
import com.vektorel.hrapp.entity.Ilce;
import com.vektorel.hrapp.entity.Kisi;
import com.vektorel.hrapp.service.IlService;
import com.vektorel.hrapp.service.IlceService;
import com.vektorel.hrapp.service.KisiService;
import com.vektorel.hrapp.util.DefaultComboModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author soner
 */
public class frmKisiEkle extends javax.swing.JDialog {

    KisiService kisiService = new KisiService();

    /**
     * Creates new form frmKisiEkle
     */
    public frmKisiEkle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lblKisiId.setVisible(false);
        kisiTabloyuDoldur();
        IlIlceComboDoldur();
        comboInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKisiKaydet = new javax.swing.JButton();
        lblAd = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        txtTcNo = new javax.swing.JTextField();
        lblTcNo = new javax.swing.JLabel();
        dcDogumTarihi = new com.toedter.calendar.JDateChooser();
        lblDogumTarihi = new javax.swing.JLabel();
        lblAnneAdi = new javax.swing.JLabel();
        lblBabaAdi = new javax.swing.JLabel();
        txtAnneAdi = new javax.swing.JTextField();
        txtBabaAdi = new javax.swing.JTextField();
        lblCinsiyet = new javax.swing.JLabel();
        cmbCinsiyet = new javax.swing.JComboBox<>();
        lblIl = new javax.swing.JLabel();
        cmbIl = new javax.swing.JComboBox<>();
        lblIlce = new javax.swing.JLabel();
        cmbIlce = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        lblAdres = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdres = new javax.swing.JTextArea();
        btnKisiGuncelle = new javax.swing.JButton();
        btnKisiSil = new javax.swing.JButton();
        btnKisiKapat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKisiListesi = new javax.swing.JTable();
        lblKisiId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnKisiKaydet.setText("Kaydet");
        btnKisiKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKisiKaydetActionPerformed(evt);
            }
        });

        lblAd.setText("Ad");

        jLabel1.setText("Soyad");

        lblTcNo.setText("TC No");

        dcDogumTarihi.setDateFormatString("dd.MM.yyyy");

        lblDogumTarihi.setText("Doğum Tarihi");

        lblAnneAdi.setText("Anne Adı");

        lblBabaAdi.setText("Baba Adı");

        lblCinsiyet.setText("Cinsiyet");

        lblIl.setText("İl");

        cmbIl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIlActionPerformed(evt);
            }
        });

        lblIlce.setText("İlçe");

        jLabel2.setText("Telefon");

        lblAdres.setText("Adres");

        txtAdres.setColumns(20);
        txtAdres.setRows(5);
        jScrollPane1.setViewportView(txtAdres);

        btnKisiGuncelle.setText("Güncelle");
        btnKisiGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKisiGuncelleActionPerformed(evt);
            }
        });

        btnKisiSil.setText("Sil");
        btnKisiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKisiSilActionPerformed(evt);
            }
        });

        btnKisiKapat.setText("Kapat");

        tblKisiListesi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblKisiListesi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblAd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(lblTcNo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAd, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(txtSoyad)
                                    .addComponent(txtTcNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDogumTarihi)
                                    .addComponent(lblAnneAdi)
                                    .addComponent(lblBabaAdi)
                                    .addComponent(lblAdres)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(btnKisiKaydet)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKisiGuncelle))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblCinsiyet)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnKisiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKisiKapat)
                                        .addGap(0, 5, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblKisiId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dcDogumTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtAnneAdi)
                                    .addComponent(txtBabaAdi))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefon))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblIl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblIlce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbIlce, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(cmbIl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jScrollPane1))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAd)
                        .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDogumTarihi))
                    .addComponent(dcDogumTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIl)
                        .addComponent(cmbIl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnneAdi)
                    .addComponent(txtAnneAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIlce)
                    .addComponent(cmbIlce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTcNo)
                    .addComponent(lblBabaAdi)
                    .addComponent(txtBabaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKisiId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCinsiyet)
                                .addComponent(cmbCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAdres)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKisiKaydet)
                            .addComponent(btnKisiGuncelle)
                            .addComponent(btnKisiSil)
                            .addComponent(btnKisiKapat)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKisiKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKisiKaydetActionPerformed
        String ad = txtAd.getText();
        String soyAd = txtSoyad.getText();
        Long tcNo = new Long(txtTcNo.getText());
        String anneAd = txtAnneAdi.getText();
        String babaAd = txtBabaAdi.getText();
        String adres = txtAdres.getText();
        String telefon = txtTelefon.getText();
        Date dogumTarih = dcDogumTarihi.getDate();

        DefaultComboModel cinsiyetModel = (DefaultComboModel) cmbCinsiyet.getSelectedItem();
        Cinsiyet cinsiyet = Cinsiyet.getEnum(cinsiyetModel.getValue().intValue());

        IlService ilService = new IlService();
        Il il = ilService.getByIlAdi(cmbIl.getSelectedItem().toString());

        IlceService ilceService = new IlceService();
        Ilce ilce = ilceService.getByIlceAdi(cmbIlce.getSelectedItem().toString());

        try {
            if (lblKisiId.getText().trim().equals("")) {
                kisiService.save(new Kisi(null, ad, soyAd, tcNo, anneAd, babaAd, adres, telefon, dogumTarih, cinsiyet, il, ilce));
            } else {
                kisiService.update(new Kisi(new Long(lblKisiId.getText()), ad, soyAd, tcNo, anneAd, babaAd, adres, telefon, dogumTarih, cinsiyet, il, ilce));
            }
            kisiTabloyuDoldur();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnKisiKaydetActionPerformed

    private void btnKisiGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKisiGuncelleActionPerformed
        int seciliKayit = tblKisiListesi.getSelectedRow();
        if (seciliKayit > -1) {
            String value = tblKisiListesi.getValueAt(seciliKayit, 0).toString();
            Kisi kisi = kisiService.getById(new Long(value));

            lblKisiId.setText(kisi.getId().toString());
            txtAd.setText(kisi.getAd());
            txtSoyad.setText(kisi.getSoyad());
            txtTcNo.setText(kisi.getTc().toString());
            txtAnneAdi.setText(kisi.getAnaAdi());
            txtBabaAdi.setText(kisi.getBabaAdi());
            txtTelefon.setText(kisi.getTel());
            txtAdres.setText(kisi.getAcikAdres());
            dcDogumTarihi.setDate(kisi.getDogumTarihi());
            comboInit();
        }

    }//GEN-LAST:event_btnKisiGuncelleActionPerformed

    private void btnKisiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKisiSilActionPerformed
        try {
            int seciliKayit = tblKisiListesi.getSelectedRow();
            if (seciliKayit > -1) {
                String value = tblKisiListesi.getValueAt(seciliKayit, 0).toString();
                Kisi kisi = kisiService.getById(new Long(value));
                int a = JOptionPane.showConfirmDialog(rootPane, "Seçili Kaydı Silmek istiyor musunuz?", "Sil", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (a == 0) {
                    kisiService.delete(kisi);
                    kisiTabloyuDoldur();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnKisiSilActionPerformed

    private void cmbIlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIlActionPerformed
        
    }//GEN-LAST:event_cmbIlActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKisiGuncelle;
    private javax.swing.JButton btnKisiKapat;
    private javax.swing.JButton btnKisiKaydet;
    private javax.swing.JButton btnKisiSil;
    private javax.swing.JComboBox<String> cmbCinsiyet;
    private javax.swing.JComboBox<String> cmbIl;
    private javax.swing.JComboBox<String> cmbIlce;
    private com.toedter.calendar.JDateChooser dcDogumTarihi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblAdres;
    private javax.swing.JLabel lblAnneAdi;
    private javax.swing.JLabel lblBabaAdi;
    private javax.swing.JLabel lblCinsiyet;
    private javax.swing.JLabel lblDogumTarihi;
    private javax.swing.JLabel lblIl;
    private javax.swing.JLabel lblIlce;
    private javax.swing.JLabel lblKisiId;
    private javax.swing.JLabel lblTcNo;
    private javax.swing.JTable tblKisiListesi;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextArea txtAdres;
    private javax.swing.JTextField txtAnneAdi;
    private javax.swing.JTextField txtBabaAdi;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTcNo;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables

    private void IlIlceComboDoldur() {

        IlService ilService = new IlService();
        List<Il> il = ilService.getAll(null);
        String[] ilData = new String[il.size()];
        for (int i = 0; i < il.size(); i++) {
            ilData[i] = il.get(i).getAd();
            cmbIl.addItem(il.get(i).getAd());

        }

        IlceService ilceService = new IlceService();
        List<Ilce> ilce = ilceService.getAll(null);
        String[] ilceData = new String[il.size()];
        for (int i = 0; i < ilce.size(); i++) {
            ilceData[i] = ilce.get(i).getAd();
            cmbIlce.addItem(ilce.get(i).getAd());

        }

    }

    private void kisiTabloyuDoldur() {
        List<Kisi> kisi = kisiService.getAll(null);
        String[][] data = new String[kisi.size()][8];
        for (int i = 0; i < kisi.size(); i++) {
            data[i][0] = kisi.get(i).getId().toString();
            data[i][1] = kisi.get(i).getAdSoyad();
            data[i][2] = kisi.get(i).getTc().toString();
            data[i][3] = kisi.get(i).getAnaAdi();
            data[i][4] = kisi.get(i).getBabaAdi();
            if (kisi.get(i).getDogumTarihi() != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                data[i][5] = sdf.format(kisi.get(i).getDogumTarihi());
            }
            if (kisi.get(i).getCinsiyet() != null) {
                data[i][6] = kisi.get(i).getCinsiyet().getLabel();
            }
            if (kisi.get(i).getIlIlce() != null) {
                data[i][7] = kisi.get(i).getIlIlce();
            }
        }

        tblKisiListesi.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Id",
                    "Ad Soyad", "TC No", "Ana Adı", "Baba Adı", "Doğum Tarihi", "Cinsiyet", "İl - İlçe"
                }
        ));
    }

    private void comboInit() {
        DefaultComboModel[] dizi = new DefaultComboModel[3];
        for (int i = 0; i < Cinsiyet.values().length; i++) {
            String label = Cinsiyet.values()[i].getLabel();
            dizi[i] = new DefaultComboModel(new Long(i), label);
        }
        cmbCinsiyet.setModel(new DefaultComboBoxModel(dizi));
    }

}
