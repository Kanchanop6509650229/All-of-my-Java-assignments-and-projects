//กาญจนพ บัวรอด
//6509650229

package request3;

public class Drink implements Sellable{
	
	private String name;
	private double price;
	private String category;
	private boolean premium;
	
	public Drink(String name , String category , double price , boolean premium) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.premium = premium;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory()	{
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isPremium() {
		return premium;
	}
	
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	
	public String toString() {
		String isPremium = null;
		if(isPremium()) {
			isPremium = "Premium";
		}
		else {
			isPremium = "Regular";
		}
		return String.format("%s \t[%s (%s %.1f)]", getCategory() , getName() , isPremium , getPrice());
	}
	
}
