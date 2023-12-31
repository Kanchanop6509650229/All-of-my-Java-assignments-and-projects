package request2;

public class FilterPremium implements Filter{

	public boolean match(Sellable item) {
		return item.isPremium();
	}
}
