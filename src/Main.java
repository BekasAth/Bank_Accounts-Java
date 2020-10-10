
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Savings a1 = new Savings("a1",0.5);
		Checkings a2 = new Checkings("a2",100);
		
		a1.deposit(10000);
		a1.transport(2000, a2);
		
		a2.withdrawal(1500);
		a2.withdrawal(80);
		a1.transport(1000, a2);
		
		a2.withdrawal(400);
		
		a1.nextMonth();
		
		a2.nextMonth();
		
		a1.printData();
		a2.printData();
	
		
		

	}

}
