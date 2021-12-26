/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pbo;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS-A456U
 */
public class UASPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> karyawan = new ArrayList<String>();
        Scanner input = new Scanner (System.in);
        operasi opsi = new operasi();
        boolean status = false;
        System.out.println("Belum ada data karyawan yang diinputkan!");
        while (status == false){
            System.out.println("Menu Utama: ");
            System.out.println("1. Tambah data");
            System.out.println("2. Hapus data");
            System.out.println("3. Cari data");
            System.out.println("4. Lihat data");
            System.out.println("5. Keluar");
            System.out.println("");
            System.out.print("Pilihan Anda : ");
            int pilihan = input.nextInt();
            System.out.print("");
            switch (pilihan) {
                case 1:
                    opsi.tambahData(karyawan);
                    break;
                case 2:
                    System.out.print("Masukkan kode karyawan yang ingin dihapus: ");
                    String kode = input.next();
                    opsi.hapusData(karyawan, kode);
                    break;
                case 3:
                    System.out.print("Masukkan kode karyawan yang ingin dicari: ");
                    String kode1 = input.next();
                    opsi.cariData(karyawan, kode1);
                    break;
                case 4:
                    opsi.tampilData(karyawan);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.exit(0);
            }
        }
    }
}

