package BankingSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingServiceImp implements BankingServiceInterface {
	private Map<Integer,Customer> customers = new HashMap<> ();
	private Map<Integer,Account> accounts = new HashMap<> ();
	private Map<Integer,Transaction> Transactions = new HashMap<> ();
	private Map<Integer, Beneficiary> beneficiaries = new HashMap<> ();
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customers.put(customer.getCustomerID(), customer);
	}
	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		accounts.put(account.getAccountID(), account);
		
	}
	@Override
	public void addTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		Transactions.put(transaction.getTransactionID(), transaction);
		Account account = accounts.get(transaction.getAccountID());
		if (account != null) {
			if (transaction.getType().equalsIgnoreCase("deposit")) {
				account.setBalance(account.getBalance() +transaction.getAmount());
			} else if (transaction.getType().equalsIgnoreCase("withdrawal")); {
				account.setBalance(account.getBalance() -transaction.getAmount());
				}
			}
		}
	@Override
	public void addBeneficiary(Beneficiary beneficiary) {
		// TODO Auto-generated method stub
		beneficiaries.put(beneficiary.getBeneficiaryID(), beneficiary);
	}
	@Override
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
		return customers.get(id);
	}
	@Override
	public Account findAccountById(int id) {
		// TODO Auto-generated method stub
		return accounts.get(id);
	}
	@Override
	public Transaction findTransactionById(int id) {
		// TODO Auto-generated method stub
		return Transactions.get(id);
	}
	@Override
	public Beneficiary findBeneficiaryById(int id) {
		// TODO Auto-generated method stub
		return beneficiaries.get(id);
	}
	@Override
	public List<Account> getAccountsByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		List<Account> result = new ArrayList<>();
		for (Account account : accounts.values()) {
			if(account.getCustomerID() == customerId) {
				result.add(account);
				}
			}
		return result;
	}
	@Override
	public List<Transaction> getTransactionsByAccountId(int accountId) {
		// TODO Auto-generated method stub
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : Transactions.values()) {
			if(transaction.getAccountID() == accountId) {
				result.add(transaction);
				}
			}
		return result;
	}

	@Override
	public List<Beneficiary> getBeneficiariesByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		List<Beneficiary> result = new ArrayList<>();
		for (Beneficiary beneficiary: beneficiaries.values()) {
			if(beneficiary.getCustomerID() == customerId) {
				result.add(beneficiary);
				}
			}
		return result;
	}
	
	public Collection<Account> getAllAccounts() {
		return accounts.values();
	}
	
	public Collection<Customer> getAllACustomers() {
		return customers.values();
	}
	
	public Collection<Transaction> getAllTransactions() {
		return Transactions.values();
	}
	
	public Collection<Beneficiary> getAllbeneficiaries() {
		return beneficiaries.values();
	}
}
