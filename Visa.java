package clearenttest;

public class Visa extends creditcard {

	Visa(double newBal) {
		interestRate = .10;
		balance = newBal;
		card_interest = balance * interestRate;
	}

}
