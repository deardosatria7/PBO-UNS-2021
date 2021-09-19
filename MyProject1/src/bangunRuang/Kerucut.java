/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;

/**
 *
 * @author ASUS-A456U
 */
public class Kerucut {
    public int jari2;
    public int tinggi;
    public int garisLukis;
    
    public void hitungVolumeKerucut(){
        double volume;
        volume = (float)0.33 *(float)(3.14)*jari2*jari2*tinggi;
        System.out.println("Volume kerucutnya adalah: "+ volume);
    }
    public void hitungLuasPermukaanKerucut(){
        double luas;
        luas = (float)(3.14)*jari2*(jari2 + garisLukis);
        System.out.println("Luas permukaan kerucut adalah: " + luas);
    }
}
