/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.entity;

/**
 *
 * @author vektorel
 */
public enum Cinsiyet {
    
    ERKEK("Erkek"),
    KADIN("Kadın"),
    DIGER("Diğer");
    
    String label;

    private Cinsiyet(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
 
    public static Cinsiyet getEnum(int i){
        switch(i){
            case 0 : return ERKEK;
            case 1 : return KADIN;
            case 2 : return DIGER;
        }
        return DIGER;
    }
}
