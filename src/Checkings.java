
public class Checkings extends Account{
	
	int count = 0;
	
	
	public Checkings(String iban, double amount){
		
		super(iban, amount);
	}
	
	
	public void deposit(double amount) {
		
		
		if(count + 1 > 3) {
			
			if (balance + amount >=  2*((count-3) + 1)) {
				
				balance = balance + amount;
				count++;
			}else {
				
				System.out.println("Not enough money");
			}
		}else {
			
			balance = balance + amount;
			count++;
		}
	}
	
	
	public void withdrawal(double amount) {
		
		
		if (count + 1 > 3) {
			
			if (balance >= amount + 2*(count + 1)) {
				
				balance = balance - amount;
				count++;
			}else {
				
				System.out.println("Not enough money");
			}
		}else {
			
			if (balance >= amount) {
				
				balance = balance - amount;
				count++;
			}else {
				
				System.out.println("Not enough nomey");
			}
		}
	}
	
	
	public void nextMonth() {
		
		if(count>3) {
			
			balance = balance - 2*(count - 3);
			count = 0;
		}
		
		count = 0;	
	}	
	

}
