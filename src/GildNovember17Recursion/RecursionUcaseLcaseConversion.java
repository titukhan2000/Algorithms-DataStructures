package GildNovember17Recursion;

public class RecursionUcaseLcaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="aZxR";
		LcaseUcase(input.toCharArray(),0,input.length(), 0);
	}
	
	public static String LcaseUcase(char[] input,int startIndex,int endIndex, int loopCount){
		
		
		if(loopCount< input.length){
			
			if(startIndex<endIndex){
				String c = LcaseUcase(input,startIndex+1,endIndex,loopCount);
				if(Character.isLowerCase(input[startIndex])){
					c=c+Character.toUpperCase(input[startIndex]);
				}
				return c;
			} else{
				loopCount++;
				LcaseUcase(input,loopCount,endIndex,loopCount);
			}
			return "";
			
			
			
		}
		
		
			
	
		return "";
		
	}

}
