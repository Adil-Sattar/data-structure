package data_structure;

public class MaxElement {

	public static void main(String[] args) {
		int[] arr = {1 , 7 , 8 , 10 , 6 };
		int maximum = maxValue(arr);
		System.out.println("Maximum Value is: " + maximum);
	}
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length - 1; i++) {
			if(max < arr[i + 1]) {
				max = arr[i + 1];
			}
		}
		
		return max ;
	}

}
