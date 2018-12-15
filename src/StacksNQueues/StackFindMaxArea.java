package StacksNQueues;

import java.util.Stack;

public class StackFindMaxArea {
	
	static int[] data=new int[8];
	static Stack<Integer> stack=new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeData();
		findMaxArea();
	}
	public static void initializeData() {
		data[0]=2;
		data[1]=6;
		data[2]=8;
		data[3]=10;
		data[4]=3;
		data[5]=5;
		data[6]=3;
		data[7]=7;
	}
	public static void findMaxArea() {
		stack.push(0);
		int maxArea=0;
		boolean isElseExecuted=false;
		for(int x=1;x<data.length;x++) {
			if(data[x] >= data[stack.peek()])
				stack.push(x);
			else {								
		
					while(!stack.isEmpty() && data[x]<=data[stack.peek()]) {
						int index=stack.pop();
						isElseExecuted=true;
						
						if(maxArea<=(data[index]*(x-index)))
							maxArea=data[index]*(x-index);
					
					}
			}
		}
		while(!stack.isEmpty()) {
			int index=stack.pop();
			isElseExecuted=true;
			if(maxArea<=(data[index]*(data.length-index)))
					maxArea=data[index]*(data.length-index);
			}
		System.out.println("The max area is"+maxArea);	
	}
	
}
