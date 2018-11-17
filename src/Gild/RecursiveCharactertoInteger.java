package Gild;

public class RecursiveCharactertoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]={'1','2','3','4','5'};
		System.out.print(ASCIItoInt(arr,arr.length-1,1));

	}
	
	public static long ASCIItoInt(char arr[],int index,int multiplyFactor){
		
		if(index<0)
			return 1;
		
		System.out.println(arr[index]);
	    
	 long x=ASCIItoInt(arr,--index,multiplyFactor*10);
		x=arr[index];
		return  (x * multiplyFactor);
		
		
		
	}

}
