package request1;
import java.util.*;

public class Test1FlyingRabit {
	public static void main(String[] args) {
		FlyingRabbit machine = new FlyingRabbit();
		machine.add(new Drink("Double Espresso", "Hot Coffee", 45, false));
		machine.add(new Drink("Chocolate Protein Shake", "Protein Shakes", 60, true));
		machine.add(new Drink("Hot Cappucino", "Hot Coffee", 40, false));
		machine.add(new Drink("Hot Caramel Latte", "Hot Coffee", 45, true));
		machine.add(new Drink("Dirty", "Iced Coffee", 35, false));
		machine.add(new Drink("Iced Cappucino", "Iced Coffee", 45, false));
		machine.add(new Drink("Matcha Protein Shake", "Protein Shakes", 55, true));
		machine.add(new Drink("Hot Americano", "Hot Coffee", 35, false));
		machine.add(new Drink("Hot Cafe' Latte", "Hot Coffee", 40, false));
		machine.add(new Drink("Strawberry Protein Shake", "Protein Shakes", 60, true));
		machine.add(new Drink("Iced Mocha", "Iced Coffee", 40, false));
		machine.add(new Drink("Iced Matcha Cafe Latte", "Iced Coffee", 45, true));
		System.out.println("Before sorting: ");
		machine.print();
		// make sorting and then print
		Comparator cc = new CompareCategory();
		machine.sort(cc);
		System.out.println("After sorting by Category: ");
		machine.print();
		}
}
