package Gild;

public class MyBinarySearch {
	
	//Pivot is the center element
	//if search value is greater than pivot becomes start and array length is end
	//if search value is lesser than pivot start remains as such and pivot becomes end
	 
    public int binarySearch(int[] inputArr, int key) {
         System.out.println("called");
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;  //int mid =start+(end-start)/2 . same as other but used whne start+end/2 exceeds value int can hold
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
    public int RecursiveBinarySearch(int [] inputArr,int key,int start,int end){
    	
    	int pivot=start+(end-start)/2;
    	System.out.println(start+ "DDD"+end+"pivot"+pivot);
    	if(start>=end)
    		return -1;
    	
    	if(inputArr[pivot]==key)
    		return pivot;
    	
    	if(key <inputArr[pivot]){
    		end=pivot -1;
    		
    	}else{
    		start = pivot +1;
    	}
    	return RecursiveBinarySearch(inputArr,key,start,end);
    	
    	
    }
  
    public static void main(String[] args) {
         
        MyBinarySearch mbs = new MyBinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        //System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
        int[] arr1 = {6,34,78,123,432,900};
        //System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 4321));
        System.out.println("Key 432's position recurive: "+ mbs.RecursiveBinarySearch(arr1,4321,0,arr1.length));
    }
}
