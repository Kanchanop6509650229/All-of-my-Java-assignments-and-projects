import java.util.Scanner;

public class RandomCoinTest {

	public static void main(String[] args) {
		RandomCoin coin = new RandomCoin();
		Scanner input = new Scanner(System.in);
		String inputContinue , inputReset;
		
		do {
			System.out.print("Enter number of round: ");
			int inputRound = input.nextInt();
		
			coin.random(inputRound);
			coin.displayRandomCoin();
			System.out.println();
		
			System.out.print("Do you want to continue (y/n)? ");
			inputContinue = input.next();
			
			if (inputContinue.equals("y")) {
				System.out.print("Do you want to reset the previous round? (y/n) (default is no) ");
				inputReset = input.next(); 
				
				if (inputReset.equals("y")) {
					coin.init(); 
				}
				
			}
			
			System.out.println();
			System.out.println("============================================================================");
			System.out.println();
			
		} while (inputContinue.equals("y"));
		
		System.out.println("Exit Program");
		
	} 

}
