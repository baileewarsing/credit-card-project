package clearenttest;

public class creditcard {
	protected double interestRate, card_interest, balance;

	public double get_interest() {
		return card_interest;
	}

// Calculating the interest if doing additional time
	public void calculate_card_interest() {
		card_interest = balance * interestRate;
	}

	public double get_interest_rate() {
		return interestRate;
	}

	public void set_interest_rate(double newInt) {
		balance = newInt;
	}

	public double get_balance() {
		return balance;
	}

	public void set_balance(double newBal) {
		balance = newBal;
	}
}
