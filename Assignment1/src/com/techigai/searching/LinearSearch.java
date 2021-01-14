package com.techigai.searching;

import java.util.Scanner;

public class LinearSearch {
	
	public static boolean linearSearch(int arr[],int size,int key) {
		
		for(int i = 0;i < size;i++) {
			if(arr[i] == key)
				return true;
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
		if(linearSearch(arr,size,key)){
			System.out.println("Key is found");
		}
		else {
			System.out.println("Key is not found");
		}
		scan.close();
	}
}
