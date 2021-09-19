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
public class Persegi {
    public int sisi;
    
    public void hitungLuasPersegi(){
        float hasil;
        hasil = sisi * (float) sisi;
        System.out.println("Luas perseginya adalah: " + hasil);
    }
    public void hitungKelilingPersegi(){
        float hasil;
        hasil = (float) sisi * 4;
        System.out.println("Keliling perseginya adalah: " + hasil);
    }
}
