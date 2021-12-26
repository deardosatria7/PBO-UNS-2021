/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pbo;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS-A456U
 */
public class operasi {
    public void tambahData (ArrayList<String> array){
        Scanner input = new Scanner (System.in);
        System.out.print("");
        System.out.print("Masukkan kode karyawan \t\t: ");
        String kode = input.nextLine();
        System.out.print("");
        System.out.print("Masukkan nama karyawan \t\t: ");
        String nama = input.nextLine();
        System.out.print("");
        System.out.print("Masukkan alamat \t\t: ");
        String alamat = input.nextLine();
        System.out.print("");
        System.out.print("Masukkan usia \t\t\t: ");
        String usia = input.nextLine();
        System.out.print("");
        System.out.print("Masukkan golongan (a/b/c) \t: ");
        String gol = input.nextLine();
        gol = gol.toLowerCase();
        System.out.print("");
        System.out.print("Masukkan status menikah (y/n) \t: ");
        String status = input.nextLine();
        status = status.toLowerCase();
        System.out.print("");
        System.out.print("Masukkan jumlah anak \t\t: ");
        String jumlah_anak = input.nextLine();
        
        array.add(kode);
        array.add(nama);
        array.add(alamat);
        array.add(usia);
        array.add(gol);
        array.add(status);
        array.add(jumlah_anak);
        
    }
    
    public void hapusData (ArrayList<String> array, String kode){
        boolean status = false;
        int j = array.size();
        for(int i=0; i<j; i++){
            if (!array.get(i).equals(kode)){
                System.out.println("Data karyawan tidak ada");
            } else {
                array.remove(i);
                array.remove(i + 1);
                array.remove(i + 2);
                array.remove(i + 3);
                array.remove(i + 4);
                array.remove(i + 5);
                status = true;
            }
        }
    }
    
    public void cariData (ArrayList<String> array, String kode){
        boolean status = false;
        int j = array.size();
        for(int i=0; i<j; i++){
            if (array.get(i).equals(kode)){
                double gaji_kotor = 0;
                double gaji_bersih = 0;        
                double tunjangan_menikah = 0;
                double tunjangan_anak = 0;
                double tunjangan_pegawai = 0;
                System.out.println("=====================");
                System.out.println("DATA KARYAWAN");
                System.out.println("---------------------");
                System.out.println("KODE KARYAWAN \t: "+ array.get(i));
                System.out.println("NAMA KARYAWAN \t: "+ array.get(i+1));
                System.out.println("ALAMAT \t\t: "+ array.get(i+2));
                System.out.println("USIA \t\t: "+ array.get(i+3));
                System.out.println("GOLONGAN \t: "+ array.get(i+4));
                System.out.print("STATUS MENIKAH \t: ");
                if ("y".equals(array.get(i+5))){
                    System.out.println("MENIKAH");
                    System.out.print("");
                } else {
                    System.out.println("BELUM MENIKAH");
                    System.out.print("");
                }
                if (null == array.get(i+4)){
                    System.out.println("ERROR: Coba cek apakah golongan pada data sudah benar?");
                }
                else switch (array.get(i+4)) {
                    case "a":
                        System.out.println("GAJI \t\t: Rp5000000");
                        System.out.print("TUNJANGAN MENIKAH \t: ");
                        if ("y".equals(array.get(i+5))){
                            System.out.println("Rp500000");
                            tunjangan_menikah = 500000 ;
                        } else {
                            System.out.println("0");
                        }  System.out.print("TUNJANGAN PEGAWAI \t: ");
                        try {
                            int usia = Integer.parseInt(array.get(i+3));
                            if (usia > 30){
                                System.out.println("Rp750000");
                                tunjangan_pegawai = 750000;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("Error: Apakah umur pada data sudah benar?");
                        }  System.out.print("TUNJANGAN ANAK \t\t: ");
                        try {
                            int anak = Integer.parseInt(array.get(i+6));
                            if (anak >= 0){
                                System.out.println("Rp"+ (250000 * anak));
                                tunjangan_anak = 250000 * anak;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("Error: Apakah jml_anak pada data sudah benar?");
                        }  
                        
                        System.out.println("----------------------------------- +");
                        gaji_kotor = 5000000 + tunjangan_pegawai + tunjangan_menikah + tunjangan_anak ;
                        System.out.println("GAJI KOTOR \t: Rp"+ gaji_kotor);
                        System.out.println("POTONGAN \t: Rp" + (gaji_kotor * 0.025));
                        gaji_bersih = gaji_kotor - (gaji_kotor * 0.025);
                        System.out.println("----------------------------------- -");
                        System.out.println("GAJI BERSIH \t: "+ gaji_bersih);
                        status = true;
                        break;
                    case "b":
                        System.out.println("GAJI \t\t: Rp6000000");
                        System.out.print("TUNJANGAN MENIKAH \t: ");
                        if ("y".equals(array.get(i+5))){
                            System.out.println("Rp600000");
                            tunjangan_menikah = 600000 ;
                        } else {
                            System.out.println("0");
                        }  System.out.print("TUNJANGAN PEGAWAI \t: ");
                        try {
                            int usia = Integer.parseInt(array.get(i+3));
                            if (usia > 30){
                                System.out.println("Rp900000");
                                tunjangan_pegawai = 900000;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("Error: Apakah umur pada data sudah benar?");
                        }  System.out.print("TUNJANGAN ANAK \t\t: ");
                        try {
                            int anak = Integer.parseInt(array.get(i+6));
                            if (anak >= 0){
                                System.out.println("Rp"+ (300000 * anak));
                                tunjangan_anak = 300000 * anak;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("Error: Apakah jml_anak pada data sudah benar?");
                        }  
                        System.out.println("--------------------------------- +");
                        gaji_kotor = 6000000 + tunjangan_pegawai + tunjangan_menikah + tunjangan_anak ;
                        System.out.println("GAJI KOTOR \t: Rp"+ gaji_kotor);
                        System.out.println("POTONGAN \t: Rp" + (gaji_kotor * 0.025));
                        gaji_bersih = gaji_kotor - (gaji_kotor * 0.025);
                        System.out.println("--------------------------------- -");
                        System.out.println("GAJI BERSIH \t: "+ gaji_bersih);
                        status = true;
                        break;
                    case "c":
                        System.out.println("GAJI \t\t: Rp7000000");
                        System.out.print("TUNJANGAN MENIKAH \t: ");
                        if ("y".equals(array.get(i+5))){
                            System.out.println("Rp700000");
                            tunjangan_menikah = 700000 ;
                        } else {
                            System.out.println("0");
                        }  System.out.print("TUNJANGAN PEGAWAI \t: ");
                        try {
                            int usia = Integer.parseInt(array.get(i+3));
                            if (usia > 30){
                                System.out.println("Rp1050000");
                                tunjangan_pegawai = 1050000;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("Error: Apakah umur pada data sudah benar?");
                        }  System.out.print("TUNJANGAN ANAK \t\t: ");
                        try {
                            int anak = Integer.parseInt(array.get(i+6));
                            if (anak >= 0){
                                System.out.println("Rp"+ (350000 * anak));
                                tunjangan_anak = 350000 * anak;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("Error: Apakah jml_anak pada data sudah benar?");
                        }  
                        System.out.println("----------------------------------- +");
                        gaji_kotor = 7000000 + tunjangan_pegawai + tunjangan_menikah + tunjangan_anak ;
                        System.out.println("GAJI KOTOR \t: Rp"+ gaji_kotor);
                        System.out.println("POTONGAN \t: Rp" + (gaji_kotor * 0.025));
                        gaji_bersih = gaji_kotor - (gaji_kotor * 0.025);
                        System.out.println("----------------------------------- -");
                        System.out.println("GAJI BERSIH \t: "+ gaji_bersih);
                        status = true;
                        break;
                    default:
                        System.out.println("ERROR: Coba cek apakah golongan pada data sudah benar?");
                        break;
                }
            }
        }
    }
    
    public void tampilData(ArrayList<String> array) {
        boolean status = false;
        int batas = 6;
        int j = array.size();
        System.out.println("=========================");
        System.out.println("DATA KARYAWAN");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("KODE \t NAMA \t ALAMAT \t USIA \t GOL \t STATUS \t JUMLAH ANAK");
        System.out.println("------------------------------------------------------------------------------------");
        for(int i=0; i<j; i++){
            if (i % batas == 0){
                System.out.println(array.get(i)+ "\t");
            } else {
                System.out.print(array.get(i)+"\t");
            }
        }
    }
}
