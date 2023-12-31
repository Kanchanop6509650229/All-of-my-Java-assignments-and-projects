package cs300ExamCharCount;
import java.util.*;

public class CharCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char convInput = input.charAt(0);
		int size = scanner.nextInt();
		String[] word = new String[size];
		
		for(int i = 0 ; i < size ; i++) {
			word[i] = scanner.nextLine();
		}
		
		
	}

}
