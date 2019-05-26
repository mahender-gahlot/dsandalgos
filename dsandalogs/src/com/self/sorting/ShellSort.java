package com.self.sorting;

public class ShellSort {
	
	public static void main(String[] args) {
		
		int[] arr= {2,5,7,8,9,1,3};
		
		
		for(int gap=arr.length/2;gap>0;gap/=2) {
			
			for(int unsortedIndex=gap;unsortedIndex<arr.length ;unsortedIndex++) {
				
				int insertionElement=arr[unsortedIndex];
				int i=unsortedIndex;
				
				for(;i>=gap && insertionElement<arr[i-gap];i-=gap) {
					arr[i]=arr[i-gap];
				}
				
				arr[i]=insertionElement;
				
			
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
	}

}
