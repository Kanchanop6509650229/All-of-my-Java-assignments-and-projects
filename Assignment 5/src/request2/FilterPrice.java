package request2;

public class FilterPrice implements Filter{
	
	private double price;
	
	public FilterPrice(double price) {
		this.price = price;
	}
	
	public boolean match(Sellable item) {
		if(item.getPrice() == price) {
			return true;
		}
		else {
			return false;
		}
	}
}
