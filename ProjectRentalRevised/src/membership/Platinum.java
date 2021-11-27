/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membership;

/**
 *
 * @author ASUS-A456U
 */
public class Platinum extends Member {
    private int diskon = 3;
    private int poin;
    private int totalSewa;
    private int cashback =  10000;
    private int bonusPulsa = 5000;
    
    
    public Platinum(dataMember member) {
        super.member = member;
        super.setBiayaSewa(40000);
        super.inputPinjam();
    }
    
    public void hitungBiaya() {
        this.poin = 10 * lamaSewa;
        this.totalSewa = getBiayaSewa() * this.lamaSewa;
        int diskon = this.totalSewa * this.diskon/100;
        this.totalSewa -= diskon;
    }
    
    public void output() {
        super.output();
        System.out.println("-------------------------------------");
        System.out.println("Total Sewa		: " + this.totalSewa);
        System.out.println("Jumlah Poin		: " + this.poin);
        System.out.println("Jumlah Cashback     : " + this.cashback);
        System.out.println("Bonus Pulsa         : " + this.bonusPulsa);
    }
}
