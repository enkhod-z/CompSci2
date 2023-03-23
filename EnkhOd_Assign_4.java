//Enkh-Od Zol-Od
//Assignment 4
//Started: Sept 30th, 2022
//Finished: Sept 30th, 2022 (1.5 hours)

import java.util.Scanner;

public class EnkhOd_Assign_4 {
   public static void main(String[] args) {
      //Setting up variables
      Scanner keyboard = new Scanner(System.in);
      
      String city;
      int [][] temp_hum = new int [3][2];
      double [] hIndex = new double [3];
      
      //Asking the user for the city name
      System.out.println("Please enter the city name.");
      city = keyboard.next();
      
      //Getting values for Morning
      System.out.println("Please enter the temperature for the Morning.");
      //Storing the values in a 2D array
      temp_hum[0][0] = keyboard.nextInt();
      System.out.println("Please enter the humidity for the Morning.");
      temp_hum[0][1] = keyboard.nextInt();
      
      //Using the method to calculate the Heat Index and storing it in a 1D array
      hIndex[0] = heatInx(temp_hum[0][0], temp_hum[0][1]); //Morning Heat Index
         
      //Getting values for Noon
      System.out.println("Please enter the temperature for the Noon.");
      temp_hum[1][0] = keyboard.nextInt();
      System.out.println("Please enter the humidity for the Noon.");
      temp_hum[1][1] = keyboard.nextInt();
      
      hIndex[1] = heatInx(temp_hum[1][0], temp_hum[1][1]); //Noon Heat Index
      
      //Getting values for Afternoon
      System.out.println("Please enter the temperature for the Afternoon.");
      temp_hum[2][0] = keyboard.nextInt();
      System.out.println("Please enter the humidity for the Afternoon.");
      temp_hum[2][1] = keyboard.nextInt();
      
      hIndex[2] = heatInx(temp_hum[2][0], temp_hum[2][1]); //Afternoon Heat Index
            
      //Outputting the values in an organized way
      System.out.printf("______________________%s______________________%n", city);
      System.out.println("| Time of Day | Temperature | Humidity | Heat Index |");
      System.out.println("____________________________________________________");
      System.out.printf("|   Morning   |     %d      |    %d    |    %.1f    |%n", temp_hum[0][0], temp_hum[0][1], hIndex[0]);
      System.out.println("____________________________________________________");
      System.out.printf("|    Noon     |     %d      |    %d    |    %.1f    |%n", temp_hum[1][0], temp_hum[1][1], hIndex[1]);
      System.out.println("____________________________________________________");
      System.out.printf("|  Afternoon  |     %d      |    %d    |    %.1f    |%n", temp_hum[2][0], temp_hum[2][1], hIndex[2]);
      System.out.println("____________________________________________________");
   }
   
   //Method for calculating the Heat Index
   static double heatInx(int tempValue, int humValue) {
   
      double answer = (-42.379) + 2.04901523 * tempValue + 10.14333127 * humValue + (-0.22475541)* tempValue * humValue + (-.00683783) * tempValue * tempValue + (-.05481717) * humValue * humValue + .00122874 * tempValue * tempValue * humValue + .00085282 * tempValue * humValue * humValue + (-.00000199) * tempValue * tempValue * humValue * humValue;
      
      return answer;
   }
}