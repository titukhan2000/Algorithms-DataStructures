package StacksNQueues;

public class EnQueueDeQueue {
	
	static int front=-1;
	static int noOfElements=0;
	static int rear=-1;
	static final int SIZE=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data=new int[SIZE];
		
		for(int x=1;x<=SIZE;x++) {
			enQueue(data,(x*2));
		}
		displayQueue(data);
		deQueue(data);
		deQueue(data);
		deQueue(data);
		deQueue(data);
		deQueue(data);
		deQueue(data);
		deQueue(data);
		deQueue(data);
		deQueue(data);
		deQueue(data);
		System.out.println((rear+1)%SIZE);
		System.out.println(front);
		enQueue(data,30);
		System.out.println("After all Dequeue");
		displayQueue(data);
	}
	public static int enQueue(int[] queue,int data) {
	
		if(!isFull()) {
		
			if(front==-1)//when first element is added..increment front
				front=0;
			
			rear=(rear+1)%SIZE;
			queue[rear]=data;
			noOfElements++;
		}
		return -1;
	}
	public static int deQueue(int[] queue) {
		
		if(!isEmpty()) {
			noOfElements--;
			queue[noOfElements]=0;
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
	}
}
