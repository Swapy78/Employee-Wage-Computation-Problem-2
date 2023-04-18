// Java program to calculate an employee wage using Switch Case
package demo;

public class SwitchCase {

    public static void main(String[] args) {
        int wagePerHour = 20; // Hourly wage rate
        int hoursPerDay = 8; // Number of hours worked in a day
        int partTimeHours = 4; // Number of hours worked in part-time

        double isPresent = Math.random(); // Generate a random number to check employee's attendance
        
        int dailyWage = wagePerHour * hoursPerDay; // Calculate daily wage based on hours worked
        int dailyWagePartTime = wagePerHour * partTimeHours; // Calculate part-time wage
        
        // Use switch-case to check employee's attendance and calculate wage accordingly
        switch (isPresent >= 0.5 ? 1 : 0) { // Check if random number generated is greater than or equal to 0.5
            case 1: // If yes, employee is present
                System.out.println("Employee is present");
                System.out.println("Daily wage is " + dailyWage);
                break;
            case 0: // If no, employee is partially present
                System.out.println("Employee is partially present");
                System.out.println("Part time wage is " + dailyWagePartTime);
                break;
            default: // If random number generation failed, employee is absent
                System.out.println("Employee is absent");
        }
    }
}
