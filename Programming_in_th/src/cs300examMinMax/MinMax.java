package cs300examMinMax;
import java.util.*;

public class MinMax {

	public static int findMin(int[] num,int size) {
		int min = num[0];
		for(int i = 0 ; i < size ; i++) {
			if(num[i] <= min) {
				min = num[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] num,int size) {
		int max = num[0];
		for(int i = 0 ; i < size ; i++) {
			if(num[i] >= max) {
				max = num[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int userInp[] = new int[count];
		
		for(int i = 0 ; i < count ; i++) {
			userInp[i] = scanner.nextInt();
		}
		
		System.out.println(findMin(userInp,count));
		System.out.println(findMax(userInp,count));
	}

}
