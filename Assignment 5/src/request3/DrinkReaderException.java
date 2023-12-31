//กาญจนพ บัวรอด
//6509650229

package request3;

public class DrinkReaderException extends Exception {
	
	public DrinkReaderException() {
		super();
	}
	
	public DrinkReaderException(String message) {
		super(message);
		System.out.println("Cannot find! " + message + " gave up!");
	}
}
