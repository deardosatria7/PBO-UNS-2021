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
public class Bola {
    int jari2;
    
    public void hitungVolumeBola(){
        double volume;
        volume = (float)1.25 * (float)(3.14) * jari2 * jari2 * jari2;
        System.out.println("Volume bola tersebut adalah: " + volume);
    }
    
    public void hitungLuasBola(){
        double luas;
        luas = 4 * (float)(3.14) * jari2 * jari2;
        System.out.println("Luas permukaan bola tersebut adalah: " + luas);
    }
}
