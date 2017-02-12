/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.entity.deniz;

import com.vektorel.hrapp.entity.Adres;
import com.vektorel.hrapp.entity.EBase;
import com.vektorel.hrapp.entity.ayse.Kisi;
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
@Table(name = "gnl_bolum")
@SequenceGenerator(allocationSize = 1, name = "default_id_generator", sequenceName = "seq_bolum")
public class Bolum extends EBase {

    String kod;
    String tanim;
    Kisi bolumBsk;
    Adres adres;

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getTanim() {
        return tanim;
    }

    public void setTanim(String tanim) {
        this.tanim = tanim;
    }

    @JoinColumn(name = "kisi_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    public Kisi getBolumBsk() {
        return bolumBsk;
    }

    public void setBolumBsk(Kisi bolumBsk) {
        this.bolumBsk = bolumBsk;
    }

    @Embedded
    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

}
