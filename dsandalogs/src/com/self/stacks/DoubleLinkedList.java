package com.self.stacks;

import java.util.List;

public class DoubleLinkedList {

	Node head;
	
	class Node {
		Node prev;
		Node next;
		int value;
	}
	
	
	public DoubleLinkedList() {
		head =new Node();
		head.prev=null;
		head.next=null;
		head.value=0;
	}
	public void add(int i) {
		if(head.next==null) {
			Node newNode=new Node();
			newNode.value=i;
			newNode.next=null;
			newNode.prev=head;
			
			head.next=newNode;
		}else {
			Node newNode=new Node();
			newNode.value=i;
			newNode.next=head.next;
			newNode.prev=head;
			head.next=newNode;
					
		}
	}
	
	public void printList() {
		Node z=head;
		while(z.next!=null) {
			System.out.print("|"+z.value);
			z=head.next;
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		DoubleLinkedList l=new DoubleLinkedList();
		
		for (int i=1;i<10;i++) {
			l.add(i);
			
		}
		l.printList();
	}
}
