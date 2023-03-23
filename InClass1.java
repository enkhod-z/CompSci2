import java.util.Scanner;

public class InClass1 {
   public static void main(String[] args) {
      //Setting up variables
      Scanner keyboard = new Scanner(System.in);
      
      int choice, widgetNum;
      double price = 0, discount, subTotal, total;
      
      System.out.println("Widget 1 - $5.00 each");
      System.out.println("Widget 2 - $4.75 each");
      System.out.println("Widget 3 - $4.00 each");
      System.out.println("Widget 4 - $3.75 each");
      
      choice = keyboard.nextInt();
      
      switch(choice) {
         case 1 : price = 5.00;
                  break;
         case 2 : price = 4.75;
                  break;
         case 3 : price = 4.00;
                  break;
         case 4 : price = 3.75;
                  break;
      }
      
      System.out.println("Please enter the number of widgets ");
      widgetNum = keyboard.nextInt();
      
      subTotal = widgetNum * price;
      
      if(widgetNum < 12) {
         discount = subTotal * 0;
      }
      else if(widgetNum < 24) {
         discount = subTotal * 0.02;
      }
      else if(widgetNum < 36) {
         discount = subTotal * 0.04;
      }
      else {
         discount = subTotal * 0.05;
      }
      
      total = subTotal - discount;
      
      System.out.println("Your total cost is: $" + total);
   }
   
}