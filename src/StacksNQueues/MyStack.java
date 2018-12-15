package StacksNQueues;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class MyStack extends Stack<Integer> {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public MyStack() {
		super();
	}
	
	
	public  boolean isEmpty() {
		return super.isEmpty();
	}
	
	public Integer peek() {
		return super.peek();
	}
	
	public  void push(int value) {
		super.push(value);
		
	}
	
	public int popValue() {
		return super.pop();
	}
  public  void display() {
	  Iterator itr= super.iterator();
	  while(itr.hasNext()) {
		  System.out.println(((Integer)itr.next()).toString());
	  }
  }

}
