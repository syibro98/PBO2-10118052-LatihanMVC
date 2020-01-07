/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.id.bagus.latihanmvc.controller;

import javax.swing.JOptionPane;
import my.id.bagus.latihanmvc.model.PelangganModel;
import my.id.bagus.latihanmvc.view.PelangganView;

/**
 *
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat aplikasi desktop dengan konsep MVC
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view) {
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if(nama.equals("") && email.equals("") && noTelp.equals("")) {
            
        } else {
            model.resetForm();
        }
        
    }
    
    public void simpanForm(PelangganView view) {
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if(nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama masih kosong");
        } else if(email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email masih kosong");
        } else if(noTelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telp masih kosong");
        } else {
            model.simpanForm();
        }
        
    }
    
}
