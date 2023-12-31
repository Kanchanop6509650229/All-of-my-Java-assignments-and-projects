package request2;
import java.util.*;

public class CompareCategory implements Comparator<Sellable>{
	
	public int compare(Sellable s1 , Sellable s2) {
		int compare = s1.getCategory().compareTo(s2.getCategory());
		return compare;
	}

}
