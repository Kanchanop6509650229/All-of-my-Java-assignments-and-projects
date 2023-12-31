package cs300ExamABC;
import java.util.*;

public class ABC {

	public static int[] compareNum(int[] num,char[] abc) {
		int[] result = new int[3];
		
		Arrays.sort(num);
		
		int max = num[2] , mid = num[1] , min = num[0];
		
		for(int i = 0 ; i < abc.length ; i++) {
			if(abc[i] == 'A') {
				result[i] = min;
			}
			if(abc[i] == 'B') {
				result[i] = mid;
			}
			if(abc[i] == 'C') {
				result[i] = max;
			}
		} 
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input;
		char abc[] = new char[3];
		int userInp[] = new int[3];
		
		for(int i = 0 ; i < 3 ; i++) {
			userInp[i] = scanner.nextInt();
		}
		
		input = scanner.next();
		
		for(int i = 0 ; i < input.length() ; i++) {
			abc[i] = input.charAt(i);
		}
		
		int[] finalResult = new int[3];
		finalResult = compareNum(userInp,abc);
		
		for (int i = 0 ; i < finalResult.length ; i++) {
			System.out.printf(finalResult[i] + " ");
		}
		
	}

}