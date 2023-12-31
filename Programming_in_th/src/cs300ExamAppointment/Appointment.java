package cs300ExamAppointment;
import java.util.*;

public class Appointment {

	public static void cal(int[][] p1 , int[][] p2) {
		
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] person1 = new int[2][2];
		int[][] person2 = new int[2][2];
		
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < 2 ; j++) {
				person1[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < 2 ; j++) {
				person2[i][j] = scanner.nextInt();
			}
		}

		cal(person1 , person2);
	}

}
