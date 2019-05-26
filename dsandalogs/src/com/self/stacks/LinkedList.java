package com.self.stacks;

public class LinkedList {

	private Node head;
	
	
	class Node{
		Node(int value,Node link){
			this.value=value;
			this.link=link;
		}
		int value;
		Node link;
	}
	
	public LinkedList() {
		head=new Node(0,null);
	}
	
	public LinkedList(int item) {
		head=new Node(item,null);
	}
	
	public void add(int value) {
		Node newNode=new Node(value,null);
		newNode.link=head;
		head=newNode;
		
	}
	
	public void printLinkedList() {
		Node z=head;
		while(z!=null) {
			System.out.print(","+z.value);
			z=z.link;
		}
	}
	
	public void delete(int item) {
		Node z=head;
		Node z1=head.link;
		while(z1!=null) {
			//System.out.println(","+z1.value);
			if(z1.value==item) {
				z.link=z1.link;
			}
			
			z=z.link;
			z1=z.link;
		}
	}
	
	public void sortList() {

		Node z=head;
		Node z1=head.link;
		while(z1!=null) {
			//System.out.println(","+z1.value);
			if(z1.value<z.value) {
				Node temp;
				temp=z1.link;
				z1.link=z.link;
				z.link=temp;
			}
			
			z=z.link;
			z1=z.link;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList li=new LinkedList(2);
		
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		
		li.printLinkedList();
		
		//li.delete(4);
		li.sortList();
		System.out.println("");
		li.printLinkedList();
	}
}
