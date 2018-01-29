package clearenttest;

public class Discover extends creditcard {

	Discover(double newBal){
	interestRate = .01;
	balance = newBal;
	card_interest = balance * interestRate;	
	}

}
