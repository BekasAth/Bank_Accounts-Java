
public class Savings extends Account {
	
	double interest;
	
	public Savings(String iban, double amount, double interest) {
		
		super(iban,amount);
		this.interest = interest;
	}
	
	public Savings(String iban, double interest) {
		
		super(iban);
		this.interest = interest;
	}
	
	
	public void transport(double amount, Account account) {
		
		if(balance >= amount ) {
			
			balance = balance - amount;
			account.deposit(amount);
		}else {
			System.out.println("not enough money.");
		}
	}
	
	
	public void compoundInterest() {
		
		balance = balance + (balance * (interest/100));
	}
	
	public void nextMonth() {
		
		this.compoundInterest();
	}
	


}
