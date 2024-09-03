package BankingSystem;

import java.util.Collection;
import java.util.List;
public interface BankingServiceInterface {
	void addCustomer(Customer customer); 
	void addAccount(Account account); 
	void addTransaction(Transaction transaction); 
	void addBeneficiary(Beneficiary beneficiary); 
	Customer findCustomerById(int id); 
	Account findAccountById(int id); 
	Transaction findTransactionById(int id); 
	Beneficiary findBeneficiaryById(int id);
	List<Account> getAccountsByCustomerId(int customerId); 
	List<Transaction> getTransactionsByAccountId(int accountId); 
	List<Beneficiary> getBeneficiariesByCustomerId(int customerId);
}
 