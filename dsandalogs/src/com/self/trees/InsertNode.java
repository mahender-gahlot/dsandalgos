package com.self.trees;

public class InsertNode {
	
	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		
		Tree bt=new Tree();
		
		Node n =buildBt(bt,arr,0,arr.length);
		
		System.out.println(n);
		
		
				
				
		}

	private static Node buildBt(Tree bt, int[] arr, int i, int length) {
	return buildBt(arr,i,length);
		
	}

	private static Node buildBt(int[] arr,int start,int end) {
		Node n=null;
		if(start<end) {
			int mid=(start+end)/2;
			n=new Node();
			n.value=arr[mid];
			n.left=buildBt(arr,start,mid-1);
			n.right=buildBt(arr,mid+1,end);
			
		
		
	}
		return n;
	}

}
