package GildNovember17Recursion;

public class RecursionIncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IncrementDecrement(16,16,5));
		System.out.println(IncrementDecrement(10,10,5));

	}
	public static String IncrementDecrement(int initialValue,int value, int factor){
		
		if(value > initialValue){
			 return "";
		}
		if(value<0)
			factor=factor*-1;
		
		String val = IncrementDecrement(initialValue,value-factor,factor);
		val=val+value;
		return val+"  ";
		
		
	}

}
