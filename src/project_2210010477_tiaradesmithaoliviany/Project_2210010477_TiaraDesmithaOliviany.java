/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_2210010477_tiaradesmithaoliviany;
import peternakan.*;
import crud.koneksi;
import gui.frameUtama;

/**
 *
 * @author User
 */
public class Project_2210010477_TiaraDesmithaOliviany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        koneksi db = new koneksi();
        //db.simpanProduct("4", "Susu sapi segar 3 Liter", 200000);
        //db.ubahProduct("4", "Susu sapi segar 3 Liter", 400000);
        //db.hapusProduct("4");
        //db.cariProduct("4");
        //db.dataProduct();
        
        //db.simpanCustomer("4","Tania Farisya","tania_f","taniacantik","083166351232","Jl. Mangga");
        //db.ubahCustomer("4", "Tania Farisya","tania_f","taniacantik","083166351232","Jl. Jeruk");
        //db.hapusCustomer("4");
        //db.cariCustomer("4");
        //db.dataCustomer();
        
        new frameUtama().setVisible(true);
    }
    
}
