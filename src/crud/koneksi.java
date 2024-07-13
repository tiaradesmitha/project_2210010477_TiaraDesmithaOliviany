/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author User
 */
public class koneksi {
    private String databaseName="db_2210010477";
    private String username="root";
    private String password="";
    private String lokasi="jdbc:mysql://localhost/"+databaseName;
    public static Connection koneksiDB;
    
    public koneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB=DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
        } catch (ClassNotFoundException | SQLException e){
            System.err.println(e.toString());
        }
    }
    
    //PRODUCT
     public void simpanProduct(String paramid, String paramnama, int paramharga){
         try {
           String SQL ="INSERT INTO product (id,nama,harga)" + "VALUE(?,?,?)";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, paramid);
           perintah.setString(2, paramnama);
           perintah.setInt(3, paramharga);
           perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
           
         } catch (SQLException e){
             System.out.println(e.getMessage());
         }
     }
     
     public void ubahProduct(String paramid, String paramnama, int paramharga){
         try {
           String SQL ="UPDATE product SET nama =?, harga=? WHERE id=?";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, paramnama);
           perintah.setInt(2, paramharga);
           perintah.setString(3, paramid);
           perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
           
         } catch (SQLException e){
             System.out.println(e.getMessage());
         }
    
    }
     
    public void hapusProduct(String paramid){
             try {
                 String SQL ="DELETE FROM product WHERE id=?";
                 PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                 perintah.setString(1,paramid);
                 perintah.executeUpdate();
                 System.out.println("Data berhasil dihapus");
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
         }
    
    public void cariProduct(String paramid){
             try {
                 String SQL ="SELECT*FROM product WHERE id=?";
                 PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                 perintah.setString(1,paramid);
                 ResultSet data = perintah.executeQuery();
                 while(data.next()){
                     System.out.println("Id :"+data.getString("id"));
                     System.out.println("Nama Product :"+data.getString("nama"));
                     System.out.println("Harga :"+data.getInt("harga"));
                 }
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
    }
    
    public void dataProduct(){
         try {
             Statement stmt = koneksiDB.createStatement();
             ResultSet baris = stmt.executeQuery("SELECT*FROM product ORDER BY id ASC");
             while(baris.next()){
                 System.out.println(baris.getString("id")+"|"+
                         baris.getString("nama")+"|"+
                         baris.getInt("harga"));
                }
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
    }
    
    //CUSTOMER 
   public void simpanCustomer(String paramid, String paramnama, String paramusername, String parampassword, String paramtelp, String paramalamat){
         try {
           String SQL ="INSERT INTO customer (id,nama,username,password,telp,alamat)" + "VALUE(?,?,?,?,?,?)";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, paramid);
           perintah.setString(2, paramnama);
           perintah.setString(3, paramusername);
           perintah.setString(4, parampassword);
           perintah.setString(5, paramtelp);
           perintah.setString(6, paramalamat);
           perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
           
         } catch (SQLException e){
             System.out.println(e.getMessage());
         }
     }
   
   public void ubahCustomer(String paramid, String paramnama, String paramusername, String parampassword, String paramtelp, String paramalamat){
         try {
           String SQL ="UPDATE customer SET nama=?, username=?, password=?, telp=?, alamat=? WHERE id=?";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, paramnama);
           perintah.setString(2, paramusername);
           perintah.setString(3, parampassword);
           perintah.setString(4, paramtelp);
           perintah.setString(5, paramalamat);
           perintah.setString(6, paramid);
           perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
           
         } catch (SQLException e){
             System.out.println(e.getMessage());
         }
    
    }
   
   public void hapusCustomer(String paramid){
             try {
                 String SQL ="DELETE FROM customer WHERE id=?";
                 PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                 perintah.setString(1,paramid);
                 perintah.executeUpdate();
                 System.out.println("Data berhasil dihapus");
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
         }
     
   public void cariCustomer(String paramid){
             try {
                 String SQL ="SELECT*FROM customer WHERE id=?";
                 PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                 perintah.setString(1,paramid);
                 ResultSet data = perintah.executeQuery();
                 while(data.next()){
                     System.out.println("Id :"+data.getString("id"));
                     System.out.println("Nama Customer :"+data.getString("nama"));
                     System.out.println("Username :"+data.getString("username"));
                     System.out.println("Password :"+data.getString("password"));
                     System.out.println("Telp :"+data.getString("telp"));
                     System.out.println("Alamat :"+data.getString("alamat"));
                 }
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
    }
    
    public void dataCustomer(){
         try {
             Statement stmt = koneksiDB.createStatement();
             ResultSet baris = stmt.executeQuery("SELECT*FROM customer ORDER BY id ASC");
             while(baris.next()){
                 System.out.println(baris.getString("id")+"|"+
                         baris.getString("nama")+"|"+
                          baris.getString("username")+"|"+
                          baris.getString("password")+"|"+
                          baris.getString("telp")+"|"+
                         baris.getString("alamat"));
                }
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
    }
    
    //ORDER
    public void simpanPesanan(String paramid, String paramnama, String paramtelp, String paramalamat, String paramkode, String paramjumlah, String paramstatus, int paramtotal){
         try {
           String SQL ="INSERT INTO pesanan (id,nama,telp,alamat,kode,jumlah,status,total)" + "VALUES(?,?,?,?,?,?,?,?)";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, paramid);
           perintah.setString(2, paramnama);
           perintah.setString(3, paramtelp);
           perintah.setString(4, paramalamat);
           perintah.setString(5, paramkode);
           perintah.setString(6, paramjumlah);
           perintah.setString(7, paramstatus);
           perintah.setInt(8, paramtotal);
           perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
           
         } catch (SQLException e){
             System.out.println(e.getMessage());
         }
     }
    
    public void ubahPesanan(String paramid, String paramnama, String paramtelp, String paramalamat, String paramkode, String paramjumlah, String paramstatus, int paramtotal){
         try {
           String SQL ="UPDATE pesanan SET nama=?, telp=?, alamat=?, kode=?, jumlah=?, status=?, total=? WHERE id=?";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, paramnama);
           perintah.setString(2, paramtelp);
           perintah.setString(3, paramalamat);
           perintah.setString(4, paramkode);
           perintah.setString(5, paramjumlah);
           perintah.setString(6, paramstatus);
           perintah.setInt(7, paramtotal);
           perintah.setString(8, paramid);
           perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
           
         } catch (SQLException e){
             System.out.println(e.getMessage());
         }
    
    }
   
    public void hapusPesanan(String paramid){
             try {
                 String SQL ="DELETE FROM pesanan WHERE id=?";
                 PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                 perintah.setString(1,paramid);
                 perintah.executeUpdate();
                 System.out.println("Data berhasil dihapus");
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
         }
    
    public void cariPesanan(String paramid){
             try {
                 String SQL ="SELECT*FROM pesanan WHERE id=?";
                 PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                 perintah.setString(1,paramid);
                 ResultSet data = perintah.executeQuery();
                 while(data.next()){
                     System.out.println("Id :"+data.getString("id"));
                     System.out.println("Nama Customer :"+data.getString("nama"));
                     System.out.println("Telp :"+data.getString("telp"));
                     System.out.println("Alamat :"+data.getString("alamat"));
                     System.out.println("Kode :"+data.getString("kode"));
                     System.out.println("Jumlah :"+data.getString("jumlah"));
                     System.out.println("Status :"+data.getString("status"));
                     System.out.println("Total :"+data.getInt("total"));
                 }
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
    }
    
    public void dataPesanan(){
         try {
             Statement stmt = koneksiDB.createStatement();
             ResultSet baris = stmt.executeQuery("SELECT*FROM pesanan ORDER BY id ASC");
             while(baris.next()){
                 System.out.println(baris.getString("id")+"|"+
                         baris.getString("nama")+"|"+
                         baris.getString("telp")+"|"+
                         baris.getString("alamat")+"|"+
                         baris.getString("kode")+"|"+
                         baris.getString("jumlah")+"|"+
                         baris.getString("status")+"|"+
                         baris.getInt("total"));
                }
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
    }
    
    //TESTIMONI
    public void simpanTestimoni(String paramid, String paramnama, String parampesan){
         try {
           String SQL ="INSERT INTO testimoni (id,nama,pesan)" + "VALUE(?,?,?)";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, paramid);
           perintah.setString(2, paramnama);
           perintah.setString(3, parampesan);
           perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
           
         } catch (SQLException e){
             System.out.println(e.getMessage());
         }
     }
     
     public void ubahTestimoni(String paramid, String paramnama, String parampesan){
         try {
           String SQL ="UPDATE testimoni SET nama =?, pesan=? WHERE id=?";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, paramnama);
           perintah.setString(2, parampesan);
           perintah.setString(3, paramid);
           perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
           
         } catch (SQLException e){
             System.out.println(e.getMessage());
         }
    
    } 
    
    public void hapusTestimoni(String paramid){
             try {
                 String SQL ="DELETE FROM testimoni WHERE id=?";
                 PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                 perintah.setString(1,paramid);
                 perintah.executeUpdate();
                 System.out.println("Data berhasil dihapus");
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
         }
    
    public void cariTestimoni(String paramid){
             try {
                 String SQL ="SELECT*FROM testimoni WHERE id=?";
                 PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                 perintah.setString(1,paramid);
                 ResultSet data = perintah.executeQuery();
                 while(data.next()){
                     System.out.println("Id :"+data.getString("id"));
                     System.out.println("Nama Customer :"+data.getString("nama"));
                     System.out.println("Pesan :"+data.getInt("pesan"));
                 }
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
    }
    
    public void cariTestimoni(){
         try {
             Statement stmt = koneksiDB.createStatement();
             ResultSet baris = stmt.executeQuery("SELECT*FROM testimoni ORDER BY id ASC");
             while(baris.next()){
                 System.out.println(baris.getString("id")+"|"+
                         baris.getString("nama")+"|"+
                         baris.getInt("pesan"));
                }
             } catch (SQLException e){
                 System.err.println(e.getMessage());
             }
    }
  
     }

   


    