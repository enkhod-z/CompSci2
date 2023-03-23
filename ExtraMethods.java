//Enkh-Od Zol-Od
//Assignment7- subclass
//Nov 22nd, 2022

import java.util.*; //importing necessary libraries

//extending the GeneralBusiness class
public class ExtraMethods extends GeneralBusiness {
   //Declaring variables
   String companyName;
   Scanner keyboard = new Scanner(System.in);
   
   //A method for askign and storing the company name
   public void getCompanyName() {
      System.out.println("Please enter the name of your company");
      companyName = keyboard.nextLine();
   }
   
   //A method for a more detailed menu
   public void outputReceipt() {
      System.out.println("(" + companyName + ")");
      System.out.println(lastName + ", " + firstName);
      System.out.println("******************");
      System.out.println("Subtotal     $" + subtotal + "\nSales Tax     $" + saleTaxAmount + "\nTotal      $" + total + "\nTHANK YOU!");
   }
   
   //A method that receives the actual item names
   public void outputMenu(String itemNames[]) {
   }
}