@@ -0,0 +1,35 @@
public abstract class Item{
  private String itemCode;
  private String itemName;
  private String itemDescription;
  private double itemPrice;

  public Item(String code, String name, String description, double price){
    //the subclass of class Item should contain parameters
    itemCode = code;
    itemName = name;
    itemDescription = description;
    itemPrice = price;
  }
  
  public String getCode(){
    return itemCode;
  }

  public String getName(){
    return itemName;
  }

  public String getDescription(){
    return itemDescription;
  }

  public double getPrice(){
    return itemPrice;
  }

  //methods to be overriden
  public abstract void display();
  public abstract double subTotal(int itemQuantity);
  
}
\ No newline at end of file
