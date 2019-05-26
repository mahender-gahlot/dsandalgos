package com.self.heap;

public class CreateHeap {

	static int[] arr= new int[16];
	static int size;
	
	public static void main(String[] args) {
		
		
		int[] array	=	{1,2,3,4,5};
		
		size=array.length;
		//we	do	not	use	0	index			
		System.arraycopy(array,	0,	arr,	1,	array.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);	
		}
		
		
		for (int i = size/2; i>0; i--) {
			percolate(i);
		}
		
	//	System.arraycopy(arr,	0,	array,	0,	array.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);	
		}
		
		
	}

	private static void percolate(int position) {
		int lChild = 2 * position;
		int rChild = lChild + 1;
		int small = -1;
		int temp;
		
		if (lChild <= size)
			small = lChild;

		if (rChild <= size && (arr[rChild] - arr[lChild]) < 0)
			small = rChild;

		if (small != -1 && (arr[small] - arr[position]) < 0) {
			temp = arr[position];
			arr[position] = arr[small];
			arr[small] = temp;
			percolate(small);
		}
	}
		
			
	
}
