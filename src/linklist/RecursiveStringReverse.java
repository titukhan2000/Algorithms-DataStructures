package linklist;

public class RecursiveStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//original string
        String str = "Sony";


        String reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);
        
        int factorial= factorialRecursively(5);

        System.out.println("Factorial ="+factorial);


	}
	
	public static int factorialRecursively(int n){
		
		if(n==0)
			return 1;
		
		return factorialRecursively(n-1)*n;
	}
	public static String reverseRecursively(String str) {

		
		System.out.println("Value of str is"+str);
        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }



}
