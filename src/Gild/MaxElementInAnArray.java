package Gild;

public class MaxElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
		int arr1[]={1, 3, 50, 10, 9, 7, 6};
		int arr2[]={10,20,30,40,50};
		int arr3[]={120,100,80,20,0};
		getMaxElement(arr,0,arr.length-1);
		getMaxElement(arr1,0,arr1.length-1);
		getMaxElement(arr2,0,arr2.length-1);
		getMaxElement(arr3,0,arr3.length-1);
		
	}
	public static int getMaxElement(int arr[],int start,int end){
		
		if(start>end)
			return -1;
		if(start==end){
			System.out.println("value is "+arr[end]);
			return 1;
		}
		int mid = (end+start)/2;
		
		if(arr[mid]>arr[mid+1]){
			return getMaxElement(arr,start,mid);
		}else{
			return getMaxElement(arr,mid+1,end);
		}
		
		
	}
}
