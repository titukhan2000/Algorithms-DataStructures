package StacksNQueues;

import java.util.Iterator;
import java.util.Stack;

public class SortStackRecursively1 {

	static Stack<Integer> stack= new Stack<Integer>();
	static Stack<Integer> tempStack= new Stack<Integer>();
	static Stack<Integer> sortedStack=new Stack<Integer>();
	static int maxSize=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeStack(stack);
		System.out.println(stack.peek());
		maxSize=stack.size();
		sortStack(stack.pop(),stack,tempStack);
		Iterator<Integer> itr= sortedStack.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(sortedStack.peek());
	}
	public static void initializeStack(Stack<Integer> stack) {
		
		stack.push(30);
		stack.push(-5);
		stack.push(18);
		stack.push(14);
		stack.push(-3);
	}
	public static void reInitialize(Stack<Integer> stack, Stack<Integer> tempStack) {
	
		while(!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}
	}
	
	
	public static void sortStack(int val,Stack<Integer> stack,Stack<Integer> tempStack) {
		
				
		if(stack.isEmpty()) {
			sortedStack.push(val);
			reInitialize(stack,tempStack);
			val=stack.pop();
		}
		if(!stack.isEmpty()) {
		if(Math.abs(val) < Math.abs(stack.peek())) {
			int adjacentVal=stack.pop();
			stack.push(val);
			stack.push(adjacentVal);
			val=adjacentVal>val ? adjacentVal:val;
			if(!stack.isEmpty())
				sortStack(stack.pop(),stack,tempStack);
		}else {
			tempStack.push(val);
			if(!stack.isEmpty())
				sortStack(stack.pop(),stack,tempStack);
		}
		}else {
			sortedStack.push(val);
			return;
		}
		
		
		
		
	}
}
