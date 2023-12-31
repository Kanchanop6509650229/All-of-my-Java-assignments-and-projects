package cs300ExamModulo;
import java.util.*;

public class Modulo {

	public static void sortArray(ArrayList<Integer> input) {
		Set<Integer> afterSort = new LinkedHashSet<>();
		afterSort.addAll(input);
		input.clear();
		input.addAll(afterSort);
	}
	
	public static int modulo(int inp) {
		return inp%42;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 0 ; i < 10 ; i++) {
			num.add(scanner.nextInt());
			num.set(i, modulo(num.get(i)));
		}
	
		sortArray(num);
		
		System.out.println(num.size());
	}

}
