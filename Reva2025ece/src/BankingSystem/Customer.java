package BankingSystem;

public class Customer {
	private int customerID;
	private String name;
	private String address;
	private String contact;
	
	//constructor,getters,setters
	public Customer(int customerID,String name,String address,String contact) {
		this.customerID = customerID;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
