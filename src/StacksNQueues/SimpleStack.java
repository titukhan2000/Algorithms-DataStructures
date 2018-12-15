package StacksNQueues;

public class SimpleStack {
	public static int[] stack=new int[10];
	public static int noOfElements=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int x=0;x<10;x++)
			push(x*2);
		display();
		pop();
		pop();
		display();
		push(10*2);
		push(10*3);
		peek();
		push(10*4);
		pop();
		display();
		push(10*4);
		display();
		peek();*/
	}
	public SimpleStack(int size) {
		stack=new int[size];
		
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
	
	public static void pop() {
		if(!isEmpty()) {
			int val = stack[noOfElements-1];
			stack[noOfElements-1]=-1;
			System.out.println("element returned=="+val);
			noOfElements--;
		}
	}
  public static void display() {
	  for(int x=0;x<noOfElements;x++) {
		  System.out.println(stack[x]);
	  }
  }
}
