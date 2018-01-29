package clearenttest;
import static org.junit.Assert.*;

import org.junit.Test;

public class Case2Test {
	creditcard[] cards = { new Visa(100), new Discover(100) };
	creditcard[] cards2 = { new Mastercard(100) };

	Wallet[] wallet_set = { new Wallet(cards), new Wallet(cards2) };
	Person person1 = new Person(wallet_set);

	@Test
	public void testPersonInterest() {
		assertEquals(16, person1.calculate_person_interest(), 0.0);
	}

	@Test
	public void testWallet1() {
		assertEquals(11, person1.wallet[0].get_interest(), 0.0);
	}

	@Test
	public void testWallet2() {
		assertEquals(5, person1.wallet[1].get_interest(), 0.0);
	}
}
