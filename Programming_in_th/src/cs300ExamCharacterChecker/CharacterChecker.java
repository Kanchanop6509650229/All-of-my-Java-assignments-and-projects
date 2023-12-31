package cs300ExamCharacterChecker;
import java.util.*;

public class CharacterChecker {

	public static void charCheck(String inp) {
		int count = 0;
		for(int i = 0 ; i < inp.length() ; i++) {
			if(inp.charAt(i) == Character.toUpperCase(inp.charAt(i))) {
				count++;
			}
		}
		if(count == inp.length()) {
			System.out.println("All Capital Letter");
		} else if(count == 0) {
			System.out.println("All Small Letter");
		} else {
			System.out.println("Mix");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String userInp = scanner.nextLine();
		
		charCheck(userInp);
	}

}
