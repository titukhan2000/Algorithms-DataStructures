package StacksNQueues;

public class MyStringStack {

	String[] stringStack;
	int noOfElements=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public MyStringStack(int size) {
		stringStack=new String[size];
	}
	public  boolean isFull() {
		if(noOfElements==stringStack.length)
			return true;
		
		return false;
	}
	
	public  boolean isEmpty() {
		if(noOfElements==0)
			return true;
		return false;
	}
	
	public String peek() {
		String val="";
		if(noOfElements==stringStack.length) {
			System.out.println("peek"+stringStack[noOfElements-1]);
			return stringStack[noOfElements-1];
		}else {
			System.out.println("peek else"+ stringStack[noOfElements]);
			return stringStack[noOfElements];
		}
	}
	
	public  void push(String value) {
		if(!isFull()) {
			stringStack[noOfElements]=value;
			noOfElements++;
		}else {
			System.out.println("Stack is full");
		}
		
	}
	
	public String pop() {
		String val="";
		if(!isEmpty()) {
			val = stringStack[noOfElements-1];
			stringStack[noOfElements-1]="-1";
			System.out.println("element returned=="+val);
			noOfElements--;
		}
		return val;
	}
  public  void display() {
	  for(int x=0;x<noOfElements;x++) {
		  System.out.println(stringStack[x]);
	  }
  }


}
