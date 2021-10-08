/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author ASUS-A456U
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi a = new Persegi();
        a.sisi = 42;
        
        Lingkaran b = new Lingkaran();
        b.jari2 = 28;
        
        Lingkaran c = new Lingkaran();
        c.jari2 = 7;
        
        Lingkaran d = new Lingkaran();
        d.jari2 = 14;
        
        double luasAkhirSatu = a.hitungLuas() + ((double) b.hitungLuas()*2);
        System.out.println("Luas akhir dari soal nomor 1 adalah "+ luasAkhirSatu);
        
        double luasAkhirDua = ((double) d.hitungLuas() / 2) - c.hitungLuas();
        System.out.println("Luas akhir dari soal nomor 2 adalah "+ luasAkhirDua);
    }
    
}
