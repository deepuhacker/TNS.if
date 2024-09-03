package person;

public class Employee extends Person {
	private String dept;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(String name, String address,String dept, double salary) {
		super(name,address);
		this.dept = dept;
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", salary=" + salary + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}

}
