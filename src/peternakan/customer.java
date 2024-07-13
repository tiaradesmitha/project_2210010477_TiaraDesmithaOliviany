/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternakan;

/**
 *
 * @author User
 */
public class customer {
    String id, nama, username, password, telp, alamat;
    
    public customer (String id, String nama, String username, String password, String telp, String alamat){
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.telp = telp;
        this.alamat = alamat;   
    }
    
    public void inputID(String id){
        this.id = id;
    }
    
    public String ambilID(){
        return this.id;
    }
    
    public void inputNAMA(String nama){
        this.nama = nama;
    }
    
    public String ambilNAMA(){
        return this.nama;
    }
    
    public void inputUSERNAME(String username){
        this.username = username;
    }
    
    public String ambilUSERNAME(){
        return this.username;
    }
    
    public void inputPASSWORD(String password){
        this.password = password;
    }
    
    public String ambilPASSWORD(){
        return this.password;
    }
    
    public void inputTELP(String telp){
        this.telp = telp;
    }
    
    public String ambilTELP(){
        return this.telp;
    }
    
    public void inputALAMAT(String alamat){
        this.alamat = alamat;
    }
    
    public String ambilALAMAT(){
        return this.alamat;
    }
    
}
