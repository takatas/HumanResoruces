/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.entity;

import com.vektorel.hrapp.entity.Adres;
import com.vektorel.hrapp.entity.EBase;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "gnl_okul")
@SequenceGenerator(allocationSize = 1,name = "default_id_generator",sequenceName = "seq_okul")
public class Okul extends EBase{
    String kod;
    String adi;
    Adres adres;

    public Okul() {
    }
    
    public Okul(Long id, String kod, String ad, Adres adres) {
        this.setId(id);
        this.kod = kod;
        this.adi = ad;
        this.adres = adres;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Embedded
    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
    
}
