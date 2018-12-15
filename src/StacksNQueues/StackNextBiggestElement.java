package StacksNQueues;

public class StackNextBiggestElement {
	static int[] data=new int[] {4,5,2,25};
	static int[] data1=new int[] {-1,-1,-1,-1};
	static int[] stack = new int[4];
	private static int top=-1;
	public static void main(String[] args) {
		push(0);
		for(int x=1;x<data.length;x++) {
			while(!isEmpty() && data[peek()]< data[x]) {
				data1[pop()]=data[x];
				System.out.println("data1::"+ data[x]);
				
			}
			push(x);
		}
		
		for(int j=0;j<data1.length;j++)
		       System.out.println(data1[j]);
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
