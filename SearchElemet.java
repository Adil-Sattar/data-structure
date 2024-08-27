package data_structure;

import java.util.Scanner;

public class SearchElemet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		 
		int[] arr = {1 , 7 , 8 , 10 , 6 };
		
		System.out.println("Enter Search Element");
		int element = scanner.nextInt();
		int index = searchIndex(arr , element);
		if(index != 0) {
			System.out.println("Element Available at index: " + index);
		}else {
			System.out.println("Element Not Available in Array");
		}
		
		scanner.close();
		
	}
	
	public static int searchIndex(int[] arr , int element) {
		int index = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == element) {
				index = i;
				break;
			}
		}
		
		return index;
	}

}
