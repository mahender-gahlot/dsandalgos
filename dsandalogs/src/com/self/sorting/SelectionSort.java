package com.self.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr= {1,3,-22,55,7,-15};
		
		for(int lastsortedInex=arr.length-1;lastsortedInex>0;lastsortedInex--) {
			int selectedMaxPos=0;
			for(int i=1;i<=lastsortedInex;i++) {
				if(arr[selectedMaxPos]<arr[i]) {
					selectedMaxPos=i;
				}
			}
			swap(arr,selectedMaxPos,lastsortedInex);
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
