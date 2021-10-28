/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
import java.util.Scanner;
/**
 *
 * @author ASUS-A456U
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        while (true){
            System.out.println("- - -Program segitiga pythagoras- - -");
            System.out.println("");
            System.out.println("Daftar pilihan");
            System.out.println("1. Cek segitiga triple pythagoras");
            System.out.println("2. Hitung sisi miring segitiga siku-siku");
            System.out.println("3. Hitung sisi tegak segitiga siku-siku");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.print("Masukkan opsi :");
            int opsi = input.nextInt();
            if (opsi != 4){
                switch (opsi){
                    case 1:
                        System.out.println("");
                        System.out.print("Masukkan panjang dari sisi pertama: ");
                        double x = input.nextInt();
                        System.out.print("Masukkan panjang dari sisi kedua: ");
                        double y = input.nextInt();
                        System.out.print("Masukkan panjang dari sisi ketiga: ");
                        double z = input.nextInt();
                        Pythagoras a = new Pythagoras ();
                        a.cekTriple(x, y, z);
                        System.out.println("");
                        System.out.println("Press \"ENTER\" to continue...");
                        Scanner scanner = new Scanner(System.in);
                        scanner.nextLine();
                        break;
                    case 2:
                        System.out.println("");
                        System.out.print("Masukkan panjang dari sisi pertama: ");
                        double p = input.nextInt();
                        System.out.print("Masukkan panjang dari sisi kedua: ");
                        double q = input.nextInt();
                        Pythagoras b = new Pythagoras();
                        b.cekHipotenus(p, q);
                        System.out.println("");
                        System.out.println("Press \"ENTER\" to continue...");
                        Scanner scanner1 = new Scanner(System.in);
                        scanner1.nextLine();
                        break;
                    case 3:
                        System.out.println("");
                        System.out.print("Masukkan panjang dari sisi pertama: ");
                        double r = input.nextInt();
                        System.out.print("Masukkan panjang dari sisi miring: ");
                        double s = input.nextInt();
                        Pythagoras c = new Pythagoras();
                        c.cekSiku(r, s);
                        System.out.println("");
                        System.out.println("Press \"ENTER\" to continue...");
                        Scanner scanner2 = new Scanner(System.in);
                        scanner2.nextLine();
                        break;
                    default:
                }
            }
            else {
                System.exit(0);
            }
        }
    }
}
