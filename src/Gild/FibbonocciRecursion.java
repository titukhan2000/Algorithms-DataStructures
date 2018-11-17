package Gild;

public class FibbonocciRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibbo(5));
		
	}
	
	public static long fibbo(long n){
		if(n<=2)
			return 1 ;
		else
			return fibbo(n-1) + fibbo(n-2);
	}

}
