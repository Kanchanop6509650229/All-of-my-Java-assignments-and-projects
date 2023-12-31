//กาญจนพ บัวรอด
//6509650229

package request3;

public class FilterPremium implements Filter{

	public boolean match(Sellable item) {
		return item.isPremium();
	}
}
