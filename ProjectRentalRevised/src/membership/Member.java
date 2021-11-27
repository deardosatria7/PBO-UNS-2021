/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membership;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author ASUS-A456U
 */


public class Member {
    public dataMember member;
    private int biayaSewa; 
    protected LocalDate tglPinjam;
    protected LocalDate tglKembali;
    protected int lamaSewa;
    ArrayList<dataMember> dataMember = new ArrayList<dataMember>();
    
    void setBiayaSewa(int x){
        if (x<0){
            this.biayaSewa = 0;
            System.out.println("Masukkan biaya sewa yang benar!");
        }
        else {
            this.biayaSewa = x;
        }
    }
    
    int getBiayaSewa(){
        return this.biayaSewa;
    }
    
    public void tambahMember(dataMember data) {
        this.dataMember.add(data);
    }
    
    void cariMember(String ID){
        boolean status = false;
        int index = -1;
        for(int i=0; i<this.dataMember.size(); i++){
            if (this.dataMember.get(i).ID.equals(ID)){
                index = i;
                status = true;
            }
        }
         
        if (status == true){
            this.member = this.dataMember.get(index);
        } else {
            System.out.println("Data member tidak ditemukan");
            System.exit(0);
            
        }
    }
    
    public dataMember inputMember() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member                  : ");
        this.cariMember(input.nextLine());
        
        return this.member;
    }
    
    void inputPinjam() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Pinjam (1-31)      : ");
        int tglPinjam = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam   (1-12)      : ");
        int blnPinjam = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam               : ");
        int thnPinjam = input.nextInt();
        this.tglPinjam = LocalDate.of(thnPinjam, blnPinjam, tglPinjam);
        
        System.out.print("Masukkan Tanggal Kembali (1-31)     : ");
        int tglKembali = input.nextInt();
        System.out.print("Masukkan Bulan Kembali   (1-12)     : ");
        int blnKembali = input.nextInt();
        System.out.print("Masukkan Tahun Kembali              : ");
        int thnKembali = input.nextInt();
        this.tglKembali = LocalDate.of(thnKembali, blnKembali, tglKembali);
        
        this.lamaSewa = (int) ChronoUnit.DAYS.between(this.tglPinjam, this.tglKembali);
        System.out.println();
        if(this.lamaSewa < 0) {
            System.out.println("Tanggal Pinjam Salah!");
            System.exit(0);
        }
    }
    
    protected void output() {
        this.member.print();
        System.out.println("-------------------------------------");
        System.out.println("Tanggal Pinjam      : " + this.tglPinjam);
        System.out.println("Tanggal Kembali     : " + this.tglKembali);
        System.out.println("Lama Sewa           : " + this.lamaSewa + " hari");
        System.out.println();
    }    
}

