/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprocessing;

/**
 *
 * @author ASUS-A456U
 */

public class urutkan {
    static void urutkan(int[] data){
        int [] baru = new int[100];
        int n = data.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                        if(data[j-1] > data[j]){  
                            //swap elements  
                            temp = data[j-1];  
                            data[j-1] = data[j];  
                            data[j] = temp;
                        }  
                    }  
            }
    }
}
