// Java program to calculate an employee wages for a month

package demo;

public class WagesforMonth {

    public static void main(String[] args) {
        int wagePerHour = 20;
        int hoursPerDay = 8;
        int partTimeHours = 4;
        int workingDaysPerMonth = 20;

        // Generate a random number between 0 and 1 to simulate employee attendance
        double isPresent = Math.random();

        // Calculate the daily wages for full-time and part-time employees
        int dailyWage = wagePerHour * hoursPerDay;
        int dailyWagePartTime = wagePerHour * partTimeHours;
        int monthlyWage = 0;

        if (isPresent >= 0.5) {
            // If the employee is present for more than or equal to 50% of the time
            // Calculate monthly wage by multiplying daily wage by the number of working days in a month
            monthlyWage = dailyWage * workingDaysPerMonth;
        } else if (isPresent > 0 && isPresent < 0.5) {
            // If the employee is present for less than 50% of the time
            // Calculate monthly wage by multiplying part-time daily wage by the number of working days in a month
            monthlyWage = dailyWagePartTime * workingDaysPerMonth;
        } else {
            // If the employee is absent
            // Monthly wage is zero
            monthlyWage = 0;
        }

        // Print the monthly wage of the employee
        System.out.println("Monthly wage is " + monthlyWage);
    }
}
