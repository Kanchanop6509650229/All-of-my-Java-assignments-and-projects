package cs300ExamBugCatcher;
import java.util.*;

public class BugCatcher {
	
	public static void counter(char[] input) {
		int counter[] = new int[5];
		int maxNum = 0;
		char max = ' ';
		for(int i = 0 ; i < input.length ; i++) {
			if(Character.toUpperCase(input[i]) == 'A') {
				counter[0]++;
			} else if(Character.toUpperCase(input[i]) == 'B') {
				counter[1]++;
			} else if(Character.toUpperCase(input[i]) == 'C') {
				counter[2]++;
			} else if(Character.toUpperCase(input[i]) == 'D') {
				counter[3]++;
			} else if(Character.toUpperCase(input[i]) == 'E') {
				counter[4]++;
			}
		}
		for(int i = 0 ; i < 5 ;i++) {
			System.out.println(counter[i]);
			if(maxNum < counter[i]) {
				maxNum = counter[i];
				switch(i) {
				case 0:
					max = 'A';
					break;
				case 1:
					max = 'B';
					break;
				case 2:
					max = 'C';
					break;
				case 3:
					max = 'D';
					break;
				case 4:
					max = 'E';
					break;
				default:
					break;
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char[] conv = new char[input.length()];
		for(int i = 0 ; i < conv.length ; i++) {
			conv[i] = input.charAt(i);
		} 

		counter(conv);
	}

}
