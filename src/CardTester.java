/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("King", "Hearts", 13);
		Card c2 = new Card("King", "Hearts", 13);
		Card c3 = new Card("King", "Diamonds", 13);
		Card[] ls = {c1,c2,c3};
		System.out.println(c1.matches(c2));
		System.out.println(c1.matches(c3));
		for(Card c : ls){
			System.out.println(c);
		}
	}
}
