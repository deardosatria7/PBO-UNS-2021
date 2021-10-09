/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author ASUS-A456U
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi n = new Operasi();
        int x = n.jumlahkan(3, 4);
        int y = n.jumlahkan(4, 7, -9);
        double z = n.jumlahkan(3, -0.1, 4);
        double p = n.kalikan(2, 8);
        double q = n.kalikan(3.4, 2);
        double r = n.kalikan(12.2, 0.2, 4);
    }
    
}
