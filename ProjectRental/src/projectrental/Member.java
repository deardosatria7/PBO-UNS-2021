/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrental;

import java.util.Arrays;

/**
 *
 * @author ASUS-A456U
 */
public class Member {
    String idMember;
    String nama;
    String jenisMember;
    
    //constructor
    Member(String id, String nama, String jenisMember){
        this.idMember = id;
        this.nama = nama;
        this.jenisMember = jenisMember;
        
    }
    void print(){
        System.out.println("Id Member        : " + this.idMember);
        System.out.println("Nama Member      : " + this.nama);
        System.out.println("Jenis Member     : " + this.jenisMember);
    }
}