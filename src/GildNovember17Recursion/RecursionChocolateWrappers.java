package GildNovember17Recursion;

public class RecursionChocolateWrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalNoOfChocolates(8,8));

	}
	public static int totalNoOfChocolates(int totalChocolates,int totalWrappers){
		
		int extraChocolates=0;
		
		if(totalWrappers < 2){
			return totalChocolates;
		}
		if(totalWrappers>=2){
			
			extraChocolates= (totalWrappers/2);
		}
		int count=totalNoOfChocolates(extraChocolates,totalWrappers/2);
		count=count+totalChocolates;
		return count;
	}

}
