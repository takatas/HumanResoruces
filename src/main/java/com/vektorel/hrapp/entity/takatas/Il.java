/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.entity.takatas;

import com.vektorel.hrapp.entity.EBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "il")
@SequenceGenerator(allocationSize = 1, name = "default_id_generator", sequenceName = "seq_il")
public class Il extends EBase {

    private String kod;
    private String ad;
    
    public Il(){
        
    }

    public Il(Long id, String kod, String ad) {
        
        this.setId(id);
        this.kod = kod;
        this.ad = ad;
        
    }

    @Column(name = "kod")
    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Column(name = "ad")
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    
    

}
