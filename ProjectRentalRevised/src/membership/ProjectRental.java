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
public class ProjectRental {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Member membership = new Member();
        
        membership.tambahMember(new dataMember("M001", "Mr. X", "Silver"));
        membership.tambahMember(new dataMember("M002", "Mr. Y", "Gold"));
        membership.tambahMember(new dataMember("M003", "Mr. Z", "Platinum"));
        
        dataMember member = membership.inputMember();
        switch(member.Jenis) {
            case "Silver":
                Silver silver = new Silver(member);
                silver.hitungBiaya();
                silver.output();
                break;
            case "Gold":
                Gold gold = new Gold(member);
                gold.hitungBiaya();
                gold.output();
                break;
            case "Platinum":
                Platinum platinum = new Platinum(member);
                platinum.hitungBiaya();
                platinum.output();
                break;
        }
    }
    
}
