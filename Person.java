package clearenttest;

public class Person {
	protected Wallet[] wallet;
	protected double person_interest;

	Person(Wallet[] newWallet) {
		wallet = newWallet;
		calculate_person_interest();
	}

	public void set_wallet(Wallet[] newWallet) {
		wallet = newWallet;
	}

	public Wallet[] get_wallet() {
		return wallet;
	}

	public void set_person_interest(double new_person_int) {
		person_interest = new_person_int;
	}

	public double get_person_interest() {
		return person_interest;
	}

	// Adding the interest of each wallet to get the total interest per person
	public double calculate_person_interest() {
		person_interest = 0;
		for (int i = 0; i < wallet.length; i++) {
			person_interest += wallet[i].get_interest();
		}
		return person_interest;
	}
}
