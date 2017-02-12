/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.entity;

import com.vektorel.hrapp.entity.takatas.Il;
import com.vektorel.hrapp.entity.takatas.Ilce;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author vektorel
 */
@Embeddable
public class Adres implements Serializable{

    Il il;
    Ilce ilce;
    String tel;
    String acikAdres;
    String eposta;

    @JoinColumn(name = "il_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    public Il getIl() {
        return il;
    }

    public void setIl(Il il) {
        this.il = il;
    }

    @JoinColumn(name = "ilce_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    public Ilce getIlce() {
        return ilce;
    }

    public void setIlce(Ilce ilce) {
        this.ilce = ilce;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAcikAdres() {
        return acikAdres;
    }

    public void setAcikAdres(String acikAdres) {
        this.acikAdres = acikAdres;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

}
