//Java program to check an employee is present or absent

package demo; // This line declares the package that this Java class belongs to.

public class EmployeePresentAbsent { // This line declares the public class "EmployeePresentAbsent".

	public static void main(String[] args) { // This line declares the main method that is executed when the program runs.
		// TODO Auto-generated method stub

		double isPresent = Math.random(); // This line generates a random double value between 0.0 and 1.0 using the Math.random() method and stores it in the variable "isPresent".
		
		if(isPresent >= 0.5) { // This line begins an if statement that checks if the value of "isPresent" is greater than or equal to 0.5.

			System.out.println("Employee is present"); // This line prints "Employee is present" to the console if the if statement is true.
		}
		else {
			System.out.println("Employee is absent"); // This line prints "Employee is absent" to the console if the if statement is false.
		}
	}
}
