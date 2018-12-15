package StacksNQueues;

import java.util.Iterator;
import java.util.Stack;

public class StackBalancedBracket {
 Stack<String> brackets=new Stack();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackBalancedBracket bracketMatching=new StackBalancedBracket();
		bracketMatching.populateStack();
		System.out.println(bracketMatching.areBracketsBalanced());

	}
	public  void populateStack() {
		brackets.push("{");
		brackets.push("{");
		brackets.push("[");
		brackets.push("[");
		brackets.push("(");
		brackets.push("(");
		brackets.push(")");
		brackets.push(")");
		brackets.push("]");
		brackets.push("]");
		brackets.push("}");
		brackets.push("}");
		
	}
	public boolean areBracketsBalanced() {
		boolean matched =false;
		Stack<String> tempStack=new Stack();
		String openBrackets="{[(";
		String closeBrackets=")}]";
		while(!brackets.isEmpty()) {
			String topValue=brackets.peek();
			if(openBrackets.indexOf(topValue)!=-1) {
				System.out.println("elements poped"+topValue);
				brackets.pop();
			}else {
				break;
			}
		}
		
		
		
		while(!brackets.isEmpty()) {
			String topValue=brackets.pop();
			
			
			if(closeBrackets.indexOf(topValue)!=-1 ) {
				System.out.println("Value being Pushed"+topValue);
				tempStack.push(topValue);
			}else {
				matched=false;
				
				System.out.println("Top Value"+topValue);
				if(topValue.equals("{")) {
					if("}".equals(tempStack.pop())) {
						matched=true;
					}
				}
				if(topValue.equals("(")) {
					if(")".equals(tempStack.pop())) {
						matched=true;
					}
				}
				if(topValue.equals("[")) {
					if("]".equals(tempStack.pop())) {
						matched=true;
					}
				}
				if(!matched) {
					break;
				}
			}
		}
			
		return matched;
	}

}
