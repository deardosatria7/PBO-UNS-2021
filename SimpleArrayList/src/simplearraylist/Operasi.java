/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author ASUS-A456U
 */
public class Operasi {
    // buat ArrayList baru
    ArrayList<String> data = new ArrayList<String>();
    
    // method tambah
    void tambahData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan data yang ingin ditambah : ");
        data.add(input.next());
        System.out.println("Update data keseluruhan : "+ data);
        System.out.println("");
    }
    
    void cariData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan data yang ingin dicari : ");
        String cari = input.next();
        boolean ans = data.contains(cari);
        if (ans) {
            System.out.println("Ada data "+ cari+ " dalam array list pada index "+ data.indexOf(cari));
        }
        else {
            System.out.println("Tidak ada data "+ cari+ " dalam array");
        }
        System.out.println("");
    }
    
    void hapusData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan data yang ingin dihapus : ");
        String hapus = input.next();
        boolean ans = data.contains(hapus);
        if (ans) {
            data.remove(data.indexOf(hapus));
            System.out.println(hapus +" sudah dihapus dari array");
            System.out.println("Update data keseluruhan : "+ data);
        }
        else {
            System.out.println("Tidak ada "+ hapus+ " dalam data array");
        }
        System.out.println("");
    }
    
    void tampilData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar string yang ada dalam arraylist : "+ data);
        System.out.println("");
    }
}
    

