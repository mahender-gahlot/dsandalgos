package com.self.stacks;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr= {1,5,7,13,25,30};
		
		int low=0;
		int high=arr.length-1;
		int search=27;
		int median=0;
		while(low<=high) {
		
			 median=low +(high-low)/2;
			
			if(arr[median]==search) {
				System.out.println("found");
				break;
			}else if(search<arr[median]) {
				high=median-1;
			}else {
				low=median+1;
			}
			
					}
	}

}
