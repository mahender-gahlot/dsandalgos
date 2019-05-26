package com.self.stacks;

public class BinaryTree {

	Node root=new Node(0,null,null);
	public BinaryTree() {
		
		
	}
	
	public static class Node{
		
		int value;
		Node lNode;
		Node rNode;
		
		public Node(int value) {
			this.value=value;
		}
		
		public Node(int value,Node l,Node r) {
			this.value=value;
			lNode=l;
			rNode=r;
		}
		
	}

	public void print() {
		
		print(root);
		
		
	}

	private void print(Node node) {
		
		System.out.println(node.value+", ");
		
		if(node.lNode!=null) {
			print(node.lNode);
		}
		
		if(node.rNode!=null) {
			print(node.rNode);
		}
		
	}
	
	
	
	
}
