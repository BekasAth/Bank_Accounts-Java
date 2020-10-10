
public class Account {
	
	double balance;
	String iban;
	
	
	public Account(String iban, double amount) {
		
		balance = amount;
		this.iban = iban;
	}
	

	public Account(String iban) {
		
		this.iban = iban;
		balance = 0;
	}
	
	
	public void deposit(double amount) {
		
		balance = balance + amount;
	}
	
	
	public void withdrawal(double amount) {
		
		if(balance >= amount){
			
			balance = balance - amount;
		}
		else {
			System.out.println("Not enough money.");
		}
	}
	
	
	public double getBalance() {
		
		return balance;
	}
	
	
	public void printData() {
		
		System.out.println("Iban: " + iban + " Balance: " + balance);
	}
	
	
}
