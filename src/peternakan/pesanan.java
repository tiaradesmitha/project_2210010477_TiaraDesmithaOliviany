/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternakan;

/**
 *
 * @author User
 */
public class pesanan {
    String id, nama, telp, alamat, kode, jumlah, status;
    int total;
    
    public pesanan (String id, String nama, String telp, String alamat, String kode, String jumlah, String status, int total){
        this.id = id;
        this.nama = nama;
        this.telp = telp;
        this.alamat = alamat;
        this.kode = kode;
        this.jumlah = jumlah;
        this.status = status;
        this.total = total;
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
    
    public void inputALAMAT(String alamat){
        this.alamat = alamat;
    }
    
    public String ambilALAMAT(){
        return this.alamat;
    }
    
    public void inputKODE(String kode){
        this.kode = kode;
    }
    
    public String ambilKODE(){
        return this.kode;
    }
    
    public void inputJUMLAH(String jumlah){
        this.jumlah = jumlah;
    }
    
    public String ambilJUMLAH(){
        return this.jumlah;
    }
    
    public void inputSTATUS(String status){
        this.status = status;
    }
    
    public String ambilSTATUS(){
        return this.status;
    }
    
    public void inputTOTAL(int total){
        this.total = total;
    }
    
    public int ambilTOTAL(){
        return this.total;
    }
    
}
