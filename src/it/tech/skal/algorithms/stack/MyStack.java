package it.tech.skal.algorithms.stack;

import java.util.Arrays;

public class MyStack {
	
	private String[] stackArray;
	
	private int maxStackSize;
	
	private int topOfStack = -1;
	
	public MyStack(int size) {
		maxStackSize = size;
		stackArray = new String[maxStackSize];
		Arrays.fill(stackArray, "-1");
	}
	
	public void push(String element){
		if(topOfStack < maxStackSize){
			topOfStack++;
			stackArray[topOfStack] = element;			
		} else { System.out.println("Max size reached");}
		
	}
	
	public void pushMany(String multipleValues){
		String[] tempString = multipleValues.split(" ");
		
		for(int i = 0; i < tempString.length; i++){
			
			push(tempString[i]);
			
		}
	}
	
	public String pop(){

		String popString ="";
		if(topOfStack > -1){
			System.out.println("Element at popped out:"+topOfStack);
			popString = stackArray[topOfStack];
			stackArray[topOfStack] = "-1";
			topOfStack--;			
		} else {
			System.out.println("No element present to pop out");
		}
		
		return popString;
	}
	
	public void popAll(){
		for (int i = topOfStack; i >= 0; i--) {
			pop();
		}
	}
	
	public String peek(){
		
		return stackArray[topOfStack];
	}
	
	public void displayTheStack(){
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < maxStackSize; n++){
			
			System.out.format("| %2s "+ " ", n);
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < maxStackSize; n++){
			
			
			
			if(stackArray[n].equals("-1")) System.out.print("|     ");
			
			else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
	
}
	
	public static void main(String args[]){
		MyStack myStack = new MyStack(10);
		myStack.push("10");
		myStack.push("18");
		myStack.push("18");
		myStack.pushMany("20 16 16 08");
		myStack.displayTheStack();
		/*myStack.pop();
		myStack.displayTheStack();*/
		myStack.peek();
		myStack.displayTheStack();
		myStack.popAll();
		myStack.displayTheStack();
	}

}
