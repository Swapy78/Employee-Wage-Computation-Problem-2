/**
 * Java program for Ability to save the Total Wage for Each Company
Note:1) You can Create EmpWageBuilder for each Company
2)Use Instance Variable instead of function parameters

Ability to manage Employee Wage of multiple companies 
Note: 1)Refactor to have one EmpWageBuilder to manage for Wage for multiple Company
2)Create CompanyEmpWage class and let EmpWageBuilder has array of many CompanyEmpWage Object

Ability to manage Employee Wage of multiple companies using Interface approach 
Note: Refactor to have one EmpWageBuilder to implement interface

Refactor to have list of multiple companies to manage Employee Wage.
Note: Refactor to use ArrayList instead of array

Store the Daily Wage along with the Total Wage

Ability to get the Total Wage when queried by Company - Create Method in EmpWageBuilder to get total wage by Company

 */




package demo;

import java.util.*;

//This is the interface that defines the methods for computing 
//and retrieving total employee wage for a company
interface IComputeEmpWage {
	// method to add a new company's employee wage details
    void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
 // method to compute the total employee wage for all companies 
    void computeEmpWage();
 // method to retrieve the total employee wage for a particular company
    int getTotalWage(String company);
}

//This class stores the details of a company's employee wage,
//including its name, employee rate per hour, number of working days, 
//and maximum hours per month
class CompanyEmpWage {
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
 // total employee wage for the company
    public int totalEmpWage;
 // list of daily wages for the employees of the company
    public ArrayList<Integer> dailyWageList;

 // Constructor for initializing the instance variables 
 //of the CompanyEmpWage class
    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.totalEmpWage = 0;
        this.dailyWageList = new ArrayList<Integer>();
    }

 // Setter method for setting the total employee wage for the company
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

 // toString method for returning the string representation
 // of the CompanyEmpWage object
    public String toString() {
        return "Total wage for " + company + " is " + totalEmpWage;
    }
}

//This class implements the IComputeEmpWage interface and is responsible
//for adding and computing employee wages for multiple companies
class EmpWageBuilder implements IComputeEmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
 // list of company employee wage details
    private ArrayList<CompanyEmpWage> companyEmpWageList;
 // map of company name to its employee wage details
    private Map<String, CompanyEmpWage> companyToEmpWageMap;

 // Constructor for initializing the instance variables
 // of the EmpWageBuilder class
    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<CompanyEmpWage>();
        companyToEmpWageMap = new HashMap<String, CompanyEmpWage>();
    }

 // Method to add a new company's employee wage details to the list
 // and map
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(company, companyEmpWage);
    }

 // Method to compute the total employee wage for all companies added
    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;
         // Clear the dailyWageList for the company
            companyEmpWage.dailyWageList.clear();
         // Loop until either the maximum monthly hours or the number
         // of working days is reached
            while (totalEmpHrs < companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            	// Increment the number of working days
                totalWorkingDays++;
             // Determine the employee hours based on a random value
                int empHrs = 0;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                // If the value is 1, set employee hours to part time
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                // If the value is 2, set employee hours to full time
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                // If the value is 0, set employee hours to zero (absent)
                    default:
                        empHrs = 0;
                }
             // Calculate the employee wage based on the employee hours
             //and rate per hour
                int empWage = empHrs * companyEmpWage.empRatePerHour;
             // Increment the total employee hours for the month
                totalEmpHrs += empHrs;
             // Add the daily wage to the dailyWageList for the company
                companyEmpWage.dailyWageList.add(empWage);
            }
         // Calculate the total employee wage for the month and set
         // it for the company
            int totalEmpWage = totalEmpHrs * companyEmpWage.empRatePerHour;
            companyEmpWage.setTotalEmpWage(totalEmpWage);
        }
    }
 // Return the total wage for a company based on its name
    public int getTotalWage(String company) {
        return companyToEmpWageMap.get(company).totalEmpWage;
    }
 // Main method for the program
    public static void main(String[] args) {
    	// Create a new instance of EmpWageBuilder
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
     // Add the employee wage details for two companies
        empWageBuilder.addCompanyEmpWage("Company A", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Company B", 10, 4, 20);
     // Compute the employee wages for both companies
        empWageBuilder.computeEmpWage();
     // Print the total wage for each company
        System.out.println("Total Wage for Company A: " + empWageBuilder.getTotalWage("Company A"));
        System.out.println("Total Wage for Company B: " + empWageBuilder.getTotalWage("Company B"));
    }
}
