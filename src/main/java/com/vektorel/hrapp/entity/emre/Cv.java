
package com.vektorel.hrapp.entity.emre;

import com.vektorel.hrapp.entity.EBase;
import com.vektorel.hrapp.entity.ayse.Cinsiyet;
import com.vektorel.hrapp.entity.deniz.Bolum;
import com.vektorel.hrapp.entity.deniz.Okul;
import com.vektorel.hrapp.entity.takatas.Il;
import com.vektorel.hrapp.entity.takatas.Ilce;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author eaytac
 */
@Entity
@Table(name = "gnl_cv")
@SequenceGenerator(allocationSize = 1,name = "default_id_generator",sequenceName = "seq_cv")
public class Cv extends EBase {
    
    private String cvTanimi;
    private String ad;           //Bu alan için kişi classı kullanılabilir
    private String soyad;        //Bu alan için kişi classı kullanılabilir
    private String eposta;
    private String adres;        //Bu alan için kişi classı kullanılabilir
    private Long tcKimlikNo;     //Bu alan için kişi classı kullanılabilir
    private Date dogumTarihi;    //Bu alan için kişi classı kullanılabilir
    private Date cvEklenmeTarihi;
    private Cinsiyet cinsiyet;   //Bu alan için kişi classı kullanılabilir
    private Fotograf fotograf;
    private Il il;
    private Ilce ilce;
    private Okul okul;
    private Bolum bolum;

    @Column(name = "cv_tanimi", length=200)
    public String getCvTanimi() {
        return cvTanimi;
    }

    public void setCvTanimi(String cvTanimi) {
        this.cvTanimi = cvTanimi;
    }

    @Column(name = "ad",length = 100)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Column(name = "soyad",length = 100)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Column(name = "eposta",length = 100)
    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    @Column(name = "adres",length = 200)
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Column(name = "tc_kimlik_no",length = 100)
    public Long getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(Long tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dogum_tarihi")
    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "cv_eklenme_tarihi")
    public Date getCvEklenmeTarihi() {
        return cvEklenmeTarihi;
    }

    public void setCvEklenmeTarihi(Date cvEklenmeTarihi) {
        this.cvEklenmeTarihi = cvEklenmeTarihi;
    }

    @Column(name = "cinsiyet")
    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @JoinColumn(name = "fotograf_id")
    @OneToOne(cascade = CascadeType.ALL)
    public Fotograf getFotograf() {
        return fotograf;
    }

    public void setFotograf(Fotograf fotograf) {
        this.fotograf = fotograf;
    }

    @JoinColumn(name = "il_id")
    @ManyToOne (fetch = FetchType.LAZY)
    public Il getIl() {
        return il;
    }

    public void setIl(Il il) {
        this.il = il;
    }

    @JoinColumn(name = "ilce_id")
    @ManyToOne (fetch = FetchType.LAZY)
    public Ilce getIlce() {
        return ilce;
    }

    public void setIlce(Ilce ilce) {
        this.ilce = ilce;
    }

    @JoinColumn(name = "okul_id")
    @ManyToOne (fetch = FetchType.LAZY)
    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }

    @JoinColumn(name = "bolum_id")
    @ManyToOne (fetch = FetchType.LAZY)
    public Bolum getBolum() {
        return bolum;
    }

    public void setBolum(Bolum bolum) {
        this.bolum = bolum;
    }
    
    
}
