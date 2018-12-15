package DSA;

public class InsertionSort {

	public static void main(String[] args) {
		int data[]= {45,22,46,1,89,40,101,34,29,100};
		insertionSort(data);
	}
	
	public static void insertionSort(int data[]) {
		
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
		for(int z=0;z<data.length;z++) {
			System.out.println(z+"=="+data[z]);
		}
		
	}

}
