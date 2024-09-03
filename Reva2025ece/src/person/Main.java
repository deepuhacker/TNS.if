package person;

public class Main {

	public static void main(String[] args) {
			Person p ;
			
			p = new Student("Deepak","bangalore","R21EN016","ECE");
		
			 if (p instanceof Student)
			 System.out.println(p);
			 
			 p = new Employee("Rajendra","Bangalore","IT",1000000);
			 if( p instanceof Employee)
				 System.out.println(p);
			 }
	}
