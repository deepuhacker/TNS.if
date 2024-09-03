package Arrays;

public class Additon2matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{3,6,2},{5,7,9}};
		
		int c[][] = new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j]*b[i][j];
			System.out.println(c[i][j]+""); 
		}
		System.out.println();
	}

}}
