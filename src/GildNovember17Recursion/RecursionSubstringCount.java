package GildNovember17Recursion;

public class RecursionSubstringCount {
    static int count=0;
	public static void main(String ark[]){
		String value= "abcabc";
		System.out.println(findSubstring(value,0,1));
	}
	
	public static int findSubstring(String str,int startIndex,int endIndex){
		
		 if(endIndex>str.length()) {
		        findSubstring(str,++startIndex,startIndex+1);
		    }
		    else {
		    	String temp =str.substring(startIndex,endIndex);
		    	
		    	if((temp.charAt(0)==temp.charAt(temp.length()-1)) && temp.length()>1){
		    		System.out.println(temp+ "=="+temp.charAt(0)+"   --- "+temp.charAt(temp.length()-1));
		    		count++;
		    	}
		        
		    }
		    if((startIndex+1)==str.length()) {

		    } 
		    else {
		    	findSubstring(str,startIndex,endIndex+1);
		    }
		    
		    return count;
	}
}

