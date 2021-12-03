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
public class Suv extends mobil {
    private double suv = 12;
    private double solo_banten = 662;
    private double solo_bandung = 534;
    private double mobilC = 57;
    private double mobilD = 62;
        
    public void output(){
        //hitung waktu, dan bahan bakar minimal
        double bbm_minimal_banten = this.solo_banten / this.suv;
        double bbm_minimal_banten_fix = Math.round(bbm_minimal_banten * 100.0)/100.0;
        
        double bbm_minimal_bandung = this.solo_bandung / this.suv;
        Math.ceil(bbm_minimal_bandung);
        
        //waktu
        double waktu_c = this.solo_banten / this.mobilC;
        double waktu_d = this.solo_bandung / this.mobilD;
        double waktu_fix_c = Math.round(waktu_c * 100.0)/100.0;
        double waktu_fix_d = Math.round(waktu_d * 100.0)/100.0;
        
        //tampilan 
        System.out.println("Mobil C   |   SUV   |   Avg: "+mobilC+" km/h  |   Solo-Banten: "+solo_banten+" km     |  min.Fuel: "+bbm_minimal_banten_fix+ "L  |  Time : "+waktu_fix_c+" Hours ");
        System.out.println("Mobil D   |   SUV   |   Avg: "+mobilD+" km/h  |   Solo-Bandung: "+solo_bandung+" km    |  min.Fuel: "+bbm_minimal_bandung+ "L   |  Time : "+waktu_fix_d+" Hours ");
    }
}
