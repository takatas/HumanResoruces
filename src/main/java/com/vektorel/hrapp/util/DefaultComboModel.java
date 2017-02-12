/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.util;

/**
 *
 * @author vektorel
 */
public class DefaultComboModel {

    private Long value;
    private String label;

    public DefaultComboModel(Long value, String label) {
        this.value = value;
        this.label = label;
    }

    public Long getValue() {
        return this.value;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        return label;
    }
}