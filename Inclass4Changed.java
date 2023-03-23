//Enkh-Od Zol-Od
//In class exercise
//Oct 28th, 2022

import java.util.*;
import java.io.*;

public class Inclass4Changed{
   static Scanner readFile;
   public static void main(String[] args) throws IOException {
   String name, theGroup, fileName;
   int age;
   Scanner keyboard = new Scanner(System.in);
      
   File outputFile = new File("groupInfo.txt"); //args[1]
   PrintWriter write2file = new PrintWriter(outputFile);
   
   //dealing with FileNotFoundException
   try{
      File inputFile = new File("information.txt"); //args[0] filePath[0]
      readFile = new Scanner(inputFile);
      
      FileNotFoundException theException = new FileNotFoundException();
      throw theException;
   }
   
   catch(FileNotFoundException theEx){
      System.out.println("File not found in the folder");
      //System.exit(0);
      
      System.out.println("Please enter your file name");
      fileName = keyboard.next();
      File inputFile = new File(fileName);
      readFile = new Scanner(inputFile);
   }
            
      while(true) {
         name = readFile.next();
         age = readFile.nextInt();
         
         if (age < 25) {
            theGroup = "young";
         }
         else if (age < 45) {
            theGroup = "mature";
         }
         else if (age < 65) {
            theGroup = "old";
         }
         else {
            theGroup = "over the hill";
         }
         
         if(!readFile.hasNext()) {
            break;
         }
         
         write2file.printf("%s is %d and in the %s group.\n", name, age, theGroup);
      }
      
      write2file.printf("%s is %d and in the %s group.", name, age, theGroup);
      
      System.out.print("The file is ready to view. Output is in file named 'groupInfo.txt'");
      
      readFile.close();
      write2file.close();
   }
}