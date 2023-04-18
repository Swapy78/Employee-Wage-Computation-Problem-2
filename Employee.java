//Java program to write class method to compute employee wage

package demo;

//Define the constants for wage per hour, full day hours, part time hours, maximum working days and hours
//Initialize the variables for total working days and hours to zero

public class Employee {
 private static int WAGE_PER_HOUR = 20;
 private static int FULL_DAY_HOURS = 8;
 private static int PART_TIME_HOURS = 4;
 private static int MAX_WORKING_DAYS = 20;
 private static int MAX_WORKING_HOURS = 100;

 private static int totalWorkingDays = 0;
 private static int totalWorkingHours = 0;

 // Call the computeEmployeeWage method
 public static void main(String[] args) {
     computeEmployeeWage();
 }

 // Calculate the daily wage based on the random presence of the employee
 // Increment the total working hours and days accordingly
 // Print the daily wage for the employee

 public static void computeEmployeeWage() {
     while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
         double isPresent = Math.random();
         int dailyWage;
         if (isPresent >= 0.5) {
             dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
             totalWorkingHours += FULL_DAY_HOURS;
         } else {
             dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
             totalWorkingHours += PART_TIME_HOURS;
         }
         totalWorkingDays++;
         System.out.println("Day " + totalWorkingDays + " Wage: " + dailyWage);
     }
     
     // Calculate and print the total wage for the employee based on the total working hours and wage per hour
     int totalWage = WAGE_PER_HOUR * totalWorkingHours;
     System.out.println("Total Wage: " + totalWage);
 }
}
