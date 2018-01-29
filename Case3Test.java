package clearenttest;
import static org.junit.Assert.*;
import org.junit.Test;

public class Case3Test {

	// Setting up person 1
	creditcard[] cards = { new Mastercard(100), new Visa(100), new Discover(100) };
	Wallet[] wallet_set = { new Wallet(cards) };

	// Setting up person 2
	creditcard[] cards2 = { new Visa(100), new Mastercard(100) };
	Wallet[] wallet_set2 = { new Wallet(cards2) };

	// Combining them into an array of people
	Person[] both_people = { new Person(wallet_set), new Person(wallet_set2) };

	// Testing person 1
	@Test
	public void testPerson1Interest() {
		assertEquals(16, both_people[0].calculate_person_interest(), 0.0);
	}

	@Test
	public void testPerson1Wallet1() {
		assertEquals(16, both_people[0].wallet[0].get_interest(), 0.0);
	}

	// Testing person 2
	@Test
	public void testPerson2Interest() {
		assertEquals(15, both_people[1].calculate_person_interest(), 0.0);
	}

	@Test
	public void testPerson2Wallet1() {
		assertEquals(15, both_people[1].wallet[0].get_interest(), 0.0);
	}

}
