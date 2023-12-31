/* Loan class to set or get the calculated loan */

package question2;

public class Loan {
	
	//instance variable
	private int principle,year;
	private double interest;
	
	//method
	
	public void setPrinciple(int aPrinciple) {
	//set the user input loan amount
		principle = aPrinciple;
	}
	public int getPrinciple() {
	//return the user input loan amount
		return principle;
	}
	
	public void setYear(int aYear) {
	//set the user input loan term
		year = aYear;
	}
	public double getYear() {
	//return the user input loan term
		return year;
	}
	
	public void setInterest(int aInterestPerYear) {
	//set the user input interest rate and turn it to double
		interest = (double)aInterestPerYear;
	}
	public double getInterest() {
	//return the user input interest rate
		return interest;
	}
	
	public double calLoanPerMonth() {
	//calculate and return the loan per month
		double loanPerMonth;
		double interestPerMonth = (interest/100D)/12D; //turn interest per year into month
		int month = year*12; //turn user input year to month
		loanPerMonth = (double)principle / ( (Math.pow(1D + interestPerMonth, (double)month) - 1D) / (interestPerMonth*Math.pow(1D+interestPerMonth, (double)month)) );
		return loanPerMonth;
	}
	
	public double getTotalLoan(double aLoanPerMonth) {
	//convert a loan per month to total loan
		double totalLoan;
		totalLoan = aLoanPerMonth*((double)year*12D);
		return totalLoan;
	}
	
	public void displayLoan() {
	//display user input
		System.out.printf("Loan Amount : %,d Baht%n", principle);
		System.out.printf("Loan Term : %d Years%n", year);
		System.out.printf("Interest Rate : %.2f%%/Years %n", interest);
		System.out.println();
	}
}
