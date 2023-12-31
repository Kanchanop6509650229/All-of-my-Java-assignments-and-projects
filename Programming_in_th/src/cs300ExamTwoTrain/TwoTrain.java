package cs300ExamTwoTrain;
import java.util.*;

public class TwoTrain {

	public static void split(int[] inp , int size) {
		int min = 0 , selCase = 1 , result = 0 , splitTrain = 0;
		int[] train = new int[2];
		for(int i = 0 ; i < size ; i++) {
			min += inp[i];
		}
		while(selCase < (size-1)) {
			train[0] = 0;
			train[1] = 0;
			for(int i = selCase ; i < size ; i++) {
				train[0] += inp[i];
			}
			for(int i = (selCase-1) ; i >= 0 ; i--) {
				train[1] += inp[i];
			}
			result = Math.abs(train[0] - train[1]);
			if(result < min) {
				min = result;
				splitTrain = (selCase+1);
			}
			selCase++;
		}
		System.out.printf("%d %d", splitTrain , min);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] train = new int[size];
		
		for(int i = 0 ; i < size ; i++) {
			train[i] = scanner.nextInt();
		}
		
		split(train , size);
	}

}
