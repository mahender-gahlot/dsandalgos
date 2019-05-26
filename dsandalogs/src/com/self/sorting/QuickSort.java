package com.self.sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] arr= {1,3,-22,55,7,-15};
		
		int i=0;
		int j=arr.length;
		int pivot=arr[i];
		
		sort(arr,i,j);
				
			for (int k = 0; k < arr.length; k++) {
				System.out.println(arr[k]);
			}
	}

	private static void sort(int[] arr, int i, int j) {
		
		if(j-i<2) {
			return;
		}
		
		int pivotIndex=partition(arr,i,j);
		
		sort(arr,i,pivotIndex);
		sort(arr,pivotIndex+1,j);
		
	}

	private static int partition(int[] arr, int i, int j) {
		
		int pivot=arr[i];
		while(i<j) {
			
			while( j>i && arr[--j]>=pivot ) {
			//--j;
				
			}
			
			if(i<j)
			arr[i]=arr[j];
			
			while( i<j && arr[++i]<=pivot ) {
				//i++;
		}
			if(i<j)
			arr[j]=arr[i];
		}
		
		arr[j]=pivot;
return j;

	}
	
	
	
	

}
