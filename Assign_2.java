//Enkh-Od Zol-Od
//Assignment 2
//Started: September 12th, 2022
//Finished: September 16th, 2022

import java.util.Scanner;

public class Assign_2 {
   public static void main(String[] args) {
   //Setting up variables
   Scanner keyboard = new Scanner(System.in);
   
   String name, major_status, initial, status = "", engType;
   char year, initial1, initial2;
   int studentNum, n = 0;
   
   //Asking for the number of students
   System.out.println("How many students' information do you want to enter?");
   studentNum = keyboard.nextInt();
   
   do {
      keyboard.nextLine();
      //Asking for the student's name
      System.out.println("Please enter the student's full name.");
      name = keyboard.nextLine();
      //Combining the first letters of their first and last name for the initials
      initial1 = name.charAt(0);
      initial2 = name.charAt(name.indexOf(' ') + 1);
      initial = "" + initial1 + initial2;

      //Asking for the major and their status at school, then displaying the menu
      System.out.println("Please enter their major and the year they are in after looking at the menu:");
      System.out.println("M for Mathematics\nC for Computer Science\nE for Engineering\n");
      System.out.println("1 for Freshman\n2 for Sophomore\n3 for Junior\n4 for Senior");
      //Storing two characters for the major and status
      major_status = keyboard.next();
      year = major_status.charAt(1);
      
      //Comparing the second char of major_status to cases in order to determine the year they are in
      switch (year) {
         case '1':
            status = "Freshman";
            break;
         case '2':
            status = "Sophomore";
            break;
         case '3':
            status = "Junior";
            break;
         case '4':
            status = "Senior";
            break;
         default:
            //Letting the user know that they entered a wrong value
            System.out.println("\nInvalid value for major or status, please try again.\n");
            continue;
       }
       
       //Checking and outputting for the Math majors
       if (major_status.equals("M1") || major_status.equals("M2") || major_status.equals("M3") || major_status.equals("M4")) {
          n++;
          System.out.printf("\n%s is a %s Mathematics major.\n", initial, status);
          System.out.println();
       }
       //Checking and outputting for Computer Science majors
       else if (major_status.equals("C1") || major_status.equals("C2") || major_status.equals("C3") || major_status.equals("C4")) {
          n++;
          System.out.printf("\n%s is a %s Computer Science major.\n", initial, status);
          System.out.println();
       }
       //Checking and outputting for Engineering majors
       else if (major_status.equals("E1") || major_status.equals("E2") || major_status.equals("E3") || major_status.equals("E4")) {
          //Asking the user for the type of Engineering
          System.out.println("\nPlease choose the type of Engineering major:");
          System.out.println("M for Mechanical Engineering\nC for Civil Engineering\nE for Electrical Engineering");
          engType = keyboard.next();
          
          //Checking and outputting the types of Engineering major
          if (engType.equals("M")) {
             n++;
             System.out.printf("\n%s is a %s (Mechanical) Engineering major.\n");
          }
          else if (engType.equals("C")) {
             n++;
             System.out.printf("\n%s is a %s (Civil) Engineering major.\n", initial, status);
          }
          else if (engType.equals("E")) {
             n++;
             System.out.printf("\n%s is a %s (Electrical) Engineering major.\n", initial, status);
          }
          //Letting the user know that they entered a wrong value for the type
          else {
             System.out.println("\nInvalid value for Engineering major type, please try again.\n");
          }
       }
       //Asking the user to retry
       else {
          System.out.println("Invalid value for major or status, please try again.\n");
       }
   } while (n < studentNum);
   }
}