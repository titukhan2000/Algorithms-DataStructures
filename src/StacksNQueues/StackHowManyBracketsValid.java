package StacksNQueues;

public class StackHowManyBracketsValid {

	public static void main(String[] args) {
		String value="()(()))))";
		MyStringStack stack=new MyStringStack(value.length());
		populateBrackets(value,stack);
		isValidBracketString(stack);
		stack.display();
	}
	public static void populateBrackets(String value,MyStringStack stack) {
		for(int x=0;x<value.length();x++) {
			stack.push(value.charAt(x)+"");
		}
		
	}
	public static int isValidBracketString(MyStringStack stack) {
		int openingBracketCount=0;
		int closeBracketCount=0;
		
		while(!stack.isEmpty()) {
			if(stack.peek().equalsIgnoreCase("("))
				stack.pop();
			else
				break;
		}
		stack.display();
		while(!stack.isEmpty()) {
			
			String value= stack.pop();
			if(value.equalsIgnoreCase(")"))
				++closeBracketCount;
			else
				++openingBracketCount;
			
					
		}
				
		if(openingBracketCount==closeBracketCount)
			System.out.println("Valid String length=="+(openingBracketCount+closeBracketCount));
			
		if(openingBracketCount>closeBracketCount) {
			int extras=openingBracketCount-closeBracketCount;
			System.out.println("Valid String length=="+((openingBracketCount-extras)+closeBracketCount));
		}
		if(openingBracketCount<closeBracketCount) {
			int extras=closeBracketCount-openingBracketCount;
			System.out.println("Valid String length=="+(openingBracketCount+(closeBracketCount-extras)));
		}
		
		return -1;
	}

}
