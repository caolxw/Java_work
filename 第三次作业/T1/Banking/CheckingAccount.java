package T1.Banking;

public class CheckingAccount extends Account {
	private double overdraftProtection;
	
	public CheckingAccount (double balance){
		super(balance);
	}
	public CheckingAccount (double balance, double protect){
		super(balance);
		overdraftProtection = protect;
	}
	public boolean withdraw(double amount) {
	    boolean result = true;
	    if ( balance > amount ) {
	    	balance = balance - amount;
	      result = true;
	    } 
	    else if(overdraftProtection < 0 || amount > overdraftProtection){
	    	result = false; 
	    }
	    else{
	    	overdraftProtection = overdraftProtection + (balance-amount);
	    	balance = 0;
	    	result = true;
	    }
	    return result;
   }
}
