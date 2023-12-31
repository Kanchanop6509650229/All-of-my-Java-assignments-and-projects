//กาญจนพ บัวรอด
//6509650229

package request3;
import java.util.*;

public class FlyingRabitTest {
	public static void greetingScreen() {
		System.out.println(" 1. list all");
		System.out.println(" 2. list only premium items");
		System.out.println(" 3. list only items matched my price");
		System.out.println(" 4. sort items by category and list them: ");
		System.out.println(" 5. exit");
		System.out.print("Please choose your choice:");
	}
	
	public static FlyingRabbit setupFlyingRabbit() throws DrinkReaderException {
		DrinkReader reader = new DrinkReader();
		reader.readFileUI();
		FlyingRabbit machine = new FlyingRabbit(reader.getList());
		return machine;
		}
	
	public static void main(String[] args) {
		try {
			FlyingRabbit machine = setupFlyingRabbit();
			System.out.println("Welcome to Flying Rabbit @TU station");
			Scanner scan = new Scanner(System.in);
			boolean done = false;
			FilterPremium premium = new FilterPremium();
			CompareCategory cc = new CompareCategory();
			do {
				greetingScreen();
				System.out.print("Select your choice (1 to 5):");
				switch (scan.nextLine()) {
					case "1":
						machine.print();
						break;
					case "2":
						machine.print(premium);
						break;
					case "3":
						System.out.print("Filter price. Price that you want: ");
						double price = scan.nextDouble();
						scan.nextLine();
						machine.print(new FilterPrice(price));
						break;
					case "4":
						machine.sort(cc);
						machine.print();
						break;
					case "5":
						System.out.println("Thank you. Bye!");
						done = true;
						break;
				};
			} while (!done);
		}
		catch (DrinkReaderException e){
		}
	}
}
