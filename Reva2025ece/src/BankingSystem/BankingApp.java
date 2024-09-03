package BankingSystem;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
public class BankingApp {

	private static final Transaction[] accountTransaction = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingServiceImp bankingService = new BankingServiceImp();
		int accountID = 0;
		int customerID;
		String type;
		double balance;
		int beneficiaryID;
		String name;
		String accountNumber;
		String bankDetails;
		String address;
		String contact;
		int transactionID = 0;
		double amount;
		int ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Banking App");
			System.out.println("1. Add Customers:");
			System.out.println("2. Add Accounts:");
			System.out.println("3. Add Beneficiary:");
			System.out.println("4. Add Transaction:");
			System.out.println("5. Find Customer by Id:");
			System.out.println("6. List all Accounts of specfic Customer:");
			System.out.println("7. List all transactions of specfic Account:");
			System.out.println("8. List all beneficiaries of specfic Customer:");
			System.out.println("9. Eixt:");
			System.out.println("Enter your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
			System.out.println("Enter Customer Details");
			System.out.print("Customer Id : ");
			customerID = sc.nextInt();
			System.out.print("Name : ");
			sc.nextLine(); // To consume the newline
			name = sc.nextLine();
			System.out.print("Address : ");
			address = sc.nextLine();
			System.out.print("Contact No. : ");
			contact = sc.nextLine();
			Customer c = new Customer(customerID, name, address, contact);
			bankingService.addCustomer(c);
			break;

			case 2:
			System.out.println("Enter Account Details");
			System.out.print("Account Id : ");
			accountID = sc.nextInt();
			System.out.print("Customer Id : ");
			customerID = sc.nextInt();
			sc.nextLine(); // To consume the newline
			System.out.print("Account Type Saving/Current : ");
			type = sc.nextLine();
			System.out.print("Balance : ");
			balance = sc.nextDouble();
			Account acc = new Account(accountID, customerID, type, balance);
			bankingService.addAccount(acc);
			break;
			
			case 3:
				System.out.println("Enter Beneficiary Details");
				System.out.print("Customer Id : ");
				customerID = sc.nextInt();
				System.out.print("Beneficiary Id : ");
				beneficiaryID = sc.nextInt();
				System.out.print("Beneficiary Name : ");
				sc.nextLine(); // To consume the newline
				name = sc.nextLine();
				System.out.print("Beneficiary Account No. : ");
				accountNumber = sc.nextLine();
				System.out.print("Beneficiary Bank details : ");
				bankDetails = sc.nextLine();

				Beneficiary b = new Beneficiary(customerID, beneficiaryID, name, accountNumber, bankDetails);
				bankingService.addBeneficiary(b);
				break;
				
			case 4:
				System.out.println("Enter Transaction Details");
				System.out.print("Account Id : ");
				accountID = sc.nextInt();
				System.out.print("Type (Deposit/Withdraw) : ");
				sc.nextLine(); // To consume the newline
				type = sc.nextLine();
				System.out.print("Account Amount : ");
				amount = sc.nextDouble();
				LocalDateTime LocalDateTime = null;
				Transaction t = new Transaction(transactionID, accountID,type, amount, LocalDateTime); 
				bankingService.addTransaction(t);
				break;
			case 5:
				for (Customer customer : bankingService.getAllACustomers()) {
						System.out.println("Cutomer ID: " + customer.getCustomerID() + ",Name:" + customer.getName());
				}
				System.out.print("Customer Id:"); 
				customerID = sc.nextInt();
				Customer foundCustomer = bankingService.findCustomerById(customerID);
				System.out.println("Customer:" + foundCustomer.getName());
				break;
				
				case 6:
					for(Account account : bankingService.getAllAccounts()) {
						System.out.println("AccountID:" +account.getAccountID() +", Customer ID:" +account.getCustomerID()+",Balance:"+ account.getBalance());
					}
					System.out.println("Customer Id:");
					customerID = sc.nextInt();
					
					List<Account> customerAccounts = bankingService.getAccountsByCustomerId(customerID);
					System.out.println("Accounts for Customer ID:" +customerID);
					for(Account account : customerAccounts) {
						System.out.println("Account ID:" +account.getAccountID() +",Balance:" +account.getBalance());
					}
					break;
				case 7:
					System.out.println("Account Id:");
					customerID = sc.nextInt();
					

					System.out.println("Transaction for Account ID:" +accountID);
					for(Transaction transaction : accountTransaction) {
						System.out.println("Transaction ID:" +transaction.getTransactionID() +",Type:" +transaction.getType() +",Amount:" +transaction.getAmount() +",Timestamp:" +transaction.getTimestamp());
					}
					break;
				case 8:
					System.out.println("Beneficiary Id:");
					customerID = sc.nextInt();
					
					List<Beneficiary> customerBeneficiaries = bankingService.getBeneficiariesByCustomerId(customerID);
					System.out.println("Beneficiaries for Customer ID:" +customerID);
					for(Beneficiary beneficiary : customerBeneficiaries) {
						System.out.println("Beneficiary ID:" +beneficiary.getBeneficiaryID() +",Name:" +beneficiary.getName());
						}
					break;
				case 9:
					System.out.println("Thank You!");
					break;
				default:
					System.out.println("Invalid Choice");
					}
			} while (ch !=9);
		}
	}

