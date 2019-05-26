package com.self.sorting;

public class InsertionSort {

	public static void main(String[] args) {
	
		
		int[] arr= {22,-2,55,6,46,2,9};
		
		
		
		
	 for(int firstUnordererIndex=1;firstUnordererIndex<arr.length;firstUnordererIndex++) {
		 
		 int newElement=arr[firstUnordererIndex];
		 int sortedIndex=firstUnordererIndex;
		 for(;sortedIndex>0 && newElement<arr[sortedIndex-1];sortedIndex--) {
			 
				 arr[sortedIndex]=arr[sortedIndex-1];
			 
		 }
		 
		 arr[sortedIndex]=newElement;
	 }
		
	 for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+",");
	}
	 System.out.println("");
		
		
		
		
		for(int firstUnsortedIndex=1;firstUnsortedIndex<arr.length;firstUnsortedIndex++) {
			int insertionElement=arr[firstUnsortedIndex];
			
			int i;
			for( i=firstUnsortedIndex;i>0 && arr[i-1]>insertionElement ;i--) {
				
					arr[i]=arr[i-1];
				
			}
			arr[i]=insertionElement;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	static void swap(int[] arr,int i,int j) {
		if(i==j) {
			return;
		}
		
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
