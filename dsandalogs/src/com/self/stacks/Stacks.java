package com.self.stacks;

public class Stacks {
	
	int[] stacks;
	
	int top;
	
	int size=100;
	
	public Stacks() {
		top=-1;
		stacks=new int[100];
	}
	
	public Stacks(int size) {
		this.size=size;
		top=-1;
		stacks=new int[size];
	}
	
	public void push(int value) {
		top++;
		stacks[top]=value;
	}
	
	public int pop() {
		int retValue= stacks[top];
		top--;
		return retValue;
				
	}

	public boolean isFull() {
		return (top+1)==size;
	}
	
	public void printStack() {
		for (int i : stacks) {
			System.out.print("|"+i+"|");
					}
		System.out.println("");
		
	}
	
	public static void main(String[] args) {
		
		Stacks st=new Stacks(10);
		
		st.push(10);
		st.push(30);
		st.push(40);
		
		st.printStack();
		
		System.out.println(st.pop());
		
		st.printStack();
		
	}
}
