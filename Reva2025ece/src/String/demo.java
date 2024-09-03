package String;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "REVA";
		String s1 = new String(" Reva  ");
		String s2 = "UNIVERSITY";
		String s3 = "......Bengaluru";
		
		System.out.println("comaparision using ==:" +s==s1);
		System.out.println("comaparision using equals:" +s.equals(s1));
		System.out.println("comaparision using compareTO:" +s.compareTo(s1));
		System.out.println("comaparision using length:" +s.length());
		System.out.println("comaparision using uppercase:" +s.toUpperCase());
		System.out.println("comaparision using lowercase:" +s.toLowerCase());
		System.out.println("comaparision using concat:" +s.concat(s2));
		System.out.println("comaparision using concat:" +s1.concat(s3));
		System.out.println("comaparision using concat:" +s1.substring(3));
		System.out.println("comaparision using concat:" +s1.trim());
		System.out.println("comaparision using concat:" +s1.strip());
		System.out.println("comaparision using concat:" +s1.stripTrailing());
		System.out.println("comaparision using concat:" +s1.isEmpty());
		
	}

}      
