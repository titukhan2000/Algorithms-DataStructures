package StacksNQueues;

public class QueueExercise {
	
	static int front=-1;
	static int noOfElements=0;
	static int rear=-1;
	static final int SIZE=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data=new int[SIZE];
		String[] binaries=new String[SIZE];
		for(int x=0;x<SIZE;x++) {
			data[x]=-1;
		}
		
		int counter=1;
		enQueue(binaries,Integer.toBinaryString(counter));
		boolean flag=true;
		while(counter<5) {
			enQueue(binaries,Integer.toBinaryString(++counter));
			enQueue(binaries,Integer.toBinaryString(++counter));
			deQueue(binaries);
			
			
		}
		
		displayQueue(binaries);
	}
	
	public static int enQueue(String[] queue,String data) {
	
		if(!isFull()) {
		
			if(front==-1)//when first element is added..increment front
				front=0;
			
			rear=(rear+1)%SIZE;
			queue[rear]=data;
			noOfElements++;
		}
		return -1;
	}
	public static int deQueue(String[] queue) {
		
		
		if(!isEmpty()) {
			if(noOfElements==0)
				queue[noOfElements]="-1";
			else
				System.out.println(queue[front]);
				queue[front]="-1";
				noOfElements--;
			
			
			front=(front+1)%SIZE;
		}

		if(front==rear)
			front=rear=-1;
		
		return -1;
	}
	public static boolean isEmpty() {
		if(front==-1)
			return true;
		return false;
	}
	public static boolean isFull() {
		return ((rear+1)%SIZE==front)?true:false;
	}
	
	public static void displayQueue(String queue[]) {
		for(int x=0;x<SIZE;x++) {
			if(null!=queue[x])
				System.out.print(queue[x]+",");
		}
	}
}
