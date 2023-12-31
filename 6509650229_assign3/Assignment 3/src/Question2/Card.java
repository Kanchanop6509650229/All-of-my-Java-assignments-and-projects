//กาญจนพ บัวรอด
//6509650229

package Question2;

public class Card {
	private int rank, suit;
	private final String[] SUITS = {"Club", "Diamond", "Heart", "Spade"};
	private final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
	
	public Card(int rank, int suit) {
	 this.rank = rank;
	 this.suit = suit;
	 }
	
	public int getRank() {
	 return rank;
	 }
	
	public int getSuit() {
	 return suit;
	 }

	public String toString() {
	 return RANKS[rank] + " of " + SUITS[suit];
	 }
	
	public boolean equals(Card other) {
	 return this.rank == other.rank && this.suit == other.suit;
	 } 
}
