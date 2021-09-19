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
public class persegiPanjang {
    public int panjang;
    public int lebar;
    
    public void hitungLuasPersegiPanjang(){
        float hasil;
        hasil = panjang * (float) lebar;
        System.out.println("Luas persegi panjangnya adalah: " + hasil);
    }
    public void hitungKelilingPersegiPanjang(){
        float hasil;
        hasil = 2 * (panjang + lebar);
        System.out.println("Kelilingnya persegi panjangnya adalah: " + hasil);
    }
}
