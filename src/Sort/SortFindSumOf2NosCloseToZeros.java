package DSA;

public class SortFindSumOf2NosCloseToZeros {

	public static void main(String[] args) {
		//int data[]= {45,22,46,1,89,40,101,34,29,100};
		//int data[]= {24,36,3};
		//int data[]= {33};
		
		int data[]= {1,60,-10,70,-12,44,85,-80};
		
		data=insertionSort(data);
		
		for(int x=0;x<data.length;x++) {
			System.out.print(data[x]+",");
		}
		
		System.out.println("\n");
		findSumOf2NosCloseToZero(data);
		
	}
	public static void findSumOf2NosCloseToZero(int[] data) {
		
		int sum=0;
		
		if(data.length>=2) {
		
			  if(data[0]>=0) {
				
				sum=data[0]+data[1];
				System.out.println(data[0]+"+"+data[1]+"="+sum);
			  
			  }else {
				  sum=0;
				  int locn=0;
				 
				 for(int x=1;x<data.length;x++) {
					 
					 if(Math.abs(sum)>(data[0]+data[x])) {
						 sum=data[0]+data[x];
						 locn=x;
						 	
					}
					 
				 }
				 System.out.println(((data[0]+data[locn])));
				
			  }

		}else {
			
				System.out.println(data[0]);
			
				
		}
			
	}
		
	
	public static int[] insertionSort(int data[]) {
			
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
