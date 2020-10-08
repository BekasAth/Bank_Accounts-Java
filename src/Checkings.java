
public class Checkings extends Account{
	
	int count = 0;
	
	
	public Checkings(double amount){
		
		super(amount);
	}
	
	public void deposit(double amount) {
		
		super.deposit(balance);
		
		if(count + 1 > 3) {
			
			if (balance + amount - 2 >= 0) {
				
				balance = balance + amount - 2;
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
		
		super.deposit(balance); 
		
		
		if (count + 1 > 3) {
			
			if (balance >= amount + 2) {
				
				balance = balance - amount - 2;
				count++;
			}else {
				
				System.out.println("Not enough money");
			}
		}else {
			
			if (balance >= amount) {
				
				balance = balance - amount;
			}else {
				
				System.out.println("Not enough nomey");
			}
		}
	}
	
	
	

}
