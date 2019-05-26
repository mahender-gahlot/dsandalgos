package com.self.stacks;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] arr= {3,1,7,4,9,2,5,8};
		
		insertionSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

	private static void insertionSort(int[] arr) {

		int i,j,temp;
		for( i=1;i<arr.length;i++) {
			
			 temp=arr[i];
			 System.out.println("starting top loop temp "+i+" vlaue is "+arr[i]);
			for( j=i;j>0 && arr[j-1]>temp;j--) {
				System.out.println("moving postion "+(j-1) +"to"+j);
					arr[j]=arr[j-1];
				
	
			}
			System.out.println("end of top loop j postion is "+j+ "j value is "+temp);
			System.out.println("****************************************");
			arr[j]=temp;	
			
		}
		
	}

	private static void swap(int a, int b) {
		int temp1=a;
		 a=b;
		 b=a;
		
		
	}

}
