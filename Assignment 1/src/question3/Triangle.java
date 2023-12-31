/* Triangle class to calculate the area of triangle by parameter from main class */

package question3;

import java.util.Arrays;

public class Triangle {
	
	//instance variables
	private double half,calArea;
	private double area[] = new double[3];
	
	//method
	
	public void setArea(int aArea[]) {
	//set array of area by using for loop
		int i;
		for(i=0;i<3;i++) {
			area[i]=(double)aArea[i];
		}
	}
	public double getArea(int inputNum) {
	//return double selected array of area by input parameter 1-3
		return area[inputNum-1];
	}

	public void calHalf(int aArea[]) {
	//calculate the half of all side combine together
		half = (aArea[0] + aArea[1] + aArea[2]) * 0.5;
	}
	public double getHalf() {
	//return double of a half that calculated from calHalf method
		return half;
	}
	
	public void calArea(double aHalf) {
	//calculate the area
		calArea = Math.sqrt(half*(half-area[0])*(half-area[1])*(half-area[2]));
	}
	public double getCalArea() {
	//return double of calculated area
		return calArea;
	}
	
	/*
	 * Check that calculated area is not error
	 * if there is error return true boolean
	 * but if not return else boolean
	 */
	public boolean checkArea() {
		if(Double.isNaN(calArea)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void checkTriangle() {
	//check that this triangle can be right triangle
		Arrays.sort(area); //sort array of area from least to greastest
		if (Math.pow(area[2], 2) == Math.pow(area[1], 2) + Math.pow(area[0], 2)) { //c^2=a^2+b^2
			System.out.println("This triangle can be right triangle");
		}
		else {
			System.out.println("This triangle can not be right triangle");
		}
	}
	
}
