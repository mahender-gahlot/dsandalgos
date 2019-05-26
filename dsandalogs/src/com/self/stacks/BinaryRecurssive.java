package com.self.stacks;

public class BinaryRecurssive {

	public static void main(String[] args) {
		
		int[] arr= {1,4,7,13,17,19};
		
		int low=0;
		int high=arr.length;
		
		int search=2;
		
		int found=binarySearch(arr,low,high,search);
		System.out.println(found);
	}

	private static int binarySearch(int[] arr, int low, int high,int search) {
		int median=low+(high-low)/2;
		if(low>high) {
			return -1;
		}
		
		if(arr[median]==search) {
			return 1;
		}else if(arr[median]>search) {
			high=median-1;
		}else {
			low=median+1;
		}
		
		binarySearch(arr, low, high,search);

		
		return -1;
	}
}
