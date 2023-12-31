//กาญจนพ บัวรอด
//6509650229

package Question3;
import Question2.*;
import java.util.*;

public class OneBahtCoin implements Tossable {
	
	private int value;
	
	public OneBahtCoin() {
		Random rand = new Random();
		value = rand.nextInt(2);
	}
	
	public String getName() {
		return String.format("1Bath coin");
	}
	
	public int getResult() {
		return value;
	}
	
	public int getMinValue() {
		return 0;
	}
	
	public int getMaxValue() {
		return 1;
	}
	
	public void random() {
		Random rand = new Random();
		value = rand.nextInt(2);
	}
	
	public String toString() {
		String coin = null;
		if(value == 0) {
			coin = "Tail";
		}
		else if(value == 1) {
			coin = "Head";
		}
		return String.format("%s [state=%s(%d)]", getName() , coin , value);
	}
}
