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
public class bangunRuangMain {
    public static void main(String[] args) {
        Bola op1 = new Bola();
        op1.jari2 = 15;
        op1.hitungLuasBola();
        op1.hitungVolumeBola();
        
        Kerucut op2 = new Kerucut();
        op2.garisLukis = 10;
        op2.jari2 = 6;
        op2.tinggi = 8;
        op2.hitungLuasPermukaanKerucut();
        op2.hitungVolumeKerucut();
        
        Tabung op3 = new Tabung();
        op3.jari2 = 16;
        op3.tinggi = 10;
        op3.hitungLuasPermukaanTabung();
        op3.hitungVolumeTabung();
    }
}
