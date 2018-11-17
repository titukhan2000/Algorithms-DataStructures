package GildNovember17Recursion;

public class RecursionFindConsonantCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alphabets[]={'a','b','c','d','e','f','g','h','t'};
		System.out.println(findConsonants(alphabets,0));

	}
	
	public static int findConsonants(char[] arr,int startIndex){
		
		if(startIndex>arr.length-1)
			return 0;
		
		int count =findConsonants(arr,startIndex+1);
		
		if(Character.toUpperCase(arr[startIndex])!= 'A' && Character.toUpperCase(arr[startIndex])!= 'E' 
				&& Character.toUpperCase(arr[startIndex])!= 'I' && Character.toUpperCase(arr[startIndex])!= '0'
				&& Character.toUpperCase(arr[startIndex])!= 'U'){
			
			count++;
		}
		return count;
	}

}
