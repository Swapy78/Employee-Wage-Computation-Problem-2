//Java program to compute employee wage for multiple companies

package demo;

public class Company {
	
	// The computeEmployeeWage method takes in the company name, wage per hour, hours per day, part time hours,
	// total number of working days and total number of working hours as input parameters
	public static void computeEmployeeWage(String companyName, int wagePerHour, int hoursPerDay, int partTimeHours, int totalDays, int totalHours) {
	    int dailyWage; // Stores the daily wage for a full day of work
	    int dailyWagePartTime; // Stores the daily wage for a part-time day of work
	    int totalWage = 0; // Stores the total wage earned by the employee for the month
	    int hoursWorked = 0; // Stores the total number of hours worked by the employee
	    int daysWorked = 0; // Stores the total number of days worked by the employee
	    
	    // Loop until either the total hours or the total days are reached
	    while (hoursWorked < totalHours && daysWorked < totalDays) {
	        double isPresent = Math.random(); // Generate a random number to simulate employee presence
	        dailyWage = wagePerHour * hoursPerDay; // Calculate the daily wage for a full day of work
	        dailyWagePartTime = wagePerHour * partTimeHours; // Calculate the daily wage for a part-time day of work
	        
	        // If the employee is present for a full day
	        if (isPresent >= 0.5) {
	            System.out.println(companyName + " Employee is present for full day");
	            totalWage += dailyWage; // Add the daily wage for a full day to the total wage earned
	            hoursWorked += hoursPerDay; // Add the hours worked to the total hours worked
	            daysWorked++; // Increment the number of days worked
	        } 
	        // If the employee is partially present
	        else if (isPresent > 0 && isPresent < 0.5) {
	            System.out.println(companyName + " Employee is partially present");
	            totalWage += dailyWagePartTime; // Add the daily wage for a part-time day to the total wage earned
	            hoursWorked += partTimeHours; // Add the hours worked to the total hours worked
	            daysWorked++; // Increment the number of days worked
	        } 
	        // If the employee is absent
	        else {
	            System.out.println(companyName + " Employee is absent");
	            daysWorked++; // Increment the number of days worked
	        }
	    }
	    
	    // Print the total wage, total hours worked and total days worked for the employee for the month
	    System.out.println(companyName + " Total wage for the month: " + totalWage);
	    System.out.println(companyName + " Total hours worked: " + hoursWorked);
	    System.out.println(companyName + " Total days worked: " + daysWorked);
	}

	public static void main(String[] args) {
	    // Compute wages for company A with the given input parameters
		computeEmployeeWage("Company A", 20, 8, 4, 20, 100);
	    
	    // Compute wages for company B with the given input parameters
	    computeEmployeeWage("Company B", 25, 7, 3, 25, 120);
	}
}
