package cs399ExamOkviri;
import java.util.*;

public class Okviri {

	public static void print(char[] input) {
		
		String peterPanTop = "..#..";
		String peterPanSecond = ".#.#.";
		String peterPanMid = "#." + input[0] + ".#";
		for(int i = 1 ; i < input.length ; i++) {
			if(((i+2)%3) == 0 && i+1 < input.length) {
				peterPanTop += ".#..";
				peterPanSecond += "#.#.";
				peterPanMid += "." + input[i] + ".*";
			} else if (((i+1)%3) == 0) {
				peterPanTop += ".*..";
				peterPanSecond += "*.*.";
				peterPanMid += "." + input[i] + ".*";
			} else {
				peterPanTop += ".#..";
				peterPanSecond += "#.#.";
				peterPanMid += "." + input[i] + ".#";
			}
		}
		
		System.out.println(peterPanTop);
		System.out.println(peterPanSecond);
		System.out.println(peterPanMid);
		System.out.println(peterPanSecond);
		System.out.println(peterPanTop);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		char[] convert = new char[input.length()];
		
		for(int i = 0 ; i < convert.length ; i++) {
			convert[i] = input.toUpperCase().charAt(i);
		}
		
		print(convert);

	}

}
