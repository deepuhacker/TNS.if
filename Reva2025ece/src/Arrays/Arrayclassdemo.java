package Arrays;

import java.util.Arrays;

public class Arrayclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,7,8,36,87,56,86,45,45,98,96};
		
		
		System.out.println("array elements are" +Arrays.toString(arr));
		//sorting
		Arrays.sort(arr);
		System.out.println("array elements are:" +Arrays.toString(arr));
		
		//binary search
		
		System.out.println("array elements are" +Arrays.binarySearch(arr, 0, 10, 45));


	}

}
