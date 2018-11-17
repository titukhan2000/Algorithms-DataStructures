package Gild;

public class RecursivePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char arr[]={'m','a','a','m'};//,'d','a','m','e'};//,'a','l','i','m'};
		  char arr[]={'m','a','l','a','y','a','l','a','m'};
	    //char arr[]={'m','a','a','m'};
		//char arr[]={'l','i','r','i','l'};
		  System.out.println(isPalindrome(arr,0,arr.length-1));
	}
	
	public static int isPalindrome(char arr[],int start,int end){
		if(start==end || start > end)
			return 1;
		
		if(arr[start]==arr[end]){
			return isPalindrome(arr,start+1,end-1);
		}else
			return -1;
	}
}


