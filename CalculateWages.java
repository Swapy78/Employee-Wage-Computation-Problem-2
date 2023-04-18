//Java program to calculate wages till a condition of total working hours or days is reached for a month

package demo;

public class CalculateWages {
    
	public static void main(String[] args) {
	    // Initialize the variables
	    int wagePerHour = 20; // wage per hour
	    int hoursPerDay = 8; // hours worked in a full day
	    int partTimeHours = 4; // hours worked in a part-time day
	    int totalHours = 100; // total hours to work in a month
	    int totalDays = 20; // total days to work in a month
	    
	    // Declare variables for current iteration
	    double isPresent;
	    int dailyWage;
	    int dailyWagePartTime;
	    int totalWage = 0;
	    int hoursWorked = 0;
	    int daysWorked = 0;
	    
	    // Loop until either total working hours or days is reached
	    while (hoursWorked < totalHours && daysWorked < totalDays) {
	        // Generate a random number to determine if the employee is present, partially present, or absent
	        isPresent = Math.random();
	        
	        // Calculate daily wages based on whether the employee is present for a full day or a part-time day
	        dailyWage = wagePerHour * hoursPerDay;
	        dailyWagePartTime = wagePerHour * partTimeHours;
	        
	        // Determine the type of attendance and calculate wages and hours worked accordingly
	        if (isPresent >= 0.5) {
	            System.out.println("Employee is present for full day");
	            totalWage += dailyWage;
	            hoursWorked += hoursPerDay;
	            daysWorked++;
	        } else if (isPresent > 0 && isPresent < 0.5) {
	            System.out.println("Employee is partially present");
	            totalWage += dailyWagePartTime;
	            hoursWorked += partTimeHours;
	            daysWorked++;
	        } else {
	            System.out.println("Employee is absent");
	            daysWorked++;
	        }
	    }
	    
	    // Output the total wage, hours worked, and days worked for the month
	    System.out.println("Total wage for the month: " + totalWage);
	    System.out.println("Total hours worked: " + hoursWorked);
	    System.out.println("Total days worked: " + daysWorked);
	}
}
