/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaleSystemProject;

/**
 *
 * @author acer
 */
public class User {
    private String nama,alamat,email,username,password;
    
    public User(String nama, String alamat, String email, String username,String password){
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public void setNama (String nama){
        this.nama = nama;
    }
    public void setAlamat (String alamat){
        this.alamat = alamat;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public void setUsername (String username){
        this.username = username;
    }
    
    public void setPassword (String password){
        this.password = password;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
}
