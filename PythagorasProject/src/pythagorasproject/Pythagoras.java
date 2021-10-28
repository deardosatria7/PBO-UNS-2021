/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
/**
 *
 * @author ASUS-A456U
 */
public class Pythagoras {

    void cekTriple (double a, double b, double c){
        if (a>b && a>c){
            if (a*a == b*b + c*c){
                System.out.println("Ya, segitiga tersebut merupakan segitiga triple pythagoras");
            }
            else {
                System.out.println("Segitiga tersebut bukan segitiga triple pythagoras");
            }
        }
        else if (b>a && b>c){
            if (b*b == a*a + c*c){
                System.out.println("Ya, segitiga tersebut merupakan segitiga triple pythagoras");
            }
            else {
                System.out.println("Segitiga tersebut bukan segitiga triple pythagoras");
            }
        }
        else if (c>a && c>b){
            if (c*c == a*a + b*b){
                System.out.println("Ya, segitiga tersebut merupakan segitiga triple pythagoras");
            }
            else {
                System.out.println("Segitiga tersebut bukan segitiga triple pythagoras");
            }
        }
    }
    
    void cekHipotenus (double a, double b){
        double hypotenuse= Math.sqrt((a*a)+(b*b));
        System.out.println("Panjang sisi miring (hipotenusa) adalah : " + hypotenuse);
    }
    
    void cekSiku (double a, double b){
        if (a>b){
            double c = Math.sqrt((a*a)-(b*b));
            System.out.println("Panjang sisi sikunya adalah : " + c);
        }
        else if (b>a){
            double c = Math.sqrt((b*b)-(a*a));
            System.out.println("Panjang sisi sikunya adalah : " + c);
        }
        
    }
}