/*
 * Author: Kanchanop Buarod 6509650229
 * Date: 12/2/2023
 * Program Loan Calculator
 * This program is for question2 in assignment1
 */

package question2;

import java.util.Scanner;

public class TestLoan {
	
	public static void main(String[] args) {
		
		//new object
		Loan loan1 = new Loan();
		Scanner scanner = new Scanner(System.in);
		
		//let user input the amount and set in the setPrinciple method of class Loan
		System.out.print("Enter Loan Amount (Baht) : ");
		int amount = scanner.nextInt();
		loan1.setPrinciple(amount);
		
		//let user input the loan term in year and set in the setYear method of class Loan
		System.out.print("Enter Loan Term (year) : ");
		int year = scanner.nextInt();
		loan1.setYear(year);
		
		//let user input the interest rate and set in the setInterest method of class Loan
		System.out.print("Enter Interest Rate (Percent/Year) : ");
		int interest = scanner.nextInt();
		loan1.setInterest(interest);
		
		System.out.println();
		System.out.println("==================================================================================");
		System.out.println();
		
		//calculated user input and keep in main class variable
		double loanPerMonth = loan1.calLoanPerMonth();
		double totalLoan = loan1.getTotalLoan(loan1.calLoanPerMonth());
		double totalInterest = loan1.getTotalLoan(loan1.calLoanPerMonth()) - amount;
		
		//display user input
		loan1.displayLoan();
		
		//display calculated loan
		System.out.printf("Payment Every Month = %,.2f Baht%n", loanPerMonth);
		System.out.printf("Total Payment = %,.2f Baht%n", totalLoan);
		System.out.printf("Total Interest = %,.2f Baht", totalInterest);
	}
	
}
