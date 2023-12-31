//กาญจนพ บัวรอด
//6509650229

package Question3;
import Question2.*;
import java.util.*;

public class HiLowGame {
	
	private int maxGuess;
	private static final int MAX_GUESS_ITEMS = 4;
	ArrayList<Tossable> tossedItems;
	
	public HiLowGame() {
		
		Random rand = new Random();
		int randomNumber;
		tossedItems = new ArrayList<Tossable>();
		maxGuess = 3;
		
		for(int i = 0 ; i < 10 ; i++) {
			
			randomNumber = rand.nextInt(2);
			
			if(randomNumber == 0) {
				tossedItems.add(new OneBahtCoin());
				tossedItems.get(i).random();
			}
			else if(randomNumber == 1) {
				tossedItems.add(new RandomDice(rand.nextInt(10)+1));
				tossedItems.get(i).random();
			}
			
		}
		
	}
	
	public void play() {
		
		boolean defaultBoolean = false;
		int money = 0 , round = 0 , playableRound = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of money: ");
		
		while(!defaultBoolean) {

			if (scanner.hasNextInt()) {
					money = scanner.nextInt();
					scanner.nextLine();
					defaultBoolean = true;
				}
			else {
				System.out.println("Please Enter Integer");
				scanner.next();
			}
		
		}
		
		if(money < 2) {
			System.out.println("Not enough money to play the game!");
		}
		else {
			playableRound = money/2;
			
			for(int i = 0 ; i < playableRound ; i++) {
				round++;
				System.out.printf(">>Playing round %d/%d\n", round , playableRound);
				System.out.printf("You have %d chances to guess\n", maxGuess);
				eachPlay();
				
			}

		}
		
		System.out.println("Bye...");
		
	}
	
	public void eachPlay() {
		 
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		ArrayList<Integer> userGuess = new ArrayList<Integer>();
		ArrayList<Tossable> guess = new ArrayList<Tossable>();
		ArrayList<Tossable> cloneTossedItems = new ArrayList<Tossable>();
		cloneTossedItems = (ArrayList<Tossable>) tossedItems.clone();
		int guessItems = rand.nextInt(MAX_GUESS_ITEMS)+1 , randomNum = 0 , correctCount = 0;
		int[] isCorrect = new int[guessItems];
		
		for(int i = 0 ; i < guessItems ; i++) {
			
			randomNum = rand.nextInt(cloneTossedItems.size());
			guess.add(cloneTossedItems.get(randomNum));
			cloneTossedItems.remove(randomNum);
			
		}
		 
		for(int i = 0 ; i < maxGuess ; i++) {
			
			System.out.print("Guess " + guessItems + " numbers: ");
			
			for(int j = 0 ; j < guessItems ; j++) {
				userGuess.add(scan.nextInt());
	 		}
		 	
			for(int k = 0 ; k < guessItems ; k++) {
		 		
				if(userGuess.get(k) == guess.get(k).getResult()) {
		 			System.out.printf("[=] ");
		 			isCorrect[k] = 1;
		 		}
		 		else if(userGuess.get(k) > guess.get(k).getResult()){
			 		System.out.printf("[Too High (%d/%d)] ", guess.get(k).getMinValue() , guess.get(k).getMaxValue());
			 	}
		 		else if(userGuess.get(k) < guess.get(k).getResult()){
			 		System.out.printf("[Too Low (%d/%d)] ", guess.get(k).getMinValue() , guess.get(k).getMaxValue());
			 	}
				
		 	}
			
			for(int k : isCorrect) {
				correctCount += k;
			}
			if(correctCount == guessItems) {
				System.out.println();
				System.out.println("You win");
				break;
			}	
		 
			System.out.println();
			userGuess.clear();
			correctCount = 0;
			
		}
	
		if(correctCount != guessItems) {
			System.out.println("You lose");
		}
		
		System.out.printf("You played with ");
		for(int i = 0 ; i < guessItems ; i++) {
			
			System.out.printf("%s", guess.get(i));
			
			if(i != guessItems-1) {
				System.out.printf(" , ");
			}
			
		}
		
		System.out.println();
		guess.clear();
		userGuess.clear();
		cloneTossedItems.clear();
	
	}

}