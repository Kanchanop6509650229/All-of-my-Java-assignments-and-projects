package cs300ExamX2;
import java.util.*;

public class X2 {

	public static int mean(int[] num) {
		int result = 0;
		result = (num[1] * 2) - num[0];
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inp[] = new int[2];
		
		for (int i = 0 ; i < 2 ; i++) {
			inp[i] = scanner.nextInt();
		}
		
		System.out.println(mean(inp));

	}

}
