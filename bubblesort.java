package com.example;

import java.util.Scanner;

public class Bubblesort {
	public static void bubblesort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
			        arr[j]=arr[j+1];
			        arr[j+1]=temp;
				}   			
		}
		
	}
		
	}		
		public static void printarray(int arr[]) {
		int m=arr.length;
		for(int i=0;i<m;i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,8,2,6,4,7,9};
		bubblesort(arr);
		printarray(arr);
    
      }
}
