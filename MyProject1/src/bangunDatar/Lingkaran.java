/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

/**
 *
 * @author ASUS-A456U
 */
public class Lingkaran {
    public int jari2;
    
    public void hitungLuasLingkaran(){
        double hasil;
        hasil = 3.14 * (double) jari2 * (double) jari2;
        System.out.println("Luas lingkarannya adalah: "+ hasil);
    }
    public void hitungKelilingLingkaran(){
        double hasil;
        hasil = 3.14 * (double) jari2 * 2;
        System.out.println("Keliling lingkarannya adalah: "+ hasil);
    }
}
