package cs300ExamPythagorus;
import java.util.*;

public class Pythagorus {

	public static double cal(double[] num) {
		double result = 0;
		result = Math.sqrt(Math.pow(num[0], 2) + Math.pow(num[1], 2));
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] inp = new double[2];
		for(int i = 0 ; i < inp.length ; i++) {
			inp[i] = scanner.nextDouble();
		}

		System.out.printf("%.6f", cal(inp));
		
	}

}
