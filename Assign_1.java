//Enkh-Od Zol-Od
//Assignment 1
//September 9th, 2022

import java.util.Scanner;

public class Assign_1 {
   public static void main(String[] args) {
      //Setting up variables
      Scanner keyboard = new Scanner(System.in);
      
      String city;
      int tempMorn, tempNoon, tempAft, humidityMorn, humidityNoon, humidityAft;
      double mornIndex = 0, noonIndex = 0, aftIndex = 0;
      
      //Asking the user for all the necessary values while checking them
      System.out.println("Please enter the city name.");
      city = keyboard.next();
      
      System.out.println("Please enter the temperature for the Morning.");
      //Storing the value in a variable
      tempMorn = keyboard.nextInt();
      System.out.println("Please enter the humidity for the Morning.");
      humidityMorn = keyboard.nextInt();
         //Checking whether the morning temperature and humidity values are valid
         if (tempMorn < 80 || humidityMorn < 40) {
            //Asking the user to enter a valid value 
            System.out.println("Invalid value for Morning, please enter a temperature greater than or equal to 80°F and a humidity greater than or equal to 40%");
            System.exit(0);
         }
         else {
            //Calculating the heat index if the values are valid
            mornIndex = (-42.379) + 2.04901523 * tempMorn + 10.14333127 * humidityMorn + (-0.22475541)* tempMorn * humidityMorn + (-.00683783) * tempMorn * tempMorn + (-.05481717) * humidityMorn * humidityMorn + .00122874 * tempMorn * tempMorn * humidityMorn + .00085282 * tempMorn * humidityMorn * humidityMorn + (-.00000199) * tempMorn * tempMorn * humidityMorn * humidityMorn;
         }
         
      System.out.println("Please enter the temperature for the Noon.");
      tempNoon = keyboard.nextInt();
      System.out.println("Please enter the humidity for the Noon.");
      humidityNoon = keyboard.nextInt();
         //Checking whether the noon temperature and humidity values are valid
         if (tempNoon < 80 || humidityNoon < 40) {
            System.out.println("Invalid value for Noon, please enter a temperature greater than or equal to 80°F and a humidity greater than or equal to 40%");
            System.exit(0);
         }
         else {
            //Calculating the heat index if the values are valid
            noonIndex = (-42.379) + 2.04901523 * tempNoon + 10.14333127 * humidityNoon + (-0.22475541)* tempNoon * humidityNoon + (-.00683783) * tempNoon * tempNoon + (-.05481717) * humidityNoon * humidityNoon + .00122874 * tempNoon * tempNoon * humidityNoon + .00085282 * tempNoon * humidityNoon * humidityNoon + (-.00000199) * tempNoon * tempNoon * humidityNoon * humidityNoon;
         }
      
      System.out.println("Please enter the temperature for the Afternoon.");
      tempAft = keyboard.nextInt();
      System.out.println("Please enter the humidity for the Afternoon.");
      humidityAft = keyboard.nextInt();
         //Checking whether the afternoon temperature and humidity values are valid
         if (tempAft < 80 || humidityAft < 40) {
            System.out.println("Invalid value for Afternoon, please enter a temperature greater than or equal to 80°F and a humidity greater than or equal to 40%");
            System.exit(0);
         }
         else {
            //Calculating the heat index if the values are valid
            aftIndex = (-42.379) + 2.04901523 * tempAft + 10.14333127 * humidityAft + (-0.22475541)* tempAft * humidityAft + (-.00683783) * tempAft * tempAft + (-.05481717) * humidityAft * humidityAft + .00122874 * tempAft * tempAft * humidityAft + .00085282 * tempAft * humidityAft * humidityAft + (-.00000199) * tempAft * tempAft * humidityAft * humidityAft;
         }
      
         //Outputting the values in an organized way if all the values are valid
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