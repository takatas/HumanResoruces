/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.ui;

import com.vektorel.hrapp.service.IlService;
import com.vektorel.hrapp.service.IlceService;
import com.vektorel.hrapp.entity.Il;
import com.vektorel.hrapp.entity.Ilce;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vektorel
 */
public class frmIlIlceTablo extends javax.swing.JDialog {

    /**
     * Creates new form frmIlEkle
     */
    
    // silme işleminde sıkıntı var.
    private static int LISTE = 0;

    IlService ilService = new IlService();
    IlceService ilceService = new IlceService();

    public frmIlIlceTablo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popMnuIlIce = new javax.swing.JPopupMenu();
        popMnuGuncelle = new javax.swing.JMenuItem();
        popMnuSil = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIlIlce = new javax.swing.JTable();
        btnIlEkle = new javax.swing.JButton();
        btnIlListele = new javax.swing.JButton();
        btnIlceListele = new javax.swing.JButton();
        btnIlceEkle = new javax.swing.JButton();

        popMnuIlIce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                popMnuIlIceMouseReleased(evt);
            }
        });

        popMnuGuncelle.setText("Güncelle");
        popMnuGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMnuGuncelleActionPerformed(evt);
            }
        });
        popMnuIlIce.add(popMnuGuncelle);

        popMnuSil.setText("Sil");
        popMnuSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMnuSilActionPerformed(evt);
            }
        });
        popMnuIlIce.add(popMnuSil);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblIlIlce.setModel(new javax.swing.table.DefaultTableModel(
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
        tblIlIlce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblIlIlceMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblIlIlce);

        btnIlEkle.setText("İl Ekle");
        btnIlEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIlEkleActionPerformed(evt);
            }
        });

        btnIlListele.setText("İl Listele");
        btnIlListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIlListeleActionPerformed(evt);
            }
        });

        btnIlceListele.setText("İlçe Listele");
        btnIlceListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIlceListeleActionPerformed(evt);
            }
        });

        btnIlceEkle.setText("İlçe Ekle");
        btnIlceEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIlceEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIlEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIlListele)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIlceEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIlceListele)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIlEkle)
                    .addComponent(btnIlListele)
                    .addComponent(btnIlceListele)
                    .addComponent(btnIlceEkle))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIlEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIlEkleActionPerformed
        frmIlEkle ilEkle = new frmIlEkle(null, true);
        ilEkle.show();
        setLocationRelativeTo(null);
        IlTabloyuDoldur();
    }//GEN-LAST:event_btnIlEkleActionPerformed

    private void btnIlListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIlListeleActionPerformed
        IlTabloyuDoldur();
    }//GEN-LAST:event_btnIlListeleActionPerformed

    private void popMnuIlIceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popMnuIlIceMouseReleased
        if (evt.isPopupTrigger()) {
            popMnuIlIce.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_popMnuIlIceMouseReleased

    private void popMnuGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuGuncelleActionPerformed
        if (LISTE == 1) {
            ilGuncelle();
        } else if (LISTE == 2) {
            ilceGuncelle();
        }
    }//GEN-LAST:event_popMnuGuncelleActionPerformed

    private void tblIlIlceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIlIlceMouseReleased
        if (evt.isPopupTrigger()) {
            popMnuIlIce.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblIlIlceMouseReleased

    private void btnIlceEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIlceEkleActionPerformed
        frmIlceEkle ilceEkle = new frmIlceEkle(null, true);
        ilceEkle.show();
        setLocationRelativeTo(null);
        IlceTabloyuDoldur();
    }//GEN-LAST:event_btnIlceEkleActionPerformed

    private void btnIlceListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIlceListeleActionPerformed
        IlceTabloyuDoldur();
    }//GEN-LAST:event_btnIlceListeleActionPerformed

    private void popMnuSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuSilActionPerformed
        if (LISTE == 1) {
            ilSil();
        } else if (LISTE == 2) {
            ilceSil();
        }
    }//GEN-LAST:event_popMnuSilActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIlEkle;
    private javax.swing.JButton btnIlListele;
    private javax.swing.JButton btnIlceEkle;
    private javax.swing.JButton btnIlceListele;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem popMnuGuncelle;
    private javax.swing.JPopupMenu popMnuIlIce;
    private javax.swing.JMenuItem popMnuSil;
    private javax.swing.JTable tblIlIlce;
    // End of variables declaration//GEN-END:variables

    private void IlTabloyuDoldur() {
        //tablo doldur
        List<Il> il = ilService.getAll(null);
        String[][] data = new String[il.size()][6];
        for (int i = 0; i < il.size(); i++) {
            //data[i][0] = il.get(i).getId().toString();
            data[i][0] = il.get(i).getKod();
            data[i][1] = il.get(i).getAd();
        }
        tblIlIlce.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "İl Kodu", "İl Adı"
                }
        ));
        LISTE = 1;
    }

    private void IlceTabloyuDoldur() {
        //tablo doldur
        List<Ilce> ilce = ilceService.getAll(null);
        String[][] data = new String[ilce.size()][6];
        for (int i = 0; i < ilce.size(); i++) {
            data[i][0] = ilce.get(i).getId().toString();
            data[i][1] = ilce.get(i).getKod();
            data[i][2] = ilce.get(i).getAd();
            data[i][3] = ilce.get(i).getIl().getAd();
        }
        tblIlIlce.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Id", "İlçe Kodu", "İlçe Adı", "İl Adı"
                }
        ));

        LISTE = 2;
    }

    private void ilGuncelle() {
        int seciliKayit = tblIlIlce.getSelectedRow();
        if (seciliKayit > -1) {
            String value = tblIlIlce.getValueAt(seciliKayit, 0).toString();
            Il il = ilService.getById(new Long(value));
            frmIlEkle guncelle = new frmIlEkle(null, true, il);
            guncelle.show();
            IlTabloyuDoldur();
        }
    }

    private void ilSil() {

        try {

            int seciliKayit = tblIlIlce.getSelectedRow();
            if (seciliKayit > -1) {
                int silisinMi = (JOptionPane.showConfirmDialog(rootPane, "Silmek İstediğinize Emin misiniz?"));
                if (silisinMi == 0) {
                    String value = tblIlIlce.getValueAt(seciliKayit, 0).toString();
                    Il il = ilService.getById(new Long(value));
                    ilService.delete(il);
                    IlTabloyuDoldur();
                }
            }

        } catch (Exception e) {

            e.getMessage();
        }

    }

    private void ilceGuncelle() {
        int seciliKayit = tblIlIlce.getSelectedRow();
        if (seciliKayit > -1) {
            String value = tblIlIlce.getValueAt(seciliKayit, 0).toString();
            Ilce ilce = ilceService.getById(new Long(value));
//            frmIlceEkle guncelle = new frmIlceEkle();
//            guncelle.show();
            IlceTabloyuDoldur();
        }
    }

    private void ilceSil() {

        try {
            int seciliKayit = tblIlIlce.getSelectedRow();
            if (seciliKayit > -1) {
                int silisinMi = (JOptionPane.showConfirmDialog(rootPane, "Silmek İstediğinize Emin misiniz?"));
                if (silisinMi == 0) {
                    String value = tblIlIlce.getValueAt(seciliKayit, 0).toString();
                    Ilce ilce = ilceService.getById(new Long(value));
                    ilceService.delete(ilce);
                    IlceTabloyuDoldur();
                }

            }

        } catch (Exception e) {
            e.getMessage();
        }
    }

}
