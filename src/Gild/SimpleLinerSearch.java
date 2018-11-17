package Gild;

public class SimpleLinerSearch {
	//UnOrdered - We have to go through each element
	
	int searchArray[]= {11,12,233,44,145,690,97,90};
	public static void main(String[] args) {
		int searchArray1[]= {1,12,233,44,145,690,97,90};
		//System.out.println(new SimpleLinerSearch().findValue(19));
		System.out.println(new SimpleLinerSearch().findValueRecursively(searchArray1,90,0));
		
	}
	//General Way
	public int findValue(int value){
		for(int x=0;x<searchArray.length;x++){
			if(searchArray[x]==value){
				return x;
			}
		}
			return -1;
	}
	
	//Recursive way
	//Pass the whole bunch of data to the function and
	//each recursive call passws the new index but maintains
	//search value and search array constant.
	
	public int findValueRecursively(int searchArray1[],int value,int startValue){
		if(startValue>searchArray1.length){
			return -1;
		}
		
		if(searchArray1[startValue]==value){
			return startValue;
		}
	
			return findValueRecursively(searchArray1,value,(++startValue));
		
		
	
		
		
		
		
	}
	
	
	}


