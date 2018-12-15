package StacksNQueues;

public class ImplementStackAsQueue {
	public static int[] stack= new int[10];
	public static int[] tempStack=new int[10];
	public static int noOfElements=0;
	public static int noOfTempElements=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=0;x<10;x++)
			push(x*2);
		display();
		popout();
		popout();
		popout();
	}
	
	public static void popout() {
		tempStack=new int[10];
		noOfTempElements=0;
		while(!isEmpty()) {
			int val = pop();
			pushTempStack(val);
		
		}
		System.out.println(	getTopOfTempStack());
	}
	
	public static void pushTempStack(int val) {
		tempStack[noOfTempElements]=val;
		noOfTempElements++;
	}

	public static boolean isFull() {
		if(noOfElements==stack.length)
			return true;
		
		return false;
	}
	
	public static boolean isEmpty() {
		if(noOfElements==0)
			return true;
		return false;
	}
	
	public static void peek() {
		if(noOfElements==stack.length)
			System.out.println("peek"+stack[noOfElements-1]);
		else
			System.out.println("peek else"+ stack[noOfElements]);	
	}
	
	public static void push(int value) {
		if(!isFull()) {
			stack[noOfElements]=value;
			noOfElements++;
		}else {
			System.out.println("Stack is full");
		}
		
	}
		
	public static int pop() {
		int val=-1;
		if(!isEmpty()) {
			val = stack[noOfElements-1];
			stack[noOfElements-1]=-1;
			System.out.println("element returned=="+val);
			noOfElements--;
		}
		return val;
		
		
	}
  public static void display() {
	  for(int x=0;x<noOfElements;x++) {
		  System.out.println(stack[x]);
	  }
  }
  public static void fillTemp(int val,int index) {
	  tempStack[index]=val;
	  noOfTempElements++;
  }
  public static int getTopOfTempStack() {
	  
	  System.out.println(noOfTempElements);
	return tempStack[--noOfTempElements];
  }
	
}
