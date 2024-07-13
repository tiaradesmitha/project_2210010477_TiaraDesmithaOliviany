/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternakan;

/**
 *
 * @author User
 */
public class product {
    String id, nama;
    int harga;
    
    public product (String id, String nama, int harga){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }
    
    public void inputId(String id){
        this.id = id;
    }
    
    public String ambilId(){
        return this.id;
    }
    
    public void inputNAMA(String nama){
        this.nama = nama;
    }
    
    public String ambilNAMA(){
        return this.nama;
    }
    
    public void inputHARGA(int harga){
        this.harga = harga;
    }
    
    public int ambilHARGA(){
        return this.harga;
    }
    
}
