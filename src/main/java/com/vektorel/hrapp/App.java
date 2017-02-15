/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp;

import com.vektorel.hrapp.ui.frmLogin;

/**
 *
 * @author vektorel
 */
public class App {
    public static void main(String[] args) {
        
        System.out.println("Application is start...");
        frmLogin login=new frmLogin(null, true);
        login.setLocationRelativeTo(null);
        login.show();
    }
}
