//กาญจนพ บัวรอด
//6509650229

package Question2;

public class Dice {
	public static final int MIN_VALUE = 1;
	private int value , maxValue;
	
	public Dice(int maxValue) {
		if(maxValue <= MIN_VALUE || maxValue > 10) {
			this.maxValue = 6;
		}
		else {
			this.maxValue = maxValue;
		}
		value = MIN_VALUE;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		if(value >= MIN_VALUE && value <= maxValue) {
			this.value = value;
		}
	}
	
	public int getMaxValue() {
		return maxValue;
	}
}
