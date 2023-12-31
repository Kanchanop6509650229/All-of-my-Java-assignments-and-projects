package cs300ExamTrik;
import java.util.*;

public class Trik {

	public static void calTrik(int[] inpBall, int inpCase) {
		int swCase = 0; 
		switch(inpCase) {
		case 1: 
			swCase = inpBall[0];
			inpBall[0] = inpBall[1];
			inpBall[1] = swCase;
			break;
		case 2:
			swCase = inpBall[1];
			inpBall[1] = inpBall[2];
			inpBall[2] = swCase;
			break;
		case 3:
			swCase = inpBall[0];
			inpBall[0] = inpBall[2];
			inpBall[2] = swCase;
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] ball = {1 , 0 , 0};
		
		String input = scanner.nextLine();
		char convert[] = new char[input.length()];
		
		for(int i = 0 ; i < convert.length ; i++) {
			convert[i] = input.charAt(i);
		}
		
		for(int i = 0 ; i < convert.length ; i++) {
			if(convert[i] == 'A') {
				calTrik(ball , 1);
			} else if(convert[i] == 'B') {
				calTrik(ball , 2);
			} else if(convert[i] == 'C') {
				calTrik(ball , 3);
			}
		}
		
		for(int i = 0 ; i < ball.length ; i++) {
			if(ball[i] == 1) {
				System.out.println(i+1);
				break;
			}
		}
		
	}

}
