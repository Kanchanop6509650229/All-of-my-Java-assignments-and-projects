/*
 * Author: Kanchanop Buarod 6509650229
 * Date: 12/2/2023
 * Program Convert temperature and weight
 * This program is for question1 in assignment1
 */

package question1;

import java.util.Scanner;

public class TestCalculator {
	
	public static void main(String[] args) {
		
		//new object
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		//user input weight
		System.out.print("Enter your weight (Kg): ");
		double kilogram = scanner.nextDouble();
		
		//user input fahrenheit
		System.out.print("Enter temperature (F): ");
		double fahrenheit = scanner.nextDouble();
		
		//convert user input
		double pound = calculator.convertKilogramToPound(kilogram);
		double celcius = calculator.convertFahrenheitToCelsius(fahrenheit);
		
		//display the converted
		System.out.println();
		System.out.printf("%.4f Kg " + "\u2192" +  " %.4f Pounds%n", kilogram , pound);
		System.out.printf("%.2f " + "\u00b0" +"F " + "\u2192" + " %.2f " + "\u00b0" + "C", fahrenheit , celcius);
		
	}
}
