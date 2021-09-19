/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject1;

import mypackage.OperasiBilangan;
/**
 *
 * @author ASUS-A456U
 */
public class MyProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperasiBilangan op1 = new OperasiBilangan();
        op1.bilPertama = 100;
        op1.bilKedua = 150;
        op1.hitungPenjumlahan();
        op1.hitungPengurangan();
        op1.hitungPerkalian();
        op1.hitungPembagian();
    }
    
}
