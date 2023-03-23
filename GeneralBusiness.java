//Enkh-Od Zol-Od
//Assignment7- parent class
//Nov 22nd, 2022

import java.util.*; //importing necessary libraries
import java.io.*;

public class GeneralBusiness {
   static Scanner readFile;
   
   //Declaring all the necessary variables
   String stateNames[] = new String[60];
   String theStateName, firstName, lastName;
   double saleTax[] = new double[60];
   double saleTaxAmount, subtotal, total;
   int numItems, stateNumber;
   Scanner keyboard = new Scanner(System.in);
   
   //Default object constructor
   GeneralBusiness() {
      theStateName = "";
      firstName = "";
      lastName = "";
      saleTaxAmount = 0;
      subtotal = 0;
      total = 0;
      numItems = 0;
      stateNumber = 0; 
   }
   
   //Creating selectSalesTax method
   public void selectSalesTax() throws IOException {
      //Reading a text file
      File inputFile = new File("stateTaxInfo.txt"); 
      Scanner readFile = new Scanner(inputFile);
      
      //A loop for storing the data from the txt file into arrays
      int i = 0;
      while(readFile.hasNext()) {
         stateNames[i] = readFile.next();
         readFile.nextDouble();
         i++;
      }  
      
      int k = 0;
      while(readFile.hasNextDouble()) {
         readFile.next();
         saleTax[k] = readFile.nextDouble();
         k++;
      }
      
      System.out.println("Choose the state that the business is in and enter it's number:");
      //A loop for outputting the state menu
      for(int n = 0; n < stateNames.length; n++) {
         System.out.println(n+1 + ". " + stateNames[n]);
      }
      //Storing the state name
      stateNumber = keyboard.nextInt();
      theStateName = stateNames[stateNumber - 1];
   }
   
   //A method for asking and storing the user's name
   public void getCustomerName() {
      System.out.println("Please enter your first name");
      firstName = keyboard.nextLine();
      System.out.println("Please enter your last name");
      lastName = keyboard.nextLine();
   }
   
   //A method that receives the subtotal and calculates the Tax Sales
   public void calcSalesTax(double subtotal) {
      saleTaxAmount = subtotal * saleTax[stateNumber - 1];
   }
   
   //A method for outputing subtotal, tax amount, total
   public void outputReceipt() {
      total = subtotal - saleTaxAmount;
      System.out.println("Subtotal     $" + subtotal + "\nSalesTax     $" + saleTaxAmount + "\nTotal     $" + total);
   }
   
   //A method for outputing a list of items
   public void outputMenu(int numItems) {
      for(int j = 0; j < numItems; j++) {
         System.out.println("Item " + j + 1);
      }
   }
}