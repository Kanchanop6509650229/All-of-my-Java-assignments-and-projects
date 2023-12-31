//กาญจนพ บัวรอด
//6509650229

package Question2;

public class TestDeck {

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.printDeck();
		
		Card c = new Card(1, 0); // 3 of Club
		System.out.printf("\t>>>%s is in the deck's position %d\n", c,
		deck.findCard(c));
		System.out.println("\n*******After shuffled********");
		deck.shuffle();

		System.out.println("After shuffle, missing cards from the deck: ");
		DeckOfCards.print(deck.checkDeck());
		deck.printDeck();
		System.out.printf("\t>>>%s is in the deck's position %d\n", c,
		deck.findCard(c));
		
		deck.reset();
		deck.duplicate(4, 10);
		deck.duplicate(0, 51);
		deck.duplicate(0, 52);
		System.out.println("\n*******After duplicate, missing cards from thedeck: ");
		DeckOfCards.print(deck.checkDeck());
		deck.printDeck();
	}

}
