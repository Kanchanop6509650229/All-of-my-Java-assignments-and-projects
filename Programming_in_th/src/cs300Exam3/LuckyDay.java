package cs300Exam3;
import java.util.*;

public class LuckyDay {

	public static long calLucky(long num1, long num2) {
		long result = 0;
		if(num2 >= 10) {
			long ten = num2/10;
			long unit = num2%10;
			ten = (long) Math.pow(ten, 4);
			unit = (long) Math.pow(unit, 4);
			result = (ten+unit) * num1;
		} else {
			long unit = num2;
			for(int i = 0 ; i < 4 ; i++) {
				unit *= unit;
			}
			result = unit * num1;
		}
		
		result %= 10;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userSel,count = 0;
		userSel = scanner.nextInt();
		long userInp[][] = new long[userSel][2];
		for(int i = 0 ; i < userSel ; i++) {
			for(int j = 0 ; j < 2 ; j++) {
				userInp[i][j] = scanner.nextLong();
			}
		}
		
long afterCal[][] = new long[userSel][2];
		
		for(int i = 0 ; i < userSel ; i++) {
			if(calLucky(userInp[i][0],userInp[i][1]) == 4) {
				afterCal[count][0] = userInp[i][0];
				afterCal[count][1] = userInp[i][1];
				count++;
			}
		}
		
		System.out.println(count);
		for(int i = 0; i < count; i++) {
			System.out.println(afterCal[i][0] + " " + afterCal[i][1]);
		}
		
	}

}
