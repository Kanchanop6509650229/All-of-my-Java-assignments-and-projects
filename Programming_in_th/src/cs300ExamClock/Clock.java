package cs300ExamClock;
import java.util.*;

public class Clock {
	
	static int[] time = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11, 12};
	
	public static int calDegree(String[] inp) {
		int countForward = 0 , countBackward = 0 , counter;
		boolean isOut = true;
		String hr = inp[0] + inp[1];
		String mn = inp[2] + inp[3];
		int convHr = Integer.parseInt(hr) , convMn = Integer.parseInt(mn);
		convMn /= 5;
		if(convMn == 0) {
			convMn = 12;
		}
		counter = convHr-1;
		while(isOut) {
			if(time[counter%12] == convMn) {
				isOut = false;
			} else {
				counter++;
				countForward++;
			}
		} 
		isOut = true;
		counter = convHr-1;
		while(isOut) {
			if(time[counter%12] == convMn) {
				isOut = false;
			} else {
				counter--;
				if(counter == (-1)) {
					counter = 11;
				}
				countBackward++;
			}
		}
		if(countForward < countBackward) {
			return countForward * 30;
		} else {
			return countBackward * 30;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String[] conv = input.split(" ");
		
		System.out.println(calDegree(conv));
	}

}
