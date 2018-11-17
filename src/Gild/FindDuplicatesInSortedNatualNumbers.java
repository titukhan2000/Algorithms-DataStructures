package Gild;
/**
 
 
 An Efficient Solution can find the required element in O(Log n) time. The idea is to use Binary Search. Below is an observation in input array.
 All elements before the required have first occurrence at even index (0, 2, ..) and next occurrence at odd index (1, 3, …). And all elements after the required element have first occurrence at odd index and next occurrence at even index.
1) Find the middle index, say ‘mid’.

2) If ‘mid’ is even, then compare arr[mid] and arr[mid + 1]. If both are same, then the required element after ‘mid’ else before mid.

3) If ‘mid’ is odd, then compare arr[mid] and arr[mid – 1]. If both are same, then the required element after ‘mid’ else before mid.

*/


public class FindDuplicatesInSortedNatualNumbers {
	public static void main(String args[]){
		
		FindDuplicatesInSortedNatualNumbers numbers=new FindDuplicatesInSortedNatualNumbers();
		
		int[] arr = {1, 1, 2,2, 4, 4, 5, 5, 6, 6,7,7,9}; 
       
		numbers.search(arr, 0, arr.length-1);

		

	}	 

public int search(int [] arr,int low,int high){
	int mid = (low + high)/2; 
	System.out.println("Low=="+low+"   High=="+high + "   mid="+mid);
	if(low > high) 
        return 0; 
    if(low == high) 
    { 
        System.out.println("The required element is "+arr[low]); 
        return 0; 
    } 
      
    // Find the middle point 
    
      
    // If mid is even and element next to mid is 
    // same as mid, then output element lies on 
    // right side, else on left side 
    if(mid % 2 == 0) 
    { 
        if(arr[mid] == arr[mid+1]) 
        	return search(arr, mid+2, high); 
        else
        	return search(arr, low, mid); 
    } 
    // If mid is odd 
    else if(mid % 2 == 1) 
    { 
        if(arr[mid] == arr[mid-1]) 
        	return search(arr, mid+1, high); 
        else
        	return search(arr, low, mid-1); 
    } 
    return-1;
}

}