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
public class Tabung {
    public int jari2;
    public int tinggi;
    
    public void hitungLuasPermukaanTabung(){
        double luas;
        luas = (float)(3.14)* 2 * jari2 * tinggi;
        System.out.println("Luas permukaan tabung adalah: "+ luas);
    }
    public void hitungVolumeTabung(){
        double volume;
        volume = (float)(3.14) * jari2 * jari2 * tinggi;
        System.out.println("Volume tabung adalah: "+ volume);
    }
}
