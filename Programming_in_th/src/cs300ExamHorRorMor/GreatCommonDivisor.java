package cs300ExamHorRorMor;
import java.util.*;

public class GreatCommonDivisor {

	public static int cal(long[] num) {
		int result = 0 ;
		long temp , num1 = num[0] , num2 = num[1];
		while(num2 != 0) {
			temp = num2; //14->12->2
			num2 = num1 % num2; //12%14=12 -> 14%12=2 -> 12%2 = 0
			num1 = temp; //14->12->2
		}
		result = (int)num1;
		//korrornor = (num[0]*num[1]) / result
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long inp[] = new long[2];
		
		for(int i = 0 ; i < 2 ; i++) {
			inp[i] = scanner.nextLong();
		}
		
		Arrays.sort(inp);
		
		System.out.println(cal(inp));
	}

}
