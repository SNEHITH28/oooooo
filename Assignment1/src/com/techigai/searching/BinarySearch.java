package com.techigai.searching;

import java.util.Scanner;

public class BinarySearch {
	
	public static boolean binarySearch(int[] arr, int size, int key) {
		
		int low = 0,high = size - 1;
		while(low < high) {
			int mid = (low + high) / 2;
			if(arr[mid] == key)
				return true;
			else if(arr[mid] < key)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int key = scan.nextInt();
		int arr[] = new int[size];
		for(int i = 0;i < size;i++) {
			arr[i] = scan.nextInt(); 
		}
		if(binarySearch(arr,size,key)){
			System.out.println("Key is found");
		}
		else {
			System.out.println("Key is not found");
		}
		scan.close();
	}
}
