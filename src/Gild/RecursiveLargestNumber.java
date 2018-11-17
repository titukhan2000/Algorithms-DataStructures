package Gild;

public class RecursiveLargestNumber {

	public static void main(String[] args) {
		int ar[]={8,1,7,210,4,12,67,22,89,13,40,23,101};
		System.out.println(findLargest(ar,0,0));
		System.out.println(findMax(ar,0,ar.length-1));
	}
	
	public static int findLargest(int ar[],int index1,int largestElement){
		
		if(index1 >=ar.length)
			return largestElement;
		if(ar[index1]>largestElement){
			largestElement=ar[index1];
			return findLargest(ar,index1+1,largestElement);
		}else{
			return findLargest(ar,index1+1,largestElement);
		}
			
		
	}
	
	public static int findMax(int ar[],int index,int len){
		if(index>=len)
			return -1;
		int max= findMax(ar,index+1,len);
		return ar[index]>max ? ar[index]:max;
	}

}
