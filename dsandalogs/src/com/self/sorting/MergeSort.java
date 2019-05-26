package com.self.sorting;

public class MergeSort {

	public static void main(String[] args) {
		
		
		int[] arr= {3,6,2,7,22,17,12,5,27,33};
		
		sort(arr,0,arr.length);
		
		for (int i : arr) {
			System.out.println(arr[i]);
		}
		
	}

	private static void sort(int[] arr, int i, int length) {

		if(length-i<2) {
			return;
		}

		int mid=(i+length)/2;
		sort(arr,i,mid);
		
		sort(arr,mid,length);
		
		 merge(arr,i,mid,length);
		
		
	}

	private static void merge(int[] input,int start, int mid,int end) {
		
		if(input[mid-1]<=input[mid]) {
			return;
		}
		
		
		int[] temp=new int[end-start];
		
		int i=start;
		int j=mid;
		
		int k=0;
		while(i<mid && j<end) {
			temp[k++]=input[i]<=input[j]?input[i++]:input[j++];
		}
		
		System.arraycopy(input, i, input, start+k, mid-i);
		System.arraycopy(temp,0, input, start,k);
		
		
	}
}
