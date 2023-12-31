//กาญจนพ บัวรอด
//6509650229

package Question1;
import java.util.*;

public class SoilTempIoT {
	public static final int MIN_TEMP = 10 , MAX_TEMP = 60;
	private int temp;
	private Random rand;

	public SoilTempIoT() {
		rand = new Random();
		temp = rand.nextInt(51)+10;
	}
	
	public int getTemp() {
		int currentTemp = temp;
		temp += rand.nextInt(21)-10;
		while(temp < MIN_TEMP || temp > MAX_TEMP) {
			temp += rand.nextInt(21)-10;
		}
		return currentTemp;
	}
}