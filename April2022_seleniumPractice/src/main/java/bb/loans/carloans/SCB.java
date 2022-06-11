package bb.loans.carloans;

public class SCB implements Bb {

	public void withdrawl() {
		
		System.out.println(" I am implementing Bb interface method withdrawal in SCB");
		
	}

	public void deposit() {
		
		System.out.println(" I am implementing Bb interface method deposit in SCB");
		
	}
	
	public static void main(String[] args) {
		
		SCB s = new SCB();
		s.withdrawl();
		s.deposit();
	}
	

}
