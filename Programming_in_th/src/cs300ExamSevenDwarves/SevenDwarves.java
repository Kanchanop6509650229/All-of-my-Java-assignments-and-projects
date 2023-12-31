package cs300ExamSevenDwarves;
import java.util.*;

public class SevenDwarves {
	
	public static void sort(ArrayList<Integer> input , int sum) {
		int removed1 = 0 , removed2 = 0;
		
		for(int i = 0 ; i < input.size()-1 ; i++) {
			for(int j = i+1 ; j < input.size() ; j++) {
				if(sum - input.get(i) - input.get(j) == 100) {
					removed1 = input.get(i);
					removed2 = input.get(j);
					break;
				}
			}
			
		}
		input.remove(input.indexOf(removed1));
		input.remove(input.indexOf(removed2));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int size = 9;
		ArrayList<Integer> dwarves = new ArrayList<>();
		int sum = 0;
		
		for(int i = 0 ; i < size ; i++) {
			dwarves.add(scanner.nextInt());
			sum += dwarves.get(i);
		}
		
		sort(dwarves , sum);
		
		for(int i = 0 ; i < dwarves.size() ; i++) {
			System.out.println(dwarves.get(i));
		}
	}

}
