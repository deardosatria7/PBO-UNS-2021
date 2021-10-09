/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author ASUS-A456U
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang a = new PersegiPanjang();
        System.out.println("Persegi panjang (10, 5): Luasnya "+ a.hitungLuas(10, 5)+", kelilingnya "+a.hitungKeliling(10, 5));
        System.out.println("Persegi panjang (3.6, 8): Luasnya "+ a.hitungLuas(3.6, 8)+", kelilingnya "+a.hitungKeliling(3.6, 8));
        System.out.println("Persegi panjang (6, 8.3): Luasnya "+ a.hitungLuas(6, 8.3)+", kelilingnya "+a.hitungKeliling(6, 8.3));
        System.out.println("Persegi panjang (5.6, 8.8): Luasnya "+ a.hitungLuas(5.6, 8.8)+", kelilingnya "+a.hitungKeliling(5.6, 8.8));
        
        Lingkaran b = new Lingkaran();
        System.out.println("");
        System.out.println("Lingkaran (5): Luasnya "+ b.hitungLuas(5)+" kelilingnya "+b.hitungKeliling(5));
        System.out.println("Lingkaran (7.4): Luasnya "+ b.hitungLuas(7.4)+" kelilingnya "+b.hitungKeliling(7.4));
        
        Persegi c = new Persegi();
        System.out.println("");
        System.out.println("Persegi (4.5): Luasnya "+c.hitungLuas(4.5)+" kelilingnya "+c.hitungKeliling(4.5));
        System.out.println("Persegi (7): Luasnya "+c.hitungLuas(7)+" kelilingnya "+c.hitungKeliling(7));
        
        Segitiga d = new Segitiga();
        System.out.println("");
        System.out.println("Segitiga (8, 10) luasnya adalah "+ d.hitungLuas(8, 10));
        System.out.println("Segitiga (8, 11.5) luasnya adalah "+ d.hitungLuas(8, 11.5));
        System.out.println("Segitiga (12.2, 9) luasnya adalah "+ d.hitungLuas(12.2, 9));
        System.out.println("Segitiga (13.9, 20.7) luasnya adalah "+ d.hitungLuas(13.9, 20.7));
        
    }
    
}
