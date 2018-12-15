package DSA;

public class BubbleSort {

	public static void main(String[] args) {
		int data[]= {45,22,46,1,89,40,101,34,29,100};
		bubbleSort(data);

	}
	
	public static void bubbleSort(int []data) {
		for(int x=0;x<data.length;x++) {
			
			for(int j=x+1 ;j<data.length;j++) {
				if(data[x]>data[j]) {
					int val = data[x];
					data[x]=data[j];
					data[j]=val;
				}
			}
			
			
			
		}
		for(int z=0;z<data.length;z++) {
			System.out.println(z+"=="+data[z]);
		}
		
		
	}

}
