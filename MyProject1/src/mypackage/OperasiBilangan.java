/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author ASUS-A456U
 */
public class OperasiBilangan {
    // atribut
    public int bilPertama;
    public int bilKedua;
    
    //method
    public void hitungPenjumlahan(){
        int hasil = bilPertama + bilKedua;
        System.out.println("Hasil penjumlahannya: " + hasil); 
    }
    public void hitungPengurangan (){
        int hasil = bilPertama - bilKedua;
        System.out.println("Hasil pengurangannya: " + hasil);
    }
    public void hitungPerkalian (){
        int hasil = bilPertama * bilKedua;
        System.out.println("Hasil perkaliannya: " + hasil);
    }
    public void hitungPembagian (){
        double hasil;
        hasil = (double) bilPertama / (double) bilKedua;
        System.out.println("Hasil pembagiannya: " + hasil);
    }   
}