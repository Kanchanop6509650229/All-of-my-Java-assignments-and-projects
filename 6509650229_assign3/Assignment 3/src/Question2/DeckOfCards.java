//กาญจนพ บัวรอด
//6509650229

package Question2;
import java.util.*;

public class DeckOfCards {
	
		public Card[] standardCards;
		public Card[] cards;
	
	public DeckOfCards() {
		standardCards = new Card[52];
		cards = new Card[52];
		int count = 0;
		for(int s = 0 ; s < 13 ; s++) {
			for(int r = 0 ; r < 4 ; r++) {
				Card c = new Card(s,r);
				standardCards[count] = c;
				count++;
			}
		}
		System.arraycopy(standardCards, 0, cards, 0, standardCards.length);
	}
	
	public void reset() {
		System.arraycopy(standardCards, 0, cards, 0, standardCards.length);
	}
	
	public Card getCard(int i) {
		return cards[i];
	}
	
	public int findCard(Card card) {
		int find = 0;
		for(int i = 0 ; i < cards.length ; i++) {
			if(!(card.toString().equalsIgnoreCase(cards[i].toString()))) {
				find++;
			}
			if(card.toString().equalsIgnoreCase(cards[i].toString())) {
				break;
			}
		}
		if(find == 52) {
			return -1;
		}
		else{
			return find+1;
		}
	}
	
	public void shuffle() {
		Card[] shuff = new Card[2];
		int[] random = new int[2];
		Random rand = new Random();
		for(int i = 0 ; i <= rand.nextInt(999999999)+15 ; i++) {
			random[0] = rand.nextInt(52);
			random[1] = rand.nextInt(52);
			shuff[0] = getCard(random[0]);
			shuff[1] = getCard(random[1]);
			cards[random[0]] = shuff[1];
			cards[random[1]] = shuff[0];
		}
	}
	
	public ArrayList<Card> checkDeck(){
		ArrayList<Card> lost = new ArrayList<Card>();
		for(int i = 0 ; i < standardCards.length ; i++) {
			if(findCard(standardCards[i]) == -1) {
				lost.add(standardCards[i]);
			}
		}
		return lost;
	}
	
	public void duplicate(int ori, int dest) {
		if (ori >= 0 && ori < 52 && dest >= 0 && dest < 52) {
			cards[dest] = cards[ori];
		}
	}
	
	public void printDeck() {
		System.out.println("Deck of Cards (52 cards):");
		int count=0;
		for(int i = 0 ; i < 13 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				System.out.printf("%-20s\t",cards[count]);
				count++;
			}
			System.out.println();
		}
	}
	
	public static void print(ArrayList<Card> collection) {
		if(collection.isEmpty()) {
			System.out.println("null collection. Nothing to print!");
		}
		else {
			int count = 0;
			System.out.println("Collection contains:");
			for(int i = 0; i < collection.size() ; i++) {
				System.out.printf("%s\t",collection.get(i));
				count++;
			}
			System.out.println();
			System.out.printf("Total %d cards\n",count);
		}
	}
}
