package cs300ExamMatrixAddition;
import java.util.*;

public class MatrixAddition {

	public static long plusMatrix(long num1 , long num2){
		return num1+num2;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size1 = scanner.nextInt() , size2 = scanner.nextInt();
		
		long matrix[][] = new long[size1][size2];
		long compareMatrix[][] = new long[size1][size2];
		
		for(int i = 0 ; i < size1 ; i++) {
			for(int j = 0 ; j < size2 ; j++) {
				matrix[i][j] = scanner.nextLong();
			}
		}
		
		for(int i = 0 ; i < size1 ; i++) {
			for(int j = 0 ; j < size2 ; j++) {
				compareMatrix[i][j] = scanner.nextLong();
			}
		}
		
		for(int i = 0 ; i < size1 ; i++) {
			for(int j = 0 ; j < size2 ; j++) {
				System.out.printf("%d ",plusMatrix(matrix[i][j],compareMatrix[i][j]));
			}
			System.out.println();
		}

	}

}
