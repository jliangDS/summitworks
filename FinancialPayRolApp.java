package controlstatements;
import java.util.*;

public class FinancialPayRolApp {
	
	public static void main(String[] args) {
		
	float grossPay;
	float federalWithholding;
	float stateWithholding;
	float totalDeductions;
	float netPay;
	float decimal;
	
	decimal = 0.01f;
		
	System.out.println("Enter employee's name: ");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	
	System.out.println("Enter number of hours worked in a week: ");
	Scanner sc_2 = new Scanner(System.in);
	float hoursWorked = sc_2.nextFloat();
	
	System.out.println("Enter hourly pay rate: ");
	Scanner sc_3 = new Scanner(System.in);
	float hourlyPayRate = sc_3.nextFloat();
	
	System.out.println("Enter federal tax withholding rate: ");
	Scanner sc_4 = new Scanner(System.in);
	float federalTaxWithholdingRate = sc_4.nextFloat();
	
	System.out.println("Enter state tax withholding rate: ");
	Scanner sc_5 = new Scanner(System.in);
	float stateTaxWithholdingRate = sc_5.nextFloat();
	
	grossPay = hoursWorked * hourlyPayRate;
	federalWithholding = grossPay * federalTaxWithholdingRate * decimal;
	stateWithholding = grossPay * stateTaxWithholdingRate * decimal;
	totalDeductions = federalWithholding + stateWithholding;
	netPay = grossPay - totalDeductions;
	
	System.out.println("Employee Name: " + name);
	System.out.println("Hours Worked: " + hoursWorked);
	System.out.println("Pay Rate: $" + hourlyPayRate);
	System.out.println("Gross Pay: $" + grossPay);
	System.out.println("Deductions: ");
	System.out.println("Federal Withholding " + "(" + federalTaxWithholdingRate + "%): $" + federalWithholding);
	System.out.println("State Withholding " + "(" + stateTaxWithholdingRate + "%): $" + stateWithholding);
	System.out.println("Total Deductions: $" + totalDeductions);
	System.out.println("Net Pay: $" + netPay);
	}
}
