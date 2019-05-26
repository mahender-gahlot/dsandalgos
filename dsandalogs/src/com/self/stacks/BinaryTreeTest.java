package com.self.stacks;

import com.self.stacks.BinaryTree.Node;

public class BinaryTreeTest {
	
	public static void main(String[] args) {
		
		BinaryTree bt=new BinaryTree();
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
		normalTree(bt,arr,arr.length);
		
	//	bt=new BinaryTree();
	//	levelBT(bt,arr,0);
		
		//bt.print();
	
	preorderTraversal(bt.root);
	}

	private static void normalTree(BinaryTree bt, int[] arr,int size) {
		//bt.root=  normalTree(arr, size);
		
		bt.root=bst(arr,0,size-1);
	}
	
	private static Node bst(int[] arr, int start, int end) {

		Node curr=null;
		
		if(start>end) 
			return null;
		
		{
			int mid=(start+end)/2;
			curr=new Node(arr[mid]);
			//curr.value=arr[mid];
			curr.lNode=bst(arr,start,mid-1);
			curr.rNode=bst(arr,mid+1,end);
		}
		
		BTreePrinter bTreePrinter=new BTreePrinter();
		
		bTreePrinter.printNode(curr);
		
		return curr;
	}

	private static Node normalTree( int[] arr,int size) {
		
		Node cur=null;
		if(arr.length>0 && arr[0]!=0) {
		 cur=new Node(arr[size/2]);
		
		
		int[] splits=splitArray(arr,0,size/2);
		cur.lNode=normalTree( splits, size/2-1);
		
		int[] rsplits=splitArray(arr,size/2+1,size-1);
		cur.rNode=normalTree( rsplits, size/2+1);
		}
		
		return cur;
	}

	private static int[] splitArray(int[] arr,int i, int j) {
			int[] splits=new  int[arr.length/2];
			
			for(int l=0,k=i;k<j;k++,l++) {
				splits[l]=arr[k];
			}

		return splits;
	}

	private static void preorderTraversal(Node root) {
		
		if(root.lNode!=null) {
			//System.out.println(root.value);
			preorderTraversal(root.lNode);
		}
		
		System.out.print(root.value+", ");
		
		if(root.rNode!=null) {
			//System.out.println(root.value);
			preorderTraversal(root.rNode);
		}
	}

	private static void levelBT(BinaryTree bt, int[] arr, int start) {
		
		bt.root=levelBT(arr, start);
	}

	private static Node levelBT(int[] arr, int start) {
		
		int size=arr.length;
		
		Node currNode=new Node(arr[start]);
		int left=2*start+1;
		int right=2*start+2;
		
		if(left<size) {
			currNode.lNode=levelBT(arr, left);
		}
		
		if(right<size) {
			currNode.rNode=levelBT(arr, right);
		}
		
		return currNode;
	}

}
