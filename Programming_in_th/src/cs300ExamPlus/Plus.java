package cs300ExamPlus;
import java.util.Scanner;

public class Plus {

	public static long sum(long[] num) {
		return num[0] + num[1];
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long[] sum = new long[2];
		for(int i = 0 ; i < 2 ; i++) {
			sum[i] = scanner.nextLong();
		}
		
		System.out.println(sum(sum));
		
	}

}
