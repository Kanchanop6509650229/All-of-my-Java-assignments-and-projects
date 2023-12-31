//กาญจนพ บัวรอด
//6509650229

package Question1;
import java.util.*;

public class Beverage {
	private String name;
	private int price;
	
	//constructor
	public Beverage(String aName,int aPrice) {
		name = aName;
		price = aPrice;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String aName) {
		name = aName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int aPrice) {
		price = aPrice;
	}
	
	public String toString() {
		return String.format(" - %s [price %d]", name, price);
	}
}
