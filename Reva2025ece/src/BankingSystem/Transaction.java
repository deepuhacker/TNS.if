package BankingSystem;

import java.time.LocalDateTime;

public class Transaction {
	private static int idCounter = 1;
	private int transactionID;
	private int accountID;
	private String typr;
	private double amount;
	private LocalDateTime timestamp;
	
	//constructor,getters,setters
	public Transaction(int transactionID, int accountID, String type, double amount, LocalDateTime timestamp) {
		this.transactionID = transactionID;
		this.accountID = accountID;
		this.typr = typr;
		this.amount = amount;
		this.timestamp = timestamp;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public int getAccountID() {
		return accountID;
	}

	public String getType() {
		return typr;
	}

	public double getAmount() {
		return amount;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}
}
