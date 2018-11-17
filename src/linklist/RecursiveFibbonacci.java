package linklist;

public class RecursiveFibbonacci {
   
public static void main(String args[]){
	System.out.println(fibonacci(6));
}
public static int fibonacci(int number){
	System.out.println("Te number is"+number+"---");
	if(number == 1 || number==2)
	{ return number; } 
	return fibonacci(number-1) + fibonacci(number-2); //tail recursion }
}


public static int count(int number,boolean bool){
	System.out.println("Te number is"+number+"---"+bool);
	if(number == 1)
	{ return 1; } 
	return count(number-1, true) * number;
	}
}
