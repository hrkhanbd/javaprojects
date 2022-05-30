package bb.loans.carloans;

public interface Bb {
	
int x = 10;
	
	public void withdrawl();
	public void deposit();
	
	
	  public static void main(String[] args) {
		  
		  //Bb b1 = new Bb
	  
		  Bb b;
		  
		  b = new SCB(); 
		  b.withdrawl(); 
		  b.deposit();
		  
		  
		  b = new DBBL(); 
		  b.withdrawl(); 
		  b.deposit();
	  
	  }	
	

}
