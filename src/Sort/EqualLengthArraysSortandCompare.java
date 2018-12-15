package DSA;

public class EqualLengthArraysSortandCompare {

	public static void main(String[] args) {
		int data[]  = {45,22,46,1,89,40,101,34,29,100};
		int data1[] = {46,34,45,101,22,40,1,89,29,100,13};
		int rtnValue=isArrayEqual(data,data1);
		
		if(rtnValue==1)
			System.out.println("Same");
		else
			System.out.println("Different");
	}
	
	public static int isArrayEqual(int data[],int data1[]) {
		
		if(data.length!=data1.length) {
			return 0;
		}
		
		int sortedData[]=insertionSort(data);
		int sortedData1[]=insertionSort(data1);
	    
		int equal=1;
		for(int x=0;x<sortedData.length;x++) {
			
			if(sortedData[x]!=sortedData1[x]) {
				equal=0;
				break;
			}
		}
		
		
		return equal;
		
	}
	
	public static int[] insertionSort(int[] data) {
		for(int x=0;x<data.length;x++) {
			int val = data[x];
			int temp=val;
			int locn=x;
			for(int j=x+1;j<data.length;j++) {
				
				if(temp>data[j]) {
					temp=data[j];
					locn=j;
				}
				
			}
			
			data[x]=temp;
			data[locn]=val;
			
			
		}
		return data;	
	}
	

}
