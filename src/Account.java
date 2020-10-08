
public class Account {
	
	double balance;
	
	public Account(double amount) {
		
		balance = amount;
	}

	public Account() {
		
		balance = 0;
	}
	
	public void deposit(double amount) {
		
		balance = balance + amount;
	}
	
	public void withdrawal(double amount) {
		
		
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	
	
	
}
