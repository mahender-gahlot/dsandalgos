package com.self.stacks;

public class Queue {

	int[] queue;
	
	int front;
	
	int rear;
	
	int size;
	public Queue(int size) {
		front=-1;
		rear=0;
		this.size=size;
		queue=new int[size];
	}
	
	public void enqueue(int add) {
		front++;
		queue[front]=add;
		
	}
	
	public int dequeue() {
		int ret=queue[rear];
		rear ++;
		return ret;
	}
	
	void print() {
		System.out.println(front);
		for (int i : queue) {
			System.out.print("|"+i+"|");
		}
		System.out.println("");
		System.out.println(rear);
	}
	
	public static void main(String[] args) {
		Queue qu=new Queue(10);
		
		qu.enqueue(10);
		qu.enqueue(20);
		qu.enqueue(30);
		qu.enqueue(40);
		
		qu.print();
		
		System.out.println(qu.dequeue());
		
		qu.print();
		
		System.out.println(qu.dequeue());
		
		qu.enqueue(50);
		qu.enqueue(60);
		
		qu.print();
		
	}
}
