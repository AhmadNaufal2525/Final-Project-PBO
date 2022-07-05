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
public class Admin {
   private String username,password;
    private int id;
    
    public Admin(int id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setUsername (String username){
        this.username = username;
    }
    
    public void setPassword (String password){
        this.password = password;
    }
    
    public int getId() {
        return id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    } 
}
