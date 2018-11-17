package Gild;

public class RecursiveNumberPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printValue(25,5,(25));
	}
	
	public static int printValue(int highValue,int increment,int nextValue){
		
		
		if(nextValue<=highValue)
			System.out.println(nextValue);
			
			if(nextValue<0)
				increment = increment*-1;
			
			if(nextValue<=highValue)
		    printValue(highValue,increment,(nextValue-(increment)));

		    
			return nextValue;
			
			}

		}
		
		
	


