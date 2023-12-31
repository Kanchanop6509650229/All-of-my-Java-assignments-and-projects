package cs300ExamSkocimis;
import java.util.*;

public class Scosimis {

	public static int count(int[] num) {
		int result = 0 , count = 1;
		if(num[2] - num[1] > num[1] - num[0]) {
			while(num[0] != num[2]-1 && num[1] != num[2]-1) {
				if(count%2 == 0) {
					num[1] = num[0]+1;
					count++;
				} else {
					num[0] = num[1]+1;
					count++;
				}
				result++;
			}
		} else {
			while(num[0] != num[1]-1 && num[2] != num[1]-1) {
				if(count%2 == 0) {
					num[0] = num[2]+1;
					count++;
				} else {
					num[2] = num[0]+1;
					count++;
				}
				result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] kang = new int[3];
		for(int i = 0 ; i < 3 ; i++) {
			kang[i] = scanner.nextInt();
		}
		
		Arrays.sort(kang);
		
		System.out.println(count(kang));
	}

}
