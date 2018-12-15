package StacksNQueues;

public class StackStockSpan {
	static int[] data=new int[] {100,80,60,70,60,75,85,110};
	static int[] data1=new int[] {-1,-1,-1,-1,-1,-1,-1,-1};
	static int[] stack = new int[8];
	private static int top=-1;
	static int counter=0;
	public static void main(String[] args) {
		push(0);
		for(int x=1;x<data.length;x++) {
				while(!isEmpty() && data[peek()]<=data[x]) {
					  pop();
				}
				data1[counter]=!isEmpty()? x+1: (x-peek());
				counter++;
				push(x);
			
		}
			
		
		
		for(int j=0;j<data1.length;j++)
		       System.out.println("Stock value=="+data[j]+"Stock Count is"+data1[j]);
	}
	
	public static void push(int index) {
		stack[++top]=index;
	}
	public static int peek() {
		
		return stack[top];
		
	}
	public static int pop() {
		return stack[top--];
	}
	public static boolean isEmpty() {
		return top==-1;
	}
	

}
