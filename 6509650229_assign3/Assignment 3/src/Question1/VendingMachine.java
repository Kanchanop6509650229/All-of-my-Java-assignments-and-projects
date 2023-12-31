//กาญจนพ บัวรอด
//6509650229

package Question1;
import java.util.*;

public class VendingMachine {
	private ArrayList<Beverage> sDrinks;
	
	public VendingMachine() {
		sDrinks = new ArrayList<Beverage>();
	}
	
	public void add(Beverage d) {
		sDrinks.add(d);
	}
	
	public Beverage findByName(String drinkName) {
		Beverage matchDrink = null;
		for(Beverage drink : sDrinks) {
			if(drinkName.equalsIgnoreCase(drink.getName())) {
				matchDrink = drink;
			}
		}
		return matchDrink;
	}
	
	public Beverage buy(String drinkName,int money) {
		Beverage matchDrink = null;
		for(Beverage drink : sDrinks) {
			if(drinkName.equalsIgnoreCase(drink.getName())) {
				matchDrink = drink;
			}
		}
		if(money - matchDrink.getPrice() < 0) {
			System.out.println();
			System.out.printf("You don't have enough money (Need more %d baht)%n", matchDrink.getPrice() - money);
			matchDrink = null;
		}
		return matchDrink;
	}
	
	public void print() {
		for(Beverage drink : sDrinks) {
			System.out.println(drink);
		}
	}
}