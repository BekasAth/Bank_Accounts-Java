
public class Savings extends Account {
	
	double interest;
	
	public Savings(double amount, double interest) {
		
		super(amount);
		this.interest = interest;
	}
	
	
	public void transport(double amount, Account account) {
		
		if(balance - amount >= 0 ) {
			
			balance = balance - amount;
			account.deposit(amount);
		}
	}
	
	public void compoundInterest() {
		
		balance = balance + (balance * (interest/100));
	}

}
