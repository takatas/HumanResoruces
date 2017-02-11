
package com.vektorel.hrapp.entity.emre;

import com.vektorel.hrapp.entity.EBase;
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
    
    private String ad;
    private String soyad;
    private String eposta;
    private String adres;
    private Long tcKimlikNo;
    private Date dogumTarihi;
    private Date isBasvuruTarihi;
    private Enum cinsiyet;
    private Fotograf fotograf;
    private Il il;
    private Ilce ilce;

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
    @Column(name = "is_basvuru_tarihi")
    public Date getIsBasvuruTarihi() {
        return isBasvuruTarihi;
    }

    public void setIsBasvuruTarihi(Date isBasvuruTarihi) {
        this.isBasvuruTarihi = isBasvuruTarihi;
    }
    
    @Column(name = "cinsiyet",length = 100)
    public Enum getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Enum cinsiyet) {
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
    
    
}
