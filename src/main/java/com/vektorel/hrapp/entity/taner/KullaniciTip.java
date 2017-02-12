/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.entity.taner;

/**
 *
 * @author vektorel
 */
public enum KullaniciTip {
    ADMIN("Admin Kullanıcı"),
    IK_SORUMLUSU("İK Sorumlusu"),
    PERSONEL("Personel");
    
    String label;

    private KullaniciTip(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
 
    public static KullaniciTip getEnum(int i){
        switch(i){
            case 0 : return ADMIN;
            case 1 : return IK_SORUMLUSU;
            case 2 : return PERSONEL;
        }
        return ADMIN;
    }
}
