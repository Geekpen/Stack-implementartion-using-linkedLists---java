package ImplementationUsingLinkedList;

import java.util.LinkedList;

public class Stack {
	//assuming this is going to be a stack of int values
	LinkedList<Integer> myStack = new LinkedList<Integer>();
	
	public void stackAdd(int data) {
		myStack.addLast(data);
	}
	
	public void stackRemove() {
		if(myStack.size() != 0) {
			myStack.removeLast();
		}else {
			System.out.println("The stack is empty");
		}
		
	}
	
	
	public void stackPrint() {
		//last in first out
		for(int i =  myStack.size() - 1; i > -1; i --) {
			System.out.print(myStack.get(i) + " ");
		}
		System.out.println();
	}
	
	

}
