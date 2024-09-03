package BankingSystem;

public class Account {
	private int accountID;
	private int customerID;
	private String type;
	private double balance;
	
	//constructor,getters,setters
	public Account(int accountID, int customerID, String type, double balance) {
		this.accountID = accountID;
		this.customerID = customerID;
		this.type = type;
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountID() {
		return accountID;
	}

	public int getCustomerID() {
		return customerID;
	}
}
