// Java program to calculate daily wage of part-time employee

package demo;

public class PartTime {
	public static void main(String[] args) { // This line declares the main method that is executed when the program runs.
		// TODO Auto-generated method stub

		int wagePerHour = 20; // This line declares the wage per hour as an integer and sets it to 20.
		int hoursPerDay = 8; // This line declares the number of hours per day as an integer and sets it to 8.
		int partTimeHours = 4; // This line declares the number of hours a part-time employee works as an integer and sets it to 4.

		double isPresent = Math.random(); // This line generates a random double value between 0.0 and 1.0 using the Math.random() method and stores it in the variable "isPresent" to simulate whether the employee is present or not.

		int dailyWage = wagePerHour*hoursPerDay; // This line calculates the daily wage by multiplying the wage per hour and the number of hours per day and storing the result in the variable "dailyWage".
		int dailyWagePartTime = wagePerHour*partTimeHours; // This line calculates the daily wage for part-time employees by multiplying the wage per hour and the number of part-time hours and storing the result in the variable "dailyWagePartTime".

		if(isPresent >= 0.5) { // This line begins an if statement that checks if the value of "isPresent" is greater than or equal to 0.5.

			System.out.println("Employee is present"); // This line prints "Employee is present" to the console if the if statement is true.
			System.out.println("Daily wage is "+dailyWage); // This line prints "Daily wage is X" to the console, where X is the calculated daily wage, if the if statement is true.
		}
		else if(isPresent <= 0.5) { // This line begins another if statement that checks if the value of "isPresent" is less than or equal to 0.5.

			System.out.println("Employee is partially present"); // This line prints "Employee is partially present" to the console if the if statement is true.
			System.out.println("Part time wage is "+dailyWagePartTime); // This line prints "Part time wage is X" to the console, where X is the calculated daily wage for part-time employees, if the if statement is true.
		}
		else {
			System.out.println("Employee is absent"); // This line prints "Employee is absent" to the console if both if statements are false.
		}
	}
}
