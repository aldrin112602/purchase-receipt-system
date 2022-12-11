import java.util.*;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class Main {
   
    public static void main(String[] args) {
      try {
        Scanner in = new Scanner(System.in);
          
      System.out.println("\tPURCHASE RECEIPT SYSTEM");                                    
      System.out.println("\t  INPUT DETAILS BELOW");
      System.out.println("***************************************");
   
        String cashier_name;
        int or;
        System.out.print("Enter Cashier Name: ");
        cashier_name = in.nextLine();
        System.out.print("Enter O.R No.: ");
        or = in.nextInt();
        
        
        System.out.println("***************************************");
        
        int n;
        System.out.print("Enter Number of Items: ");     
        String[] name = new String [in.nextInt()];
        System.out.println("***************************************");
        n = name.length;
        int[] price = new int[n];
        int[] quantity = new int[n];
        double[] prices = new double[n];
        double total = 0;
        
        for(int i = 0; i < n; i++) {
            in.nextLine();
            System.out.print("Enter Item Name: ");
            name[i] = in.nextLine();            
            System.out.print("Enter Item Price: ");
            price[i] = in.nextInt();            
            System.out.print("Enter Item quantity: ");
            quantity[i] = in.nextInt();           
            System.out.println("----------------------------------------");
        }
        
        for(int i = 0; i < n; i++) {
            prices[i] = price[i] * quantity[i];
           total += price[i] * quantity[i]; 
        }
        System.out.println("TOTAL PAYMENT:     Php " + total);
        System.out.println("***************************************");
        int payment;
        System.out.print("Enter Customer Payment: ");
        payment = in.nextInt();
        System.out.println("***************************************");
        
        System.out.println("\n\n\n\n");
        System.out.println("\t   Gaisano Grand Mall");
        System.out.println("      Mc Arthur Highway, Digos City");
        System.out.println("   Tel. #: 553-2847   Fax: 679652382");
        System.out.println("\t     RCB: 529873290");
        System.out.println("\n\n\t   PURCHASE RECEIPT");
        System.out.println("Cashier: " + cashier_name);
        System.out.println("Date: " + java.time.LocalDate.now() + "      O.R. No.: " + or);
        System.out.println("***************************************");
        System.out.println("Qty.       Item/s             Price/s");
        System.out.println("----------------------------------------");
        
        for(int i = 0; i < n; i++) {
            System.out.println(quantity[i] + "         " +  name[i] + "               " + prices[i]);
        }
        System.out.println("***************************************");
        System.out.println("SUB TOTAL                   Php " + total);
        double vat = 0.05 * total;
        System.out.println("VAT(5%)                     Php " + vat);
        System.out.println("\nTOTAL                       Php " + (total - vat));
        
        System.out.println("\nCASH                        Php " + payment);
        System.out.println("CHANGE                      Php " + (payment - (total - vat)));
        
        System.out.println("\n\tTHANK YOU FOR SHOPPING!");
        
        in.close();
         
        } catch(Exception e) {
            System.out.println("Sorry, Something went wrong!\n" + e);
        }
  }
    
}
