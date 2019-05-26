package com.self.stacks;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] arr= {8,3,7,1,5,9,2,6};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			max=arr[i];
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>max) {
					max=arr[j];
				}
			}
			arr[arr.length-1-i]=max;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
	}

}
