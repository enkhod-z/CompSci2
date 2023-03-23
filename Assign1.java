//Enkh-Od Zol-Od
//Assignment 1
//September 2nd, 2022

import java.util.Scanner;

public class Assign1 {
   public static void main(String[] args) {
      //Setting up variables
      Scanner keyboard = new Scanner(System.in);
      
      String city;
      int tempMorn, tempNoon, tempAft, humidityMorn, humidityNoon, humidityAft;
      double mornIndex, noonIndex, aftIndex;
      
      //Asking the user for all the necessary values
      System.out.println("Please enter the city name.");
      city = keyboard.next();
      System.out.println("Please enter the temperature for the Morning.");
      tempMorn = keyboard.nextInt();
      System.out.println("Please enter the temperature for the Noon.");
      tempNoon = keyboard.nextInt();
      System.out.println("Please enter the temperature for the Afternoon.");
      tempAft = keyboard.nextInt();
      System.out.println("Please enter the humidity for the Morning.");
      humidityMorn = keyboard.nextInt();
      System.out.println("Please enter the humidity for the Noon.");
      humidityNoon = keyboard.nextInt();
      System.out.println("Please enter the humidity for the Afternoon.");
      humidityAft = keyboard.nextInt();
      
      //Checking whether the temperature values are valid
      if(tempMorn < 80 || tempNoon < 80 || tempAft < 80) {
         //Telling the user to enter another value if the temperature is less than 80F
         System.out.println("Invalid value for temperature. Please enter a value greater than or equal to 80°F");
      }
      //Checking whether the humidity values are valid
      else if(humidityMorn < 40 || humidityNoon < 40 || humidityAft < 40) {
         //Asking the user to enter another value of the humidity is less than 40%
         System.out.println("Invalid value for humidity. Please enter a value greater than or equal to 40%");
      }
      //Calculating and outputting the values in an organized way if all the values are valid
      else {
         mornIndex = (-42.379) + 2.04901523 * tempMorn + 10.14333127 * humidityMorn + (-0.22475541)* tempMorn * humidityMorn + (-.00683783) * tempMorn * tempMorn + (-.05481717) * humidityMorn * humidityMorn + .00122874 * tempMorn * tempMorn * humidityMorn + .00085282 * tempMorn * humidityMorn * humidityMorn + (-.00000199) * tempMorn * tempMorn * humidityMorn * humidityMorn;
         noonIndex = (-42.379) + 2.04901523 * tempNoon + 10.14333127 * humidityNoon + (-0.22475541)* tempNoon * humidityNoon + (-.00683783) * tempNoon * tempNoon + (-.05481717) * humidityNoon * humidityNoon + .00122874 * tempNoon * tempNoon * humidityNoon + .00085282 * tempNoon * humidityNoon * humidityNoon + (-.00000199) * tempNoon * tempNoon * humidityNoon * humidityNoon;
         aftIndex = (-42.379) + 2.04901523 * tempAft + 10.14333127 * humidityAft + (-0.22475541)* tempAft * humidityAft + (-.00683783) * tempAft * tempAft + (-.05481717) * humidityAft * humidityAft + .00122874 * tempAft * tempAft * humidityAft + .00085282 * tempAft * humidityAft * humidityAft + (-.00000199) * tempAft * tempAft * humidityAft * humidityAft;
         System.out.printf("______________________%s______________________%n", city);
         System.out.println("| Time of Day | Temperature | Humidity | Heat Index |");
         System.out.println("____________________________________________________");
         System.out.printf("|   Morning   |     %d      |    %d    |    %.1f    |%n", tempMorn, humidityMorn, mornIndex);
         System.out.println("____________________________________________________");
         System.out.printf("|    Noon     |     %d      |    %d    |    %.1f    |%n", tempNoon, humidityNoon, noonIndex);
         System.out.println("____________________________________________________");
         System.out.printf("|  Afternoon  |     %d      |    %d    |    %.1f    |%n", tempAft, humidityAft, aftIndex);
         System.out.println("____________________________________________________");
      }
   }
}