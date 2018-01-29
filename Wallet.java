package clearenttest;
import clearenttest.creditcard;

public class Wallet{
	protected double wallet_interest;
	protected creditcard[] cc;
	
	Wallet(creditcard[] newCards) {
		cc = newCards;
		calculate_all_wallet_interest();
	}
	
// Adding the interest per card to get interest for wallet
	public void calculate_all_wallet_interest(){
		for(int i = 0; i < cc.length; i++){
			wallet_interest+=cc[i].get_interest();
		}
	}
	
	public void set_credit_card(creditcard[] newCards){
		cc = newCards;
	}
	
	public creditcard[] get_credit_card(){
		return cc;
	}

	public void set_interest(double newInterest){
		wallet_interest = newInterest;
	}
	
	public double get_interest(){
		return wallet_interest;
	}
}
