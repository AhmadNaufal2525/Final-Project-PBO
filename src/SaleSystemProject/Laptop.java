package SaleSystemProject;

public class Laptop extends Computer {
    public String weight;

    public Laptop(String computer_id, String processor_speed, String ram, String hard_disk,String weight,int quantity, int price, byte[] image) {
      this.computer_id = computer_id;
      this.processor_speed = processor_speed;
      this.ram = ram;
      this.hard_disk = hard_disk;
      this.weight = weight;
      this.quantity = quantity;
      this.price = price;
      this.picture = image;
    }
  
    public void setComputerID(String computer_id){
        this.computer_id = computer_id;
    }
    
    public void setProcessor(String processor_speed){
        this.processor_speed = processor_speed;
    }
    
    public void setRam(String ram){
        this.ram = ram;
    }
    
    public void setHardDisk(String hard_disk){
        this.hard_disk = hard_disk;
    }
    
    public void setWeight(String weight){
        this.weight = weight;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
     
    public void setPrice(int price){
        this.price = price;
    }
    
     
    public String getComputerID(){
        return this.computer_id;
    }
    
    public String getProcessor(){
        return this.processor_speed;
    }
    
    public String getRam(){
        return this.ram;
    }
    
    public String getHardDisk(){
        return this.hard_disk;
    }
    public String getWeight(){
        return this.weight;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public int getPrice(){
        return this.price;
    }
    public byte[] getImage(){
        return this.picture;
    }
}
