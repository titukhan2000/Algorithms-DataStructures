package Gild;

public class FindDuplicatedNumberInSortedOrder {
//With ARRAYS We should think how index of the elements relate to value
	// in the case sorted natural numbers arr[]={1(0),2(1),3(2),4(3),5(4),5(5),6(6),7(7),8,9,10,11,12} . So in this case we can split at pivot
	//check if pivot value is same as left or right. to decide if pivot is duplicated.
	//next check for the above case ..if index and value is same then duplicated value 
	//lies to the left else duplicate lies on the right. In teh above sequence
	//once a value is duplicated index and value becomes the same.
	
	public static void main(String[] args) {
		int searchArray[]= {11,12,13,14,15,19,20,21};
		int x=0;int t=0;
		for(int j=t;j<searchArray.length;j++){
			t=j+1;
			if(t>=searchArray.length)
				break;
			if(searchArray[j]==searchArray[t]){
				x=1;
				System.out.println(j+"And element"+(j+1));
				break;
			}
		}
		if(x==0)
		System.out.println("not found");

	}

}
