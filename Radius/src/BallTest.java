import java.util.Scanner;

public class BallTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input the radius of the ball : ");
		double radius = input.nextDouble();
		
		Ball ball = new Ball();
		ball.setRadius(radius);
		
		System.out.printf("The ball radius " + "%.2f ",radius);
		System.out.printf("has a surface area = " + "%.3f %n",ball.getSurface());
		System.out.printf("The ball radius " + "%.2f ",radius);
		System.out.printf("has volume = " + "%.3f",ball.getVolume());
	}
}
