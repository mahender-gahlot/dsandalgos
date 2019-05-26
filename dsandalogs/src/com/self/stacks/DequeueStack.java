package com.self.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueStack {

	public static void main(String[] args) {
		
		Deque<Integer> d=new ArrayDeque<>();
		
		d.addFirst(1);
		d.removeLast();
		d.size();
		d.add(2);
		d.addLast(5);
		d.getLast();
		d.isEmpty();
		d.contains(3);
		d.peek();
		d.peekFirst();
		d.poll();
		d.push(5);
		d.pop();
		
	}
}
