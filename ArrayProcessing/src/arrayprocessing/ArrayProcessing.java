/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprocessing;
import java.util.Arrays;
/**
 *
 * @author ASUS-A456U
 */
public class ArrayProcessing {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cariMinMax a = new cariMinMax();
        a.input();
        System.out.println("Nilai terbesarnya adalah : "+ a.cariMax());
        System.out.println("Nilai terkecilnya adalah : "+ a.cariMin());
    }
}
