/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrental;
import java.util.Scanner;
/**
 *
 * @author ASUS-A456U
 */
public class ProjectRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //tambah member terlebih dahulu
        dataMember a = new dataMember();
        a.tambahMember(new Member("M001", "Mr. X", "Silver"));
        a.tambahMember(new Member("M002", "Mr. Y", "Gold"));
        a.tambahMember(new Member("M003", "Mr. Z", "Platinum"));
        
        //program input
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan id member                     : ");
        String str = input.nextLine();
        System.out.print("Masukkan tanggal peminjaman (1-31)     : ");
        int tgl_pinjam = input.nextInt();
        System.out.print("Masukkan bulan peminjaman (1-12)       : ");
        int bln_pinjam = input.nextInt();
        System.out.print("Masukkan tahun peminjaman              : ");
        int thn_pinjam = input.nextInt();
        System.out.print("Masukkan tanggal pengembalian (1-31)   : ");
        int tgl_kembali = input.nextInt();
        System.out.print("Masukkan bulan pengembalian (1-12)     : ");
        int bln_kembali = input.nextInt();
        System.out.print("Masukkan tahun pengembalian            : ");
        int thn_kembali = input.nextInt();
        
        //program output
        dataMember b = new dataMember();
        b.cariMember(str);
        
    }
}
