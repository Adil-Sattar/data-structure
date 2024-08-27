package data_structure;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {1 , 2 , 3 , 4 , 5 };
		int[] reverseArr = reverseArray(arr);
		
		System.out.println("Before Reverse");
		System.out.println("");

		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println("");
	
		System.out.println("--------------------------");
		System.out.println("");
	
		System.out.println("After Reverse");

		System.out.println("");

		for(int i = 0 ; i < reverseArr.length; i++) {
			System.out.print(reverseArr[i]);
		}
		
		
	}
	public static int[] reverseArray(int[] arr) {
		int[] reverseArray = new int[arr.length];
		for(int i = 0   ; i < arr.length; i++ ) {
		
			reverseArray[i] = arr[arr.length - i- 1];
		}
		return reverseArray;
		
	}
	

}
