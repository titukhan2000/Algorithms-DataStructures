package GildNovember17Recursion;

public class RecursionMinMaxElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int numbers[]={126,12345,11,33,890,22};
       System.out.println(findMinElement(numbers,0));
       System.out.println(findMaxElement(numbers,0));
	}
	
	public static int findMinElement(int[] numbers,int startIndex){
		if(startIndex>=numbers.length-1)
			return 0;
		
		int minVal = findMinElement(numbers,++startIndex);
		return numbers[startIndex] > minVal && minVal!=0 ? minVal : numbers[startIndex];
	}
	public static int findMaxElement(int[] numbers,int startIndex){
		if(startIndex>=numbers.length-1)
			return 0;
		
		int maxVal = findMinElement(numbers,++startIndex);
		return numbers[startIndex] > maxVal && maxVal!=0 ? numbers[startIndex] :maxVal;
	}

}
