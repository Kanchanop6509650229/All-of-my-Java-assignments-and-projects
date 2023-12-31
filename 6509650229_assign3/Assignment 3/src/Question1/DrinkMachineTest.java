//กาญจนพ บัวรอด
//6509650229

package Question1;
import java.util.*;

public class DrinkMachineTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		VendingMachine machine = new VendingMachine();
		Beverage bev,drink;
		
		int price,count=0,money=0,userChoice=0;
		String name,userSelection,inputDrinks;
		boolean defaultInput = false, userInput = false, userBuy = false;
		
		while(!userInput) {
			
			bev = new Beverage(null,0);
			System.out.print("Input drink name : ");
			name = scanner.nextLine();
			bev.setName(name);				
				
				while(!defaultInput) {
					System.out.print("Input drink price : ");
					if (scanner.hasNextInt()) {
							price = scanner.nextInt();
							scanner.nextLine();
							bev.setPrice(price);
							defaultInput = true;
							machine.add(bev);
						}
						else {
							System.out.println("Please Enter Integer");
							scanner.next();
						}
					}
			
				defaultInput = false;
				count++;
			
				if(count < 5) {
					System.out.printf("Please enter more %d item in vending machine%n", 5-count);
				}
				else {
					System.out.print("Do you want to add more item? (y/n) : ");
					userSelection = scanner.next();
					scanner.nextLine();
					if(userSelection.equals("n")) {
						userInput = true;
					}
				}
				System.out.println();
			}
		
		while(!userBuy) {
			System.out.println("=======================================");
			System.out.println();
			System.out.println("Machine has: ");
			machine.print();
			System.out.println();
			System.out.println("=======================================");
			System.out.println();
			System.out.println("You currently have " + money + " baht");
			System.out.println();
			System.out.println("=======================================");
			System.out.println();
			System.out.print("What would you like to buy?: ");
			inputDrinks = scanner.nextLine();
			drink = machine.findByName(inputDrinks);
			if (drink != null) {
				inputDrinks = drink.getName();
				price = drink.getPrice();
				System.out.printf("Item : %s" + "%nPrice : %d%n",inputDrinks,price);
				System.out.println();
				System.out.println("=======================================");
				drink = machine.buy(inputDrinks, money);
				while(drink == null && userChoice != 1) {
					System.out.println("Please select another drink or insert more money");
					System.out.println("1. Back to select another drink");
					System.out.println("2. Insert more money");
					System.out.println("3. Stop buying");
					while(!defaultInput) {
						System.out.print("Your selection (1/2/3) : ");
						if (scanner.hasNextInt()) {
							userChoice = scanner.nextInt();
							scanner.nextLine();
							System.out.println();
							defaultInput = true;
							if (userChoice < 1 && userChoice > 3) {
								defaultInput = false;
							}
						}
						else {
							System.out.println();
							System.out.println("Please Enter Integer");
							scanner.next();
							System.out.println();
						}
					}
					defaultInput = false;
					switch(userChoice) {
					case 1: 
						break;
					case 2: 
						System.out.println("=======================================");
						System.out.println();
						while(!defaultInput) {
							System.out.print("Please insert more money: ");
							if (scanner.hasNextInt()) {
									money += scanner.nextInt();
									scanner.nextLine();
									defaultInput = true;
								}
								else {
									System.out.println("Please Enter Integer");
									scanner.next();
								}
							}
						System.out.println("Your current money is " + money);
						System.out.println();
						System.out.println("=======================================");
						drink = machine.buy(inputDrinks, money);
						break;
					case 3:
						System.out.println("=======================================");
						System.out.println();
						System.out.println("Your refund is " + money + " baht");
						System.out.println("Thank you. Have a nice day!");
						System.exit(0);
						break;
					default: 
						break;
					}
				}
				userChoice = 0;
				if(drink != null) {
					money -= drink.getPrice();
					System.out.println();
					System.out.println("Here is your drink: " + drink + " -");
					System.out.println();
					System.out.println("=======================================");
					System.out.println();
					System.out.println("You have " + money + " baht left");
					System.out.println();
					System.out.println("=======================================");
					System.out.println();
					System.out.print("Do you want to buy more? (y/n): ");
					userSelection = scanner.next();
					scanner.nextLine();
					System.out.println();
					if(userSelection.equals("n")) {
						userInput = true;
						break;
					}
				}
			}
			else {
				System.out.println("The machine did not serve this beverage " + inputDrinks);
				System.out.println();
				inputDrinks = null;
			}
		}
		System.out.println("=======================================");
		System.out.println();
		System.out.println("Your refund is " + money + " baht");
		System.out.println("Thank you. Have a nice day!");
	}
}
