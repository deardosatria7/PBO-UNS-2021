/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrental;
import java.util.ArrayList;
/**
 *
 * @author ASUS-A456U
 */
public class dataMember {
    // menyimpan data data member
    ArrayList<Member> dataMember = new ArrayList<Member>();
    
    // tambah data member baru
    void tambahMember(Member data){
        this.dataMember.add(data);
    }
    
    // mencari member dalam array berdasarkan id
    void cariMember (String id){
        // status awal pencarian
        boolean status = false;
        // nilai awal index
        int index=0;
        // proses pengecekan data dalam array
        for (int i=0; i < this.dataMember.size(); i++){
            if (this.dataMember.get(i).idMember == id){
                //jika data match, catat dan tampilkan datanya
                index = index + i;
                // ubah status menjadi true
                status = true;
            }
        }
        // jika data ditemukan, tampilkan data member tsb
        if (status == true){
            System.out.println("Data ditemukan");
            this.dataMember.get(index).print();
        }
        else {
            //jika tidak ditemukan tampilkan pesan
            System.out.println("Data tidak ditemukan");
        }
    }
    
    //menampilkan seluruh data member dalam array
    void tampilMember(){
        for (Member item: this.dataMember){
            System.out.println("-------------------------------");
            item.print();
        }
    }
}
