@@ -0,0 +1,70 @@
public class ItemCollection{
  public static void main(String[] args){
    ListOfItems item = new ListOfItems();
    int act = 0;
    double total = 0;

    while((act >= 0 || act < 5) || act < 0){
      System.out.println("                             ");
      System.out.println("| RALPH'S DEPARTMENT STORE  |");
      System.out.println("|<<<<<<<<<<WELCOME>>>>>>>>>>|");
      System.out.println("|                           |");
      System.out.println("|SELECTOR             ACTION|");
      System.out.println("|[1]..............VIEW ITEMS|");
      System.out.println("|[2]..........PURCHASE ITEMS|");
      System.out.println("|[3]...............ADD ITEMS|");
      System.out.println("|[4]..............CASH ITEMS|");
      System.out.println("|[5]....................EXIT|");
      System.out.print  (" Your ACTION:: "              );  
      act = Input.readInt();  
    
    
    switch(act){
      case 1: 
        System.out.println("");
        item.displayAllItems();
        break; 
      case 2: 
        System.out.println("");
        System.out.println("Please enter the item code:: ");
        String code = Input.readString();
        System.out.println("And the quantity of items you want to purchase:: "); 
        int quantity = Input.readInt();
        System.out.println(item.getDetails(code) + " at " + quantity + " qty(s)");
        System.out.println("= PHP " + item.total(code, quantity));
        total += item.total(code, quantity);
        break;
      case 3: 
        System.out.println("");
        System.out.println("To add an item>>LIST CAPACITY NOW:: " + item.checkCapacity());
        System.out.println("Enter the desired code for the item:: ");
        code = Input.readString();
        System.out.println("Enter the name of that item:: ");
        String name = Input.readString();
        System.out.println("Then, enter a description for that item:: ");
        String description = Input.readString();
        System.out.println("Lastly, enter the price of that item:: ");
        double price = Input.readDouble();
        item.addItem(code, name, description, price);
        System.out.println("ITEM ADDED SUCCESSFULLY");
        break;
      case 4: 
        System.out.println("");
        System.out.println("Total purchased items:: PHP " + total);
        System.out.println("Ready to cash item(s)>>");
        System.out.println("Enter cash on hand:: ");
        double cash = Input.readDouble();
        double change = cash - total;
        System.out.println("Your change is:: PHP " + change);
        System.out.println("THANK YOU VERY MUCH FOR SHOPPING WITH US!");
        total = 0;
        break;
      case 5: 
        System.out.println("SYSTEM EXITED. MEMORY CLEARED.");
        System.exit(0); 
        break;
    }
   }      
                 
  }
}
\ No newline at end of file
