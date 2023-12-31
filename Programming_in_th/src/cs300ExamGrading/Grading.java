package cs300ExamGrading;
import java.util.*;

public class Grading {

	public static void grading(int[] score) {
		int result = 0;
		for(int i = 0 ; i < score.length ; i++) {
			result += score[i];
		}
		if(result <= 100 && result >= 80) {
			System.out.println("A");
		} else if(result <= 79 && result >= 75) {
			System.out.println("B+");
		} else if(result <= 74 && result >= 70) {
			System.out.println("B");
		} else if(result <= 69 && result >= 65) {
			System.out.println("C+");
		} else if(result <= 64 && result >= 60) {
			System.out.println("C");
		} else if(result <= 59 && result >= 55) {
			System.out.println("D+");
		} else if(result <= 54 && result >= 50) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score[] = new int[3];
		for(int i = 0 ; i < score.length ; i++) {
			score[i] = scanner.nextInt();
		}
		grading(score);
	}

}
