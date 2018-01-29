package clearenttest;
import static org.junit.Assert.*;
import org.junit.Test;

public class Case1Test {
	creditcard[] cards = { new Visa(100), new Mastercard(100), new Discover(100) };
	Wallet[] wallet_set = { new Wallet(cards) };
	Person person1 = new Person(wallet_set);

	

	@Test
	public void testCard1() {
		assertEquals(10, cards[0].get_interest(), 0.0);
	}

	@Test
	public void testCard2() {
		assertEquals(5, cards[1].get_interest(), 0.0);
	}

	@Test
	public void testCard3() {
		assertEquals(1, cards[2].get_interest(), 0.0);
	}
	
	@Test
	public void testPersonInterest() {
		assertEquals(16, person1.calculate_person_interest(), 0.0);
	}
}
