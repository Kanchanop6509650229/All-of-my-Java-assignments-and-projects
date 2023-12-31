package cs300ExamMatrix;
import java.util.*;

public class Matrix {

	public static void rotating(int[][] matrix , int size) {
		int num = matrix[0][0];
		for(int i = 0 ; i < (size-1) ; i++) {
			matrix[0][i] = matrix[0][(i+1)];
		}
		matrix[0][(size-1)] = matrix[1][size-1];
		for(int i = (size-1) ; i >= 1 ; i--) {
			matrix[1][i] = matrix[1][(i-1)];
		}
		matrix[1][0] = num;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int rotate = scanner.nextInt();
		int[][] matrix = new int[2][size];
		
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < size ; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0 ; i < rotate ; i++) {
			rotating(matrix , size);
		}
		
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < size ; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
