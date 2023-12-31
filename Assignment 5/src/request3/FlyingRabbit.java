//กาญจนพ บัวรอด
//6509650229

package request3;
import java.util.*;

public class FlyingRabbit {
	
	ArrayList<Sellable> list;
	
	public FlyingRabbit() {
		list = new ArrayList<Sellable>();
	}
	
	public FlyingRabbit(ArrayList<Sellable> list) {
		this.list = new ArrayList<Sellable>();
		this.list = (ArrayList<Sellable>) list.clone();
	}
	
	public void add(Sellable drink) {
		list.add(drink);
	}
	
	public void sort(Comparator<Sellable> comp) {
		Collections.sort(list,comp);
	}
	
	public void print() {
		System.out.println("Item list");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println("\t" + list.get(i));
		}
	}
	
	public void print(Filter filter) {
		int isMatch = 0;
		System.out.println("Filter list:");
		for(Sellable match : list) {
			if(filter.match(match)) {
				System.out.println("\t" + match);
				isMatch = 1;
			}
		}
		if(isMatch == 0) {
			System.out.println("--No match!");
		}
	}
}
