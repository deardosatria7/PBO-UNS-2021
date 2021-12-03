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
public final class Sedan extends mobil {
    //variables
    private double sedan = 10;
    private double solo_kudus = 159;
    private double solo_jakarta = 538;
    private double mobilA = 60;
    private double mobilB = 65;
       
    public void output(){
        //hitung waktu, dan bahan bakar minimal
        double bbm_minimal_kudus = this.solo_kudus / this.sedan;
        Math.ceil(bbm_minimal_kudus);
        
        double bbm_minimal_jakarta = this.solo_jakarta / this.sedan;
        Math.ceil(bbm_minimal_jakarta);
        
        //waktu
        double waktu_a = this.solo_kudus / this.mobilA;
        double waktu_b = this.solo_jakarta / this.mobilB;
        double waktu_fix_a = Math.round(waktu_a * 100.0)/100.0;
        double waktu_fix_b = Math.round(waktu_b * 100.0)/100.0;
        
        //tampilan 
        System.out.println("Mobil A   |   Sedan   |   Avg: "+mobilA+" km/h  |   Solo-Kudus: "+solo_kudus+" km     |  min.Fuel: "+bbm_minimal_kudus+ "L  |  Time : "+waktu_fix_a+" Hours ");
        System.out.println("Mobil B   |   Sedan   |   Avg: "+mobilB+" km/h  |   Solo-Jakarta: "+solo_jakarta+" km   |  min.Fuel: "+bbm_minimal_jakarta+ "L  |  Time : "+waktu_fix_b+" Hours ");
    }
    
    public void getOutput(){
        this.output();
    }
    
    
    
    
    
    
}
