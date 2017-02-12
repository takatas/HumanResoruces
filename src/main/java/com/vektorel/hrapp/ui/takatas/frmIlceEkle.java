/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.ui.takatas;

import com.vektorel.hrapp.service.takatas.IlService;
import com.vektorel.hrapp.service.takatas.IlceService;
import com.vektorel.hrapp.entity.takatas.Il;
import com.vektorel.hrapp.entity.takatas.Ilce;
import java.util.List;

/**
 *
 * @author vektorel
 */
public class frmIlceEkle extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public frmIlceEkle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        ilComboDoldur();
    }
    
        frmIlceEkle(java.awt.Frame parent, boolean modal, Ilce ilce) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        ilComboDoldur();
        
        
        lblIlceId.setText(ilce.getId().toString());
        txtIlceAd.setText(ilce.getAd());
        txtIlceKod.setText(ilce.getKod());
        lblIlceId.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIlceKod = new javax.swing.JLabel();
        txtIlceKod = new javax.swing.JTextField();
        lblIlceAd = new javax.swing.JLabel();
        txtIlceAd = new javax.swing.JTextField();
        btnIlceKaydet = new javax.swing.JButton();
        btnIlceIptal = new javax.swing.JButton();
        lblIlceId = new javax.swing.JLabel();
        cmbIl = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblIlceKod.setText("Kod");

        lblIlceAd.setText("Ad");

        btnIlceKaydet.setText("Kaydet");
        btnIlceKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIlceKaydetActionPerformed(evt);
            }
        });

        btnIlceIptal.setText("İptal");
        btnIlceIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIlceIptalActionPerformed(evt);
            }
        });

        jLabel1.setText("İl");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIlceKod)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIlceAd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbIl, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIlceId, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(txtIlceAd)
                    .addComponent(txtIlceKod)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIlceIptal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnIlceKaydet)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblIlceId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIlceKod)
                    .addComponent(txtIlceKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIlceAd)
                    .addComponent(txtIlceAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbIl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIlceKaydet)
                    .addComponent(btnIlceIptal))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIlceKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIlceKaydetActionPerformed
        
        
        try {
            IlceService ilceService = new IlceService();
            IlService ilService = new IlService();
            Il il = ilService.getByIlAdi(cmbIl.getSelectedItem().toString());
            
            if (lblIlceId.getText().trim().equals("")) {
                ilceService.save(new Ilce(null, txtIlceKod.getText(), txtIlceAd.getText(), il));
            } else {
                ilceService.update(new Ilce(new Long(lblIlceId.getText()), txtIlceKod.getText(), txtIlceAd.getText(), il));
            }
            this.dispose();

        } catch (Exception e) {
            e.getMessage();
        }

    }//GEN-LAST:event_btnIlceKaydetActionPerformed

    private void btnIlceIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIlceIptalActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnIlceIptalActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIlceIptal;
    private javax.swing.JButton btnIlceKaydet;
    private javax.swing.JComboBox<String> cmbIl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIlceAd;
    private javax.swing.JLabel lblIlceId;
    private javax.swing.JLabel lblIlceKod;
    private javax.swing.JTextField txtIlceAd;
    private javax.swing.JTextField txtIlceKod;
    // End of variables declaration//GEN-END:variables

    private void ilComboDoldur() {

        IlService ilService = new IlService();
        List<Il> il = ilService.getAll(null);
        String[] data = new String[il.size()];
        for (int i = 0; i < il.size(); i++) {
            data[i] = il.get(i).getAd();
            cmbIl.addItem(il.get(i).getAd());

        }
    }
}
