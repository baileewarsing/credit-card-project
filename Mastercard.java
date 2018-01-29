package clearenttest;

public class Mastercard extends creditcard {
	
	Mastercard(double newBal){
	interestRate = .05;
	balance = newBal;
	card_interest = balance * interestRate;	
	}
	
}
