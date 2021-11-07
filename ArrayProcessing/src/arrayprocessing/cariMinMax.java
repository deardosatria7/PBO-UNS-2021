/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprocessing;
import java.util.Scanner;
/**
 *
 * @author ASUS-A456U
 */
public class cariMinMax {
    // buat array baru dengan panjang 100    
    int [] dataBil = new int [100];
    
    // declare jumlah data
    int n;
    
    // simpan nilai maksimum
    int max;
    
    // simpan nilai minimum
    int min;
    
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya bilangan : ");
        this.n = input.nextInt();
        for(int i=0; i < n; i ++){
            System.out.println("Masukkan bil-ke "+ (i+1)+" :");
            this.dataBil[i] = input.nextInt();
        } 
    }
    
    int cariMax(){
        this.max = this.dataBil[0];
        for (int j=0; j < this.n; j++){
            if (dataBil[j] >= max){
                max = dataBil[j];
            }
        }
        return max;
    }
    
    int cariMin(){
        this.min = this.dataBil[0];
        for (int k=0; k < this.n; k++){
            if (dataBil[k] <= min){
                min = dataBil[k];
            }
        }
        return min;
    }
}
