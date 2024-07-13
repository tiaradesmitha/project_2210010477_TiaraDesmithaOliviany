/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternakan;

/**
 *
 * @author User
 */
public class testimoni {
    String id, nama, pesan;
    
    public testimoni (String id, String nama, String pesan){
        this.id = id;
        this.nama = nama;
        this.pesan = pesan;
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
    
    public void inputPESAN(String pesan){
        this.pesan = pesan;
    }
    
    public String ambilPESAN(){
        return this.pesan;
    }
    
}
