package com.self.sorting;

public class BubbleSort {

	
	public static void main(String[] args) {
		
		int[] arr= {23,5,-12,6,35,-22,11,27};
		
		System.out.println("unsorted:");
		/*for (int i : arr) {
			System.out.print(i+",");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				swap(arr,i,j);
			}
		}*/
		
		
		
		for(int unsortedIndex=arr.length-1;unsortedIndex>0;unsortedIndex--) {
			for(int j=0;j<unsortedIndex;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\nsorted:");
		for (int i : arr) {
			System.out.print(i+",");
		}
		
		System.out.println("bubble sort");
		
		for(int lastunsortedIndex=arr.length-1;lastunsortedIndex>0;lastunsortedIndex--) {
			for(int j=0;j<lastunsortedIndex;j++) {
				swap(arr,j,j+1);
			}
		}
		
		for (int i : arr) {
			System.out.print(i+",");
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		
		if(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
	}
}
