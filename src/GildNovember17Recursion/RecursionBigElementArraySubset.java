package GildNovember17Recursion;

public class RecursionBigElementArraySubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={102,10,30,150,100,13,120,130};
		System.out.println(manipulate(input,5));
	}
	
	public static int manipulate(int[] input,int index){
		int x=0;
		if(index==1)
			return input[0];
		else
			x=manipulate(input,index-1);
	        if(x>input[index-1]){
	        	return x;
	        }else{
	        	return input[index-1];
	        }
	        	
	        		
	}

}
