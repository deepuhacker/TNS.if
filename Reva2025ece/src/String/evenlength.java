package String;

public class evenlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "This is a java language";
		        
		        // Split the sentence into words
		        String[] s2= s1.split("\\s+");

		        System.out.println("print even length:");
		        for (String s3 : s2) {
		            if (s3.length() % 2 == 0) {
		                System.out.println(s3);
		            }
		        }
		    }
		}