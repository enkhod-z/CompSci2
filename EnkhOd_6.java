//Enkh-Od Zol-Od
//Assignment6
//Nov 11th, 2022

//Importing all the necessary libraries
import java.io.*; 
import java.util.*;
import java.io.File;
import java.math.BigDecimal;
import java.io.FileNotFoundException;

public class EnkhOd_6 {
   static Scanner keyboard = new Scanner(System.in);
   public static void main(String[] args) throws IOException {
      
      //Declaring variables
      int userChoice = 0;
      
      //Starting the loop to keep asking the user's choice
      while(userChoice != 7) {
         //Calling the method to output the menu
         theMenu();
         userChoice = keyboard.nextInt();
         
         //Starting the try block
         try {
            switch(userChoice) {
               case 1:
                  ArrayIndexOutOfBounds();
                  break;
               case 2:
                  theArithmetic();
                  break;
               case 3:
                  FileNotFound();
                  break;
               case 4:
                  InputMismatch();
                  break;
               case 5:
                  StringIndexOutOfBounds();
                  break;
               case 6:
                  NoSuchMethod();
                  break;
               case 7:
                  System.out.println();
                  System.out.print("Thank you for learning Exceptions with us! Have a good day!");
                  System.exit(0); //Stopping the program if the user chooses 7
                  break;
               default:
                  System.exit(0);
                  break;
            }
         }
         
         //The catch block
         catch(ArrayIndexOutOfBoundsException output) {
            System.out.println();
            System.out.println("Invalid Index!");
            System.out.println();
         }
         catch(ArithmeticException output) {
            System.out.println();
            System.out.println("Exceptional Arithmetic Condition!");
            System.out.println();
         }
         catch(FileNotFoundException output) {
            System.out.println();
            System.out.println("The File was not Found!");
            System.out.println();
         }
         catch(InputMismatchException output) {
            keyboard.nextLine();
            System.out.println();
            System.out.println("Mismatch in Input!");
            System.out.println();
         }
         catch(StringIndexOutOfBoundsException output) {
            System.out.println();
            System.out.println("String Index is Invalid!");
            System.out.println();
         }
         catch(NoSuchMethodException output) {
            System.out.println();
            System.out.println("Invalid Method!");
            System.out.println();
         }
      }
      
   } //the end of main
   
   //The menu
   public static void theMenu() {
      System.out.println("Enter 1 to learn about the ArrayIndexOutOfBoundsException");
      System.out.println("Enter 2 to learn about the ArithmeticException");
      System.out.println("Enter 3 to learn about the FileNotFoundException");
      System.out.println("Enter 4 to learn about the InputMismatchException");
      System.out.println("Enter 5 to learn about the StringIndexOutOfBoundsException");
      System.out.println("Enter 6 to learn about the NoSuchMethodException");
      System.out.println("Enter 7 if you are done learning about Exceptions");
   }
   
   //Method for the ArrayIndexOutOfBounds
   public static void ArrayIndexOutOfBounds(){
      System.out.println();
      System.out.println("This exception happens when a program tries to access an invalid index in an array,\nthat is, an index that is less than zero, equal to, or larger than the array's length.");
      int [] theArray = new int [4];
      System.out.println("Let's look at an example. We have an array with an index 4: theArray = [1, 19, 57, 3, 101]");
      
      int theIndex;
      System.out.println("Try entering a number from 0 to 4");
      theIndex = keyboard.nextInt();
      System.out.printf("theArray[%d] = %d\n", theIndex, theArray[theIndex]);
      System.out.println("Try entering an invalid index number");
      theIndex = keyboard.nextInt();
      System.out.println(theArray[theIndex]);
   }
   
   //Method for the ArithmeticException
    public static void theArithmetic(){
      System.out.println();
      System.out.println("The ArithmeticException occurs when there is an exceptional arithmetic condition.\nFor example, when an attempt is made to divide two numbers and the number in the denominator is zero");
        
      int theNum;
      System.out.println("Let's look at an example where the denominator is equal to 0. Enter any integer.");
      theNum = keyboard.nextInt();
      System.out.printf("%d / 0 triggers the ArithmeticException\n", theNum);
      System.out.println(theNum/0);
    }

    //Method for FileNotFoundException 
    public static void FileNotFound() throws IOException{
      System.out.println();
      System.out.println("The exception arises when we attempt to access a file that is not there in the system.");
         
      Scanner keyboard = new Scanner(System.in);
      String nameofFile;
      System.out.println("As an example, try entering a file's name wrong or give a nonexistent file name. It will trigger the exception");
      nameofFile = keyboard.next();

      if(nameofFile == "testFile.txt"){
         File input = new File(nameofFile);
         Scanner file = new Scanner(input); 
      }
      else{
         FileNotFoundException theException = new FileNotFoundException();
         throw theException;
      }
    }

    //Method for InputMisMatchException
    public static void InputMismatch(){
      System.out.println();
      System.out.println("InputMismatch occurs when the retrieved value does not match the pattern for the expected type,\nor that the value is out of range for the expected type.");
      System.out.println("Variable theNum is declared as an integer. Try entering a double to trigger the exception.");
      int theNum;
      theNum = keyboard.nextInt();
    }

    //Method for StringIndexOutOfBoundException 
    public static void StringIndexOutOfBounds(){
      System.out.println();
      System.out.println("StringIndexOutOfBoundsException happens when an attempt is made to access a string's character at an index that is\neither negative or greater than the string's length.");
      System.out.println("Let's see an example. A string theWord is declared and it holds a word 'exception'.\nTry entering an index number greater than 8 or less than -9 to trigger the exception.");
      String a = "exception";
      int charIndex;
      charIndex = keyboard.nextInt();
      char c = a.charAt(charIndex);
    }

    //Method for NoSuchMethodException 
    public static void NoSuchMethod() throws NoSuchMethodException{
      System.out.println();
      System.out.println("It occurs when the called method does not exist");
      System.out.println("Let's look at an example. Try entering a random nonexistent method name to trigger the exception.\nIf the exception is triggered then it means that a method named NoSuchMethod() was called");
      String nameofMethod;
      nameofMethod = keyboard.next();
      String.class.getMethod(nameofMethod);   
    }
}