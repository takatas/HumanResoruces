/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.entity;

import com.vektorel.hrapp.entity.EBase;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "gnl_kisi")
@SequenceGenerator(allocationSize = 1, name = "default_id_generator", sequenceName = "seq_kisi")
public class Kisi extends EBase {

    private String ad;
    private String soyad;
    private Date dogumTarihi;
    private Long tc;
    private String babaAdi;
    private String anaAdi;
    private Cinsiyet cinsiyet;
    private Il il;
    private Ilce ilce;
    private String acikAdres;
    private String tel;
    private String adSoyad;
    private int yas;

    public Kisi() {
    }

    public Kisi(Long id, String ad, String soyAd, Long tcNo, String anneAd, String babaAd, String adres, String telefon, Date dogumTarih, Cinsiyet cinsiyet, Il il, Ilce ilce) {

        this.setId(id);
        this.ad = ad;
        this.soyad = soyAd;
        this.tc = tcNo;
        this.anaAdi = anneAd;
        this.babaAdi = babaAd;
        this.acikAdres = adres;
        this.tel = telefon;
        this.dogumTarihi = dogumTarih;
        this.cinsiyet = cinsiyet;
        this.il = il;
        this.ilce = ilce;

    }

    @Column(name = "ad")
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Column(name = "soyad")
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dogumtarihi")
    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Column(name = "tc")
    public Long getTc() {
        return tc;
    }

    public void setTc(Long tc) {
        this.tc = tc;
    }

    @Column(name = "babaadi")
    public String getBabaAdi() {
        return babaAdi;
    }

    public void setBabaAdi(String babaAdi) {
        this.babaAdi = babaAdi;
    }

    @Column(name = "anaadi")
    public String getAnaAdi() {
        return anaAdi;
    }

    public void setAnaAdi(String anaAdi) {
        this.anaAdi = anaAdi;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "cinsiyet")
    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

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

    @Column(name = "acikadres")
    public String getAcikAdres() {
        return acikAdres;
    }

    public void setAcikAdres(String acikAdres) {
        this.acikAdres = acikAdres;
    }

    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Transient // db ye alan oluşturmaz. hesaplama yapar.
    public String getAdSoyad() {
        return this.ad + " " + this.soyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    @Transient
    public int getYas() {
        if (this.dogumTarihi != null) {
            return new Date().getYear() - this.dogumTarihi.getYear();
        }
        return -1;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Transient
    public String getIlIlce() {
        if (this.il != null) {
            String il = this.il.getAd();
            String ilce = this.ilce.getAd();

            return il + " - " + ilce;
        } else
            return "";
    }

    @Override
    public String toString() {
        return "Kisi{" + "id=" + getId() + "ad=" + ad + ", soyad=" + soyad + ", dogumTarihi=" + dogumTarihi + ", tc=" + tc + ", babaAdi=" + babaAdi + ", anaAdi=" + anaAdi + ", cinsiyet=" + cinsiyet + ", il=" + il + ", ilce=" + ilce + ", acikAdres=" + acikAdres + ", tel=" + tel + ", adSoyad=" + getAdSoyad() + ", yas=" + getYas() + '}';
    }

}
