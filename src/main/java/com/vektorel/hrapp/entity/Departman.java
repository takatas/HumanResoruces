/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.entity;

import com.vektorel.hrapp.entity.Adres;
import com.vektorel.hrapp.entity.EBase;
import com.vektorel.hrapp.entity.Kisi;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "gnl_departman")
@SequenceGenerator(allocationSize = 1, name = "default_id_generator", sequenceName = "seq_departman")
public class Departman extends EBase {

    String kod;
    Adres adres;
    Kisi yonetici;
    String tanim;

    public Departman() {
    }

    public Departman(Long id, String kod, String tanim, Adres adres) {
        this.setId(id);
        this.kod = kod;
        this.tanim = tanim;
        this.adres = adres;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Embedded
    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @JoinColumn(name = "yonetici_id")
    @ManyToOne(fetch = FetchType.LAZY)
    public Kisi getYonetici() {
        return yonetici;
    }

    public void setYonetici(Kisi yonetici) {
        this.yonetici = yonetici;
    }

    public String getTanim() {
        return tanim;
    }

    public void setTanim(String tanim) {
        this.tanim = tanim;
    }

}
