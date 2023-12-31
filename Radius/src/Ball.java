/*
 * This program is for calculate the ball
 * Made by Kanchanop Buarod
 * 6509650229
 */
public class Ball {
	
	//Attribute
	private double radius;
	private final double PI = Math.PI;
	
	//Method
	public void setRadius(double aRadius) { //ตั้งค่า
		radius = aRadius;
	}
	
	public double getRadius() { //คืนค่า radius
		return radius;
	}
	
	public double getSurface() { //คืนค่า surface
		double surface;
		surface = 4 * PI * Math.pow(radius, 2);
		return surface;
	}
	
	public double getVolume() { //คืนค่า volume
		double volume;
		volume = ((double)4/3) * PI * Math.pow(radius, 3);
		return volume;
	}
	
}