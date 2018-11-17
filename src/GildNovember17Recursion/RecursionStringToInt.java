package GildNovember17Recursion;

public class RecursionStringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] val={'1','2','3','4'};
		System.out.println(convertStringToInt(val,val.length,1));
	}
	
	public static int convertStringToInt(char[] string,int startIndex,int multiplicationFactor){
		
		if(startIndex<0)
			return 0;
		 
	    int str=convertStringToInt(string,--startIndex,multiplicationFactor*10);
	    if(startIndex>=0)
			str = str + Character.getNumericValue(string[startIndex])*multiplicationFactor;
	  
		
		return str;
	}

}
