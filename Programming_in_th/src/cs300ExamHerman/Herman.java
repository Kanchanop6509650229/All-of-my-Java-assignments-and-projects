package cs300ExamHerman;
import java.util.*;

public class Herman {

	public static double calGeo(int num) {
		double result = 0;
		result = Math.pow(num, 2) * 2;
		return result;
	}
	
	public static double calNormal(int num) {
		double result = 0;
		result = Math.PI * Math.pow(num, 2);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		System.out.printf("%.6f",calNormal(input));
		System.out.printf("\n%.6f",calGeo(input));
	}

}
