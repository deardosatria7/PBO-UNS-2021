/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmobil;

/**
 *
 * @author ASUS-A456U
 */
public class Mpv extends mobil {
    private double mpv = 14;
    private double solo_banyuwangi = 540;
    private double solo_jember = 433;
    private double mobilE = 64;
    private double mobilF = 53;
    
    public void output(){
        //hitung waktu, dan bahan bakar minimal
        double bbm_minimal_banyuwangi = this.solo_banyuwangi / this.mpv;
        double bbm_minimal_banyuwangi_fix = Math.round(bbm_minimal_banyuwangi * 100.0)/100.0;
        
        double bbm_minimal_jember = this.solo_jember / this.mpv;
        double bbm_minimal_jember_fix = Math.round(bbm_minimal_jember * 100.0)/100.0;
        
        //waktu
        double waktu_e = this.solo_banyuwangi / this.mobilE;
        double waktu_f = this.solo_jember / this.mobilF;
        double waktu_fix_e = Math.round(waktu_e * 100.0)/100.0;
        double waktu_fix_f = Math.round(waktu_f * 100.0)/100.0;
        
        //tampilan 
        System.out.println("Mobil E   |   MPV   |   Avg: "+mobilE+" km/h  |   Solo-Banyuwangi: "+solo_banyuwangi+" km     |  min.Fuel: "+bbm_minimal_banyuwangi_fix+ "L  |  Time : "+waktu_fix_e+" Hours ");
        System.out.println("Mobil F   |   MPV   |   Avg: "+mobilF+" km/h  |   Solo-Jember: "+solo_jember+" km         |  min.Fuel: "+bbm_minimal_jember_fix+ "L  |  Time : "+waktu_fix_f+" Hours ");
 
    }
}
