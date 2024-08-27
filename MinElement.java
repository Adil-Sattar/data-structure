package data_structure;

public class MinElement {

	public static void main(String[] args) {
		int[] arr = {15, 7 , 2 , 10 , 6 };
		int minimum = minValue(arr);
		System.out.println("Minimum Value is: " + minimum);
	}
	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length - 1; i++) {
			if(min > arr[i + 1]) {
				min = arr[i + 1];
			}
		}
		
		return min ;
	}

}
