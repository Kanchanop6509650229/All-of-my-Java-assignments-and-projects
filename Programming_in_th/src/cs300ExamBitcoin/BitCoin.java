package cs300ExamBitcoin;
import java.util.*;

public class BitCoin {
	
	static char[] convert = {'1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' , 'A' , 'B' , 'C' , 'D' , 'E' , 'F' , 'G' , 'H' , 'J' , 'K' , 'L' 
			, 'M' , 'N' , 'P' , 'Q' , 'R' , 'S' , 'T' , 'U' , 'V' , 'W' , 'X' , 'Y' , 'Z' , 'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 
			'i' , 'j' , 'k' , 'm' , 'n' , 'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w' , 'x' , 'y' , 'z'};
	
	public static int convert(String input) {
		int result = 0, counter = 0;
		for(int i = 0 ; i < input.length() ; i++) {
			counter = 0;
			for(int j = 0 ; j < convert.length ; j++) {
				if(input.charAt(i) == convert[j]) {
					result += j;
					counter++;
				}
			}
			if(counter == 0) {
				result--;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		System.out.println(convert(input));
	}

}
