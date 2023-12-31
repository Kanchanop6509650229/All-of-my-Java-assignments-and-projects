package request1;
import java.util.*;

public class FlyingRabbit {
	
	ArrayList<Sellable> list;
	
	public FlyingRabbit() {
		list = new ArrayList<Sellable>();
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
}
