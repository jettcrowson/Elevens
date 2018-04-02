/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */	
		String[] suits = new String[]{"Diamonds", "Hearts","Clubs","Spades"};
		String[] ranks = new String[]{"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		int[] values = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};

		Deck d = new Deck(ranks, suits, values);
		System.out.println(d);
	
	}
}
