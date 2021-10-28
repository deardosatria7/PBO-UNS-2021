/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ASUS-A456U
 */
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y=102;
        
        Random rand = new Random();
        x = rand.nextInt(100) + 1;
        System.out.println("Halo!! Nama saya Mr. Java dan saya telah memilih sebuah bilangan bulat dengan rentang 1 s/d 100");
        System.out.println("Coba tebak angka berapa");
        while (y != x){
            System.out.println("");
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan bilangan tebakan Anda: ");
            y = input.nextInt();
            if (y > x){
                System.out.println("");
                System.out.println("Ups! Tebakan anda salah... Terlalu besar xixixi");
            }
            else if (y < x){
                System.out.println("");
                System.out.println("Ups! Tebakan anda salah... Terlalu kecil xixixi");
            }
        }
        if (x == y){
            System.out.println("");
            System.out.println("Selamat!! Tebakan anda benar!");
        }
    }
    
}
