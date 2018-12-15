package StacksNQueues;

public class ImplementingStackUsingQueue {

	static int frontQ1=-1;
	static int frontQ2=-1;
	static int noOfElementsQ1=0;
	static int noOfElementsQ2=0;
	static int rearQ1=-1;
	static int rearQ2=-1;
	static final int SIZE=10;
	static int[] queue1=new int[SIZE];
	static int[] queue2=new int[SIZE];
	public static void main(String[] args) {
		
		
		for(int x=1;x<=SIZE;x++) {
			enQueue(queue1,(x*2),frontQ1,rearQ1,noOfElementsQ1);
		}
		
		displayQueue(queue1);
		
		deQueue(queue1);
		//deQueue(queue1);
		//deQueue(queue1);
		//displayQueue(queue1);
		//enQ,ueue(queue1,30*2,frontQ1,rearQ1);
		displayQueue(queue1);
		// TODO Auto-generated method stub

	}
	public static int enQueue(int[] queue,int data,int front,int rear,int noOfElements) {
		
		if(!isFull()) {
			System.out.println("Data Added"+data);
		
			if(frontQ1==-1)//when first element is added..increment front
				frontQ1=0;
			
			rearQ1=(rearQ1+1)%SIZE;
			queue1[rearQ1]=data;
			noOfElementsQ1++;
		}
		return -1;
	}
public static int enQueue2(int[] queue,int data,int front,int rear,int noOfElements) {
		
		if(!isFull2()) {
			System.out.println("Data Added"+data);
		
			if(frontQ2==-1)//when first element is added..increment front
				frontQ2=0;
			
			rearQ2=(rearQ2+1)%SIZE;
			queue2[rearQ2]=data;
			noOfElementsQ2++;
		}
		return -1;
	}
public static int deQueue2() {
	int val=0;
	 queue1=new int[SIZE];
	 frontQ1=-1;
	 rearQ1=-1;
	 noOfElementsQ1=0;
	while(!isEmpty2()) {
		noOfElementsQ2--;
		if(noOfElementsQ2==-1)
			break;
		val=queue2[noOfElementsQ2];
		queue1[noOfElementsQ2]=0;
		enQueue(queue1,val,frontQ1,rearQ1,noOfElementsQ1);
		frontQ2=(frontQ2+1)%SIZE;
	}
	
	if(frontQ2==rearQ2)
		frontQ2=rearQ2=-1;
	
	return -1;
}

	public static int deQueue(int[] queue) {
		int val=0;
		 queue2=new int[SIZE];
		 frontQ2=-1;
		 rearQ2=-1;
		 noOfElementsQ2=0;
		while(!isEmpty()) {
			noOfElementsQ1--;
			if(noOfElementsQ1==-1)
				break;
			val=queue1[noOfElementsQ1];
			queue1[noOfElementsQ1]=0;
			if(!isEmpty())
				enQueue2(queue2,val,frontQ2,rearQ2,noOfElementsQ2);
			else
				break;
			
			frontQ1=(frontQ1+1)%SIZE;
		}
		
		System.out.println("Value popped is"+val);
		

		if(frontQ1==rearQ1)
			frontQ1=rearQ1=-1;
	
		deQueue2();
		
		return -1;
	}
	public static boolean isEmpty() {
		if(frontQ1==-1)
			return true;
		return false;
	}
	public static boolean isEmpty2() {
		if(frontQ2==-1)
			return true;
		return false;
	}
	public static boolean isFull() {
		return ((rearQ1+1)%SIZE==frontQ1)?true:false;
	}
	public static boolean isFull2() {
		return ((rearQ2+1)%SIZE==frontQ2)?true:false;
	}
	public static int getNoOfElements(int[] queue) {
		int size=0;
		for(int x=0;x<SIZE;x++) {
			if(queue[x]!=0)
				size++;
		}
		return size;
	}
	public static void displayQueue(int queue[]) {
		for(int x=0;x<SIZE;x++) {
			System.out.println("Value At"+x+"::"+queue[x]);
		}
		System.out.println("***************************************************");
	}

}
