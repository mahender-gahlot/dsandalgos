package com.self.sorting;

public class CountingSort {
	
	public static void main(String[] args) {
		
		
		int[] arr= {2,5,3,6,4,2,1,9};
		
		
		int[] countArr=new int[10];
		
		
		for (int i = 0; i < arr.length; i++) {
			
			countArr[arr[i]]++;
		}
		int k=0;
		for (int i = 0; i <10; i++) {
			if(countArr[i]>0) {
				for (int j = 1; j <= countArr[i]; j++) {
					arr[k++]=i;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
