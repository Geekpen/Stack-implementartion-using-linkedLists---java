package ImplementationUsingLinkedList;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack numbers =  new Stack();
		numbers.stackAdd(1);
		numbers.stackAdd(2);
		numbers.stackAdd(3);
		numbers.stackAdd(4);
		numbers.stackAdd(5);
		
		numbers.stackPrint();
		
		numbers.stackRemove();
		numbers.stackPrint();
		
		numbers.stackRemove();
		numbers.stackPrint();
		
		numbers.stackRemove();
		numbers.stackPrint();
		
		numbers.stackRemove();
		numbers.stackPrint();
		
		numbers.stackRemove();
		numbers.stackPrint();
		
		numbers.stackRemove();
		numbers.stackPrint();

	}

}
