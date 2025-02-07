//กาญจนพ บัวรอด
//6509650229

package Question2;
import java.util.*;

public class RandomDice extends Dice implements Tossable{
	
	public RandomDice() {
		super(6);
	}
	
	public RandomDice(int maxValue) {
		super(maxValue);
	}
	
	public String getName() {
		return String.format("%d-side die", getMaxValue());
	}

	public int getResult() {
		return super.getValue();
	}
	
	public int getMinValue() {
		return MIN_VALUE;
	}
	
	public int getMaxValue() {
		return super.getMaxValue();
	}
	
	public void random() {
		Random rand = new Random();
		setValue(rand.nextInt(getMaxValue())+1);
	}
	
	public String toString() {
		return String.format("%d-side die value=%d",getMaxValue(),getResult());
	}
}
