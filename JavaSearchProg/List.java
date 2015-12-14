@@ -0,0 +1,20 @@
public class List extends Item{
  
  
  public List(String code, String name, String description, double price){
    super(code,name,description,price);
  }

  public void display(){
    //display details about the item
    System.out.println("Code: " + super.getCode());
    System.out.println("Name: " + super.getName());
    System.out.println("Description: " + super.getDescription());
    System.out.println("Price: " + super.getPrice());
  }

  public double subTotal(int itemQuantity){
    double subT = super.getPrice() * itemQuantity;
    return subT;
  }
}
\ No newline at end of file
