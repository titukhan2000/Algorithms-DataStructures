package DSA;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[]= {1,1,2,2,3,3,3,4,5,6,7,7,8,10};
		removeDuplicates(data);
		
		
	}
	public static void removeDuplicates(int[] data) {
		for(int x=0;x<data.length;x++) {
			int val =data[x];
			int counter=0;
			int locn=0;
			if(val< data[data.length-1]) {
			for(int j=x+1;j<data.length;j++) {
				System.out.println(x+"=="+x+"Locn=="+locn);
				if(val==data[j] ) {
					counter++;
					if(counter==1) {
						locn=j;
					}
					
				}else {
					
					if(locn>0 ) {
						data[locn]=data[j];
						x=0;
						break;
					}
				}
				
			}
			}
			for(int z=0;z<data.length;z++) {
				System.out.print(z+"=="+data[z]+",");
			}
			System.out.println();
			
			
		}
		
	}
}
