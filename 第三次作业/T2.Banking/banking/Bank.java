package banking;

public class Bank {
	Customer customers[];
	public int numberOfCustomers;
	
	public Bank(){
		customers = new Customer[5];
	}
	public void addCustomer(String f, String l){
		customers[numberOfCustomers] = new Customer(f,l);
		numberOfCustomers ++;
	}
	public int getNumOfCustomers(){
		return numberOfCustomers;
	}
	public Customer getCustomer(int num){
		return customers[num];
	}
}
