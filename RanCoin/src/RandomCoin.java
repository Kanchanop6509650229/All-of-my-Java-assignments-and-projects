import java.util.Random;

public class RandomCoin {
	
	//Attribute
	private Random random = new Random();
	private int noOfHead , noOfTail , round;
	
	//Method
	public void init() {
		noOfHead = 0;
		noOfTail = 0;
		round = 0;
	}
	
	public void random(int count) {
		for(int i = 0 ; i < count ; i++) {
			int number = random.nextInt(2);
			if (number == 0) {
				noOfHead++;
			}
			else {
				noOfTail++;
			}
		}
		round += count;
	}
	
	public void displayRandomCoin() {
		System.out.println("Total round: " + round);
		System.out.println("Total head: " + noOfHead);
		System.out.println("Total tail: " + noOfTail);
		System.out.printf("Propotion of head: %.3f%n",noOfHead/(double)round);
		System.out.printf("Propotion of tail: %.3f%n",noOfTail/(double)round);
	}
	
}
