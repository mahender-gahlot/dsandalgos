package com.self.stacks;

import java.util.LinkedList;

public class JavaLinkedList {

	public static void main(String[] args) {
	
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(1);
		list.addFirst(2);
		list.addLast(3);
		list.add(4);
		list.addFirst(5);
		list.addLast(6);
		
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.remove(2);
		
		System.out.println(list);
		
		/*for (Integer integer : list) {
			System.out.println(integer);
		}*/
	}
}
