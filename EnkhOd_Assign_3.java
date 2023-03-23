//Enkh-Od Zol-Od
//Assignment 3
//Started: Sept 21st, 2022
//Finished: Sept 21st, 2022 (4 hours)
//Modified: Sept 23rd, 2022 (4 hours)

import java.util.Scanner;

public class EnkhOd_Assign_3 {
   public static void main(String[] args) {
   //Setting up variables
   Scanner keyboard = new Scanner(System.in);
   
   int option, paymnt_month = 0, year = 0, month = 0;
   double c_balance, min_paymnt, additional_paymnt, interest, interest_monthly = 0, f_charge = 0;
   String choice = "Yes";
   
   //Creating a loop that runs only when the user enters Yes for whether they want to try again
   while (choice.equals("Yes") || choice.equals("yes")) {
   //Displaying the menu for the user and asking for their choice
   System.out.println("Please choose one of the options below:");
   System.out.println("Enter 1 if you want to pay just the minimum payment\nEnter 2 if you want to pay at least twice the minimum payment\nEnter 3 if you want to pay at least the minimum + enter a dollar amount");
   option = keyboard.nextInt();
   //Asking the user for their current credit card balance
   System.out.println("Please enter your current balance amount.");
   c_balance = keyboard.nextDouble();
   
   //Getting the annual interest rate for their credit card
   System.out.println("What is the annual interest rate for the credit card?");
   interest = keyboard.nextDouble();
   
   //Converting the interest into decimals if the user entered the percentage as an integer
   if (interest < 1) {
      interest_monthly = interest / 12;
   }
   else if (interest >= 1) {
      interest_monthly = (interest / 100) / 12;
   }
   
   //Calculations for the first option
   if (option == 1) {
      //Running the loop until it won't round up to a penny
      while (c_balance >= 0.004) {
         min_paymnt = c_balance * 0.02;
         f_charge = f_charge + (interest_monthly * c_balance);
         c_balance = c_balance - min_paymnt + (interest_monthly * c_balance);
         paymnt_month++;
      }
      //Displaying the first two lines of the output which is different for the three options
      System.out.println("\n************************************************");
      System.out.println("\nIf you pay the minimum:");
   }
   
   //Calculations for the second option
   if (option == 2) {
      while (c_balance >= 0.004) {
         min_paymnt = c_balance * 0.02;
         f_charge = f_charge + (interest_monthly * c_balance);
         c_balance = c_balance - (min_paymnt * 2) + (interest_monthly * c_balance);
         paymnt_month++;
      }
      //Displaying the first two lines of the output
      System.out.println("\n************************************************");
      System.out.println("\nIf you pay at least twice the minimum payment:");
   }
   
   //Calculations for the third option
   if (option == 3) {
      //Asking the user for the additional amount they would pay on top of the minimal payment
      System.out.println("Enter the amount you want to pay additionally.");
      additional_paymnt = keyboard.nextDouble();
      while (c_balance >= 0.004) {
         min_paymnt = c_balance * 0.02;
         f_charge = f_charge + (interest_monthly * c_balance);
         c_balance = c_balance - (min_paymnt + additional_paymnt) + (interest_monthly * c_balance);
         paymnt_month++;
      }
      //Displaying the first two lines of the output
      System.out.println("\n************************************************");
      System.out.println("\nIf you pay the minimum + $" + additional_paymnt + ":");
   }
   
   //Calculation for the year and month
   if (paymnt_month % 12 == 0) {
      year = paymnt_month / 12;
      month = 0;
   }
   else if (paymnt_month < 12) {
      year = 0;
      month = paymnt_month;
   }
   else {
      month = paymnt_month % 12;
      year = (paymnt_month - month) / 12;
   }
   
   //Displaying the rest of the output with the years, months and total f_charge
   System.out.printf("Payoff time... %d years and %d months\n", year, month);
   System.out.printf("Total Finance Charges... $%.2f\n", f_charge);
   System.out.println("\n************************************************");
   
   //Asking the user if they would like to use the credit card minimal payment calculator again
   System.out.println("\nWould you like to try again? Enter Yes or No");
   choice = keyboard.next();
      //The while loop will stop if they choose
      if (choice.equals("No") || choice.equals("no")) {
         System.out.print("This is the end of the program. Have a nice day!");
      }
      else {
         System.out.println();
         f_charge = 0;
         min_paymnt = 0;
         paymnt_month = 0;
      }
   } 
   }  
}