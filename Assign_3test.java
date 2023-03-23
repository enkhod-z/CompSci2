import java.util.Scanner;

public class Assign_3test{
   public static void main(String[] args) {
   //Setting up variables
   Scanner keyboard = new Scanner(System.in);
   
   int option, paymnt_month = 0, year = 0, month = 0;
   double c_balance, min_paymnt, additional_paymnt, interest, interest_monthly = 0, f_charge = 0;
   String choice = "Yes";
   
   while (choice.equals("Yes")) {
   System.out.println("Please choose one of the options below:");
   System.out.println("Enter 1 if you want to pay just the minimum payment\nEnter 2 if you want to pay at least twice the minimum payment\nEnter 3 if you want to pay at least the minimum + enter a dollar amount");
   option = keyboard.nextInt();
   System.out.println("Please enter your current balance amount.");
   c_balance = keyboard.nextDouble();
   
   System.out.println("What is the interest charged for the credit card?");
   interest = keyboard.nextDouble();
   
   if (interest <= 1 && interest >= 0) {
      interest_monthly = interest / 12;
   }
   else if (interest >= 1 && interest <= 100) {
      interest_monthly = (interest / 100) / 12;
   }
   
   if (option == 1) {
      while (c_balance >= 0.004) {
      paymnt_month++;
         min_paymnt = c_balance * 0.02;
         f_charge = f_charge + (interest_monthly * c_balance);
         c_balance = c_balance - min_paymnt + (interest_monthly * c_balance);
      }
      System.out.println("\n************************************************");
      System.out.println("\nIf you pay the minimum:");
   }
   
   if (option == 2) {
      while (c_balance >= 0.004) {
      paymnt_month++;
         min_paymnt = c_balance * 0.02;
         f_charge = f_charge + (interest_monthly * c_balance);
         c_balance = c_balance - (min_paymnt * 2) + (interest_monthly * c_balance);
      }
      System.out.println("\n************************************************");
      System.out.println("\nIf you pay at least twice the minimum payment:");
   }
   
   if (option == 3) {
      System.out.println("Enter the amount you want to pay additionally.");
      additional_paymnt = keyboard.nextDouble();
      while (c_balance >= 0.004) {
         min_paymnt = c_balance * 0.5;
         f_charge = f_charge + (interest_monthly * c_balance);
         c_balance = c_balance - (min_paymnt + additional_paymnt) + (interest_monthly * c_balance);
         paymnt_month++;
      }
      System.out.println("\n************************************************");
      System.out.println("\nIf you pay the minimum + $" + additional_paymnt + ":");
   }
   
   System.out.printf("The month is %d and the balance is %.4f\n", paymnt_month, c_balance);
   
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
      
   System.out.printf("Payoff time... %d years and %d months\n", year, month);
   System.out.printf("Total Finance Charges... $%.2f\n", f_charge);
   System.out.println("\n************************************************");
      
   System.out.println("\nWould you like to try again? Enter Yes or No");
   choice = keyboard.next();
      if (choice.equals("No")){
         System.out.print("Have a nice day!");
      }
      else {
         System.out.println();
      }
   }
   }  
}