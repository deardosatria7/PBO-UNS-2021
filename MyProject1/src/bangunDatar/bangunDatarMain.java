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
public class bangunDatarMain {
    public static void main(String[] args) {
        Persegi op1 = new Persegi();
        op1.sisi = 10;
        op1.hitungLuasPersegi();
        op1.hitungKelilingPersegi();
        System.out.println("");
        
        Persegi op2 = new Persegi();
        op2.sisi = 15;
        op2.hitungLuasPersegi();
        op2.hitungKelilingPersegi();
        System.out.println("");
        
        Lingkaran op3 = new Lingkaran();
        op3.jari2 = 25;
        op3.hitungLuasLingkaran();
        op3.hitungKelilingLingkaran();
        System.out.println("");
        
        Lingkaran op4 = new Lingkaran();
        op4.jari2 = 37;
        op4.hitungLuasLingkaran();
        op4.hitungKelilingLingkaran();
    }
}
