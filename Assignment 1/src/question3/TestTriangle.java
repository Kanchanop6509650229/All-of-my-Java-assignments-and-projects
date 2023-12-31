/*
 * Author: Kanchanop Buarod 6509650229
 * Date: 12/2/2023
 * Program Triangle Area Calculator
 * This program is for question3 in assignment1
 */

package question3;

import java.util.Scanner;

public class TestTriangle {
//main class
	
	public static void main(String[] args) {
		
		//local variable
		int t1[] = new int[3];
		int i;
		
		//new object
		Triangle triangle = new Triangle();
		Scanner scanner = new Scanner(System.in);
		
		for(i=1; i<=3; i++) {
		//loop to let user input the 3 side of triangle
			
	        while (t1[i-1] <= 0) {
	        //check that user input is more than 0
	        	System.out.print("Enter side [" + i + "] = ");

	            while (!scanner.hasNextInt()) {
	            //check that user input is an integer
	                System.out.println("That's not an integer. Please try again.");
	                System.out.print("Enter side [" + i + "] = ");
	                scanner.next();
	            }

	            t1[i-1] = scanner.nextInt();

	            if (t1[i-1] <= 0) {
	            //if user input is less than 1. print this text
	                System.out.println("The side must be greater than 0. Please try again.");
	            }
	        
	        }
	        
		}
		
		triangle.setArea(t1); //set area in class Triangle
		triangle.calHalf(t1); //calculate the half of all side combine together
		triangle.calArea(triangle.getHalf()); //calculate the area of triangle
		
		System.out.println();
		System.out.println("=========================================================================================");
		System.out.println();
		
		/*
		 * Check that user input can be the triangle by call the checkArea method in Triangle class
		 * if checkArea return true boolean, then the user input cannot be triangle
		 * but if checkArea return false boolean, the user input can be triangle. Then print out the calculated area.
		 */
		if (triangle.checkArea()) {
			System.out.printf("This can not be triangle%n");
		}
		else {
			System.out.printf("Area of Triangle with sides (%.2f,%.2f,%.2f) = %.2f%n", triangle.getArea(1), triangle.getArea(2), triangle.getArea(3), triangle.getCalArea());
			triangle.checkTriangle(); //Check that this triangle can be right triangle
		}
	}
}