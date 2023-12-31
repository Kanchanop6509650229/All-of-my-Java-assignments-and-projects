package cs300ExamPtice;
import java.lang.reflect.Array;
import java.util.*;

public class Ptice {

	public static char[] ansAdrian = {'A','B','C'};
	public static char[] ansBruno = {'B','A','B','C'};
	public static char[] ansGoran = {'C','C','A','A','B','B'};
	
	public static void ans(char[] choice, int size) {
		int adrian = 0 , bruno = 0 , goran = 0 , max;
		for(int i = 0 ; i < size ; i++) {
			if(ansAdrian[i%3] == choice[i]) {
				adrian++;
			}
			if(ansBruno[i%4] == choice[i]) {
				bruno++;
			}
			if(ansGoran[i%6] == choice[i]) {
				goran++;
			}
		}
		max = Math.max(adrian, Math.max(goran, bruno));
		System.out.println(max);
		if(max == adrian) {
			System.out.println("Adrian");
		}
		if(max == bruno) {
			System.out.println("Bruno");
		}
		if(max == goran){
			System.out.println("Goran");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		String choice = scanner.next();
		char[] convChoice = new char[size];
		
		for(int i = 0 ; i < size ; i++) {
			convChoice[i] = choice.charAt(i);
		}
		
		ans(convChoice,size);

	}

}