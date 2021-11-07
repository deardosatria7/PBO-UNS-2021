/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.Scanner;
/**
 *
 * @author ASUS-A456U
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        Operasi a = new Operasi ();
        while(i != 5){
            System.out.println("Menu data array list ");
            System.out.println("1. Tambah data");
            System.out.println("2. Cari data");
            System.out.println("3. Hapus data");
            System.out.println("4. Tampilkan semua data");
            System.out.println("5. Keluar");
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.print("Pilihan Anda : ");
            i = input.nextInt();
            if (i == 1){
                a.tambahData();
                input.nextLine();
            }
            else if (i == 2){
                a.cariData();
                input.nextLine();
            }
            else if (i == 3){
                a.hapusData();
                input.nextLine();
            }
            else if (i == 4){
                a.tampilData();
            }
        }
    }
    
}
